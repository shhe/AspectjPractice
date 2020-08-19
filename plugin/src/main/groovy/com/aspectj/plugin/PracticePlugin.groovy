package com.aspectj.plugin

import org.aspectj.bridge.IMessage
import org.aspectj.bridge.MessageHandler
import org.aspectj.tools.ajc.Main
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile

import com.android.build.gradle.AppPlugin
import com.android.build.gradle.LibraryPlugin

public class PracticePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        def hasApp = project.plugins.withType(AppPlugin)
        def hasLib = project.plugins.withType(LibraryPlugin)

        if (!hasApp && !hasLib) {
            throw new IllegalStateException("'android' or 'android-library' plugin required.")
        }

        project.extensions.create('aspectJPlugin', PluginExtention)

        final def log = project.logger

        project.dependencies {
            implementation 'org.aspectj:aspectjrt:1.9.1'
        }

        def variants
        if (hasApp) {
            variants = project.android.applicationVariants
        } else {
            variants = project.android.libraryVariants
        }

        project.afterEvaluate {
            variants.all { variant ->

                println("22222222 " + project.name + " 22222 "+variant.name.capitalize())

                if (!project.aspectJPlugin.enable) {
                    return
                }
                println("33333333 " + project.name + " 33333 "+variant.name.capitalize())


                JavaCompile javaCompile = variant.javaCompile

                javaCompile.doLast {
                    String[] args = [
                            "-showWeaveInfo",
                            "-1.7",
                            "-inpath", javaCompile.destinationDir.toString(),
                            "-aspectpath", javaCompile.classpath.asPath,
                            "-d", javaCompile.destinationDir.toString(),
                            "-classpath", javaCompile.classpath.asPath,
                            "-bootclasspath", project.android.bootClasspath.join(File.pathSeparator)
                    ]

                    MessageHandler handler = new MessageHandler(true);
                    new Main().run(args, handler);

                    for (IMessage message : handler.getMessages(null, true)) {
                        switch (message.getKind()) {
                            case IMessage.ABORT:
                            case IMessage.ERROR:
                            case IMessage.FAIL:
                                log.error message.message, message.thrown
                                break;
                            case IMessage.WARNING:
                                log.warn message.message, message.thrown
                                break;
                            case IMessage.INFO:
                                log.info message.message, message.thrown
                                break;
                            case IMessage.DEBUG:
                                log.debug message.message, message.thrown
                                break;
                        }
                    }
                }
            }
        }
    }
}