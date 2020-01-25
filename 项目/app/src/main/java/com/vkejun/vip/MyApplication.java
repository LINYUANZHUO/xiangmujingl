package com.vkejun.vip;

import android.app.Application;
import cn.bmob.v3.Bmob;

public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, "bea552b8866c81213fc45126b4fcd1ff");
        //Bmob.initialize(this, new String(Base64.decode(new String(Base64.decode("TlRVMFpUbGpaR0ZoWTJVNVlXVTNOMlU0WlRBMk9ERTVNekZoWTJJeU5tVT0K".getBytes(), 0)).getBytes(), 0)));
        //Bugly.init(getApplicationContext(), "3222489be8", false);
    }
}
