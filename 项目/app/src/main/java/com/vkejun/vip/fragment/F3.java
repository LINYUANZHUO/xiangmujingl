package com.vkejun.vip.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkejun.vip.R;
import com.vkejun.vip.activity.SettingActivity;
import com.vkejun.vip.activity.ThemeActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

public class F3 extends Fragment
{

    private Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.f_3, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        this.toolbar = ((Toolbar)getActivity().findViewById(R.id.activitymainToolbar1));
        this.toolbar.setTitle("我的");
        setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).setSupportActionBar(this.toolbar);
        
        //创建布局后，这里写代码逻辑

//        ImageView i1=(ImageView)getActivity().findViewById(R.id.fragment_mydataImageView);
//        Button b1=(Button)getActivity().findViewById(R.id.fragment_mydataButton);
//        LinearLayout l1=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout1);
        LinearLayout l4=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout4);
        LinearLayout l5=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout5);//声明实例
        //注意getActivity()方法
/*        i1.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View p1){
                    //你要的跳转设置的点击事件
                    Intent qs = new Intent(getActivity(),
                                           LoginActivity.class);//这个就是意图
                    getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
                    overridePendingTransition(R.anim.jump_enter_anim, R.anim.jump_exit_anim);
                }

                private void overridePendingTransition(int jump_enter_anim, int jump_exit_anim)
                {
                    // TODO: Implement this method
                }});
        b1.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View p1){
                    //你要的跳转设置的点击事件
                    Intent qs = new Intent(getActivity(),
                                           MyDataActivity.class);//这个就是意图
                    getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
                }});
        l1.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View p1){
                    //你要的跳转设置的点击事件
                    Intent qs = new Intent(getActivity(),
                                           SpecialTabActivity.class);//这个就是意图
                    getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
                }});*/
        l4.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View p1){
                    //你要的跳转设置的点击事件
                    Intent qs = new Intent(getActivity(),
                                           ThemeActivity.class);//这个就是意图
                    getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
                }});
        l5.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View p1){
                    //你要的跳转设置的点击事件
                    Intent qs = new Intent(getActivity(),
                                           SettingActivity.class);//这个就是意图
                    getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
                }});
        //剩下有啥需要改的，自己改对应名字就OK
    }
}
