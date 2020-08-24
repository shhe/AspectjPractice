package com.aspectj.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.aspectj.annotation.AspectLog;
import com.aspectj.libmodule.LibActivity;
import com.aspectj.practice.dto.MemberDto;
import com.aspectj.practice.framework.interfaces.FundamentalOperations;
import com.aspectj.practice.framework.interfaces.User;
import com.aspectj.practice.imp.FundamentalOperationsImpl;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
        findViewById(R.id.tv_launch).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_initialization).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_field).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_constructor).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_handler).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_handler_exception).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_get_argv).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_get_this).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_annotation).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_target).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_cflow).setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_initialization:
                    com.aspectj.libmodule.imp.FundamentalOperationsImpl operationsImpl = new com.aspectj.libmodule.imp.FundamentalOperationsImpl();
                    break;
                case R.id.tv_launch:
                    LibActivity.launch(MainActivity.this);
                    break;
                case R.id.tv_field:
                    MemberDto memberDto = new MemberDto();
                    memberDto.setUserName("LiMing");
                    Log.i(TAG, "username: "+memberDto.getUserName());
                    break;
                case R.id.tv_constructor:
                    MemberDto memberDto1 = new MemberDto();
                    break;
                case R.id.tv_handler:
                    try {
                        mUser.add(-1);
                    } catch (IllegalArgumentException e) {
                        Log.e(TAG, e.toString());
                    }
                    break;
                case R.id.tv_handler_exception:
                    testException();
                    break;
                case R.id.tv_get_argv:
                    testPassParam(12);
                    break;
                case R.id.tv_get_this:
                    testThis();
                    break;
                case R.id.tv_annotation:
                    testAnnotation();
                    break;
                case R.id.tv_target:
                    FundamentalOperations operations = new FundamentalOperationsImpl();
                    operations.add(2, 3);
                    break;
                case R.id.tv_cflow:
                    FundamentalOperations operations1 = new FundamentalOperationsImpl();
                    operations1.sub(2, 3);
                    break;
                default:
                    break;
            }
        }
    };

    @AspectLog(note = "testAnnotation")
    private void testAnnotation() {

    }

    private void testThis() {
        User user = new User() {
            @Override
            public int add(int userId) {
                return 0;
            }

            @Override
            public <T> T sub(T param) {
                return param;
            }

            @Override
            public void update() {

            }

            @Override
            public void delete() {

            }
        };
        user.add(34);
    }

    private void testException() {
        try {
            throw new IllegalStateException("....");
        } catch (IllegalStateException e) {
            Log.e(TAG, e.toString());
        }
    }

    private void testPassParam(int position) {

    }

    private void test() {
        mUser = new User() {
            @Override
            public int add(int userId) {
                if (userId == -1) {
                    throw new IllegalArgumentException(" test ");
                }
                return 1;
            }

            @Override
            public <T> T sub(T param) {
                return param;
            }

            @Override
            public void update() {

            }

            @Override
            public void delete() {

            }
        };

        Log.i(TAG, "add status: "+mUser.add(2));
    }
}