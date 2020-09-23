package com.example.homework10;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> frgList = new ArrayList<>();
    private final List<String> titleList = new ArrayList<>();

    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
       Fragment fragment=null;
       if(position==0) {
           fragment = new doingFragment();
       }
       else if (position==1){
           fragment=new doingFragment();
       }
       else {
           fragment=new TodoFragment();
       }
       return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
