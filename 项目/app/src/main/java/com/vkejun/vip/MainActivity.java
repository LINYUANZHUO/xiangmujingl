package com.vkejun.vip;
import android.support.v7.app.AppCompatActivity;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.vkejun.vip.fragment.F1;
import com.vkejun.vip.fragment.F2;
import com.vkejun.vip.fragment.F3;
import android.os.Bundle;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener{
    private BottomNavigationBar bottomNavigationBar;
    private F1 f1q;
    private F2 f2q;
    private F3 f3q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomNavBar();
        initTab();
        bottomNavigationBar.setTabSelectedListener(this);
    }


    private void initBottomNavBar(){
        /*1.首先进行fvb*/
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_nav_bar);
        /*2.进行必要的设置*/
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);//适应大小
        bottomNavigationBar.setBarBackgroundColor(R.color.di)  //背景
            .setActiveColor(R.color.xx)  //选中
            .setInActiveColor(R.color.ww);  //未选中


        /*3.添加Tab*/
        bottomNavigationBar
            .addItem(new BottomNavigationItem(R.drawable.home,R.string.f1))
            .addItem(new BottomNavigationItem(R.drawable.gj,R.string.f2))
            .addItem(new BottomNavigationItem(R.drawable.my,R.string.f3))
            .setFirstSelectedPosition(0)//默认显示面板
            .initialise();
    }


    private void initTab(){
        f1q = new F1();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_content,f1q);
        transaction.commit();
    }

    @Override
    public void onTabSelected(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (position){
            case 0:
                if(f1q== null){
                    f1q= new F1();
                }

                transaction.replace(R.id.frame_content,f1q);
                break;
            case 1:
                if(f2q == null){
                    f2q = new F2();
                }                transaction.replace(R.id.frame_content,f2q);
                break;
            case 2:
                if(f3q == null){
                    f3q = new F3();
                }
                transaction.replace(R.id.frame_content,f3q);
                break;
        }
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
