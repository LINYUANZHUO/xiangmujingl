package com.vkejun.vip.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.vkejun.vip.R;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

public class F3 extends Fragment
{

    private Toolbar toolbar;
    @Override
    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
        return paramLayoutInflater.inflate(R.layout.f_3, paramViewGroup, false);
    }

    @Override
    public void onActivityCreated(Bundle paramBundle)
    {
        super.onActivityCreated(paramBundle);
        this.toolbar = ((Toolbar)getActivity().findViewById(R.id.activitymainToolbar1));
        this.toolbar.setTitle("我的");
        setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).setSupportActionBar(this.toolbar);

    }

}
