package com.aspectj.libmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.aspectj.annotation.Page;

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
        findViewById(R.id.tv_execute).setOnClickListener(mOnClickListener);
        testLibActivity();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void testLibActivity() {

    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.tv_execute) {
                ComputeOption option = new ComputeOption();
                option.add(2, 3);
            }
        }
    };
}
