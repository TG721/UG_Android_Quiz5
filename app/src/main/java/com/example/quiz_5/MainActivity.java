package com.example.quiz_5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.quiz_5.adapters.FragmentAdapter;
import com.example.quiz_5.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        setupTabLayout();
    }

    private void setupTabLayout() {
        ViewPager2 viewPager2 = activityMainBinding.viewPager;
        TabLayout tabLayout = activityMainBinding.tabLayout;

        viewPager2.setAdapter(new FragmentAdapter(this));

        //connect TabLayout with ViewPager2
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("First").setIcon(R.drawable.one);
                            break;
                        case 1:
                            tab.setText("Second").setIcon(R.drawable.two);
                            break;
                        case 2:
                            tab.setText("Third").setIcon(R.drawable.three);
                            break;
                        case 3:
                            tab.setText("Fourth").setIcon(R.drawable.four);
                            break;
                        case 4: tab.setText("Fifth").setIcon(R.drawable.five);
                    }
                }).attach();

    }
}