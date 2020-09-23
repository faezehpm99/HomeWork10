package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class viewPagerActivity extends AppCompatActivity {

    TabLayout tbLayout;
    ViewPager vPager;
   viewPagerAdapter adaptedr;
   private FloatingActionButton mFloatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        vPager = findViewById(R.id.view_pager);
        mFloatingActionButton=findViewById(R.id.fbtn);
        tbLayout = findViewById(R.id.tab_layout);
        adaptedr=new viewPagerAdapter(getSupportFragmentManager());
        vPager.setAdapter(adaptedr);




    }
}
