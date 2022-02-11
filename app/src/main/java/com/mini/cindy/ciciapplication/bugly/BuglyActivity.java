package com.mini.cindy.ciciapplication.bugly;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mini.cindy.ciciapplication.R;
import com.tencent.bugly.crashreport.CrashReport;

import androidx.appcompat.app.AppCompatActivity;


/**
 * 简单测试crash
 * 注：如想查看crash日志，需先到http://bugly.qq.com/注册app，并配置appID，之后就可以在bugly查看到日志啦
 * @author cici
 * @date 2021/1/17
 */
public class BuglyActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTestJavaCrash;
    private Button btnTestANRCrash;
    private Button btnTestNativeCrash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bugly);

        btnTestJavaCrash = (Button) findViewById(R.id.btnTestJavaCrash);
        btnTestANRCrash = (Button) findViewById(R.id.btnTestANRCrash);
        btnTestNativeCrash = (Button)findViewById(R.id.btnTestNativeCrash);
        btnTestJavaCrash.setOnClickListener(this);
        btnTestANRCrash.setOnClickListener(this);
        btnTestNativeCrash.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTestJavaCrash: // 点击测试Java Crash
                CrashMock.mockJavaCrash();
                break;
            case R.id.btnTestANRCrash: // 点击测试ANR Crash
                CrashReport.testANRCrash();
                break;
            case R.id.btnTestNativeCrash: // 点击测试Native Crash
                CrashReport.testNativeCrash();
                break;
        }
    }
}
