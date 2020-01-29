package com.vkejun.vip.activity;

import android.app.Activity;
import android.os.Bundle;
import com.vkejun.vip.R;
import com.vkejun.vip.utils.StatusBarUtils;

public class SettingActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        
        //调用设置状态栏颜色
        StatusBarUtils.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
        //图片置顶
        //StatusBarUtils.setTransparent(this);
    }
}
