package com.aspectj.libmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aspectj.annotation.Page;
import com.aspectj.libmodule.imp.UserImp;
import com.aspectj.practice.framework.interfaces.User;

/**
 * @author shhe
 * @Date 2020/8/13 下午4:07
 * @Description:
 */
@Page(name = "课程详情页")
public class LibActivity extends AppCompatActivity {

    public static void launch(Context context) {
        Intent intent = new Intent(context, LibActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity);
        findViewById(R.id.tv_get_annotation_value).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_param_passing).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_param_T).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_if).setOnClickListener(mOnClickListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.tv_get_annotation_value) {
                ComputeOption option = new ComputeOption();
                option.add(2, 3);

                UserImp user = new UserImp();
                user.addAttribute(1);
            } else if (v.getId() == R.id.tv_param_passing) {
                User user = new UserImp();
                user.add(10000);
            } else if (v.getId() == R.id.tv_param_T) {
                User user = new UserImp();
                user.sub(5l);
            } else if (v.getId() == R.id.tv_if) {
                User user = new UserImp();
                user.add(10000);
            }
        }
    };
}
