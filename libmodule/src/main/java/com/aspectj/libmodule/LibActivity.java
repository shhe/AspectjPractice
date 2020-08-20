package com.aspectj.libmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aspectj.annotation.Page;
import com.aspectj.libmodule.imp.UserImp;

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
            }
        }
    };
}
