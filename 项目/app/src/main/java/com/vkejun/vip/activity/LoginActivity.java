package com.vkejun.vip.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.vkejun.vip.R;
import android.view.View;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    
    public void zhaohuimima(View view) {
        //找回密码点击事件
        //startActivity(new Intent(denglu.this, zhaohuimima.class));//转跳到找回密码界面
        // overridePendingTransition(R.anim.hengru, R.anim.hengchu);//动画
        //  Toasty.error(this, "wtf？\n绕了一圈，居然没有发现红色管理员，该服务器密码信息是由由红色管理员加密处理的\n很抱歉，请联系开发者提供邮箱重置密码!", Toast.LENGTH_LONG, true).show();
    }

    public void zhuche(View view) {
        startActivity(new Intent(this, LoginZCActivity.class));//转跳到注册界面

    }
}
