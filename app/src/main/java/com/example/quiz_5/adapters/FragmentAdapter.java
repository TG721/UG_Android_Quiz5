package com.example.quiz_5.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.quiz_5.fragments.FifthFragment;
import com.example.quiz_5.fragments.FirstFragment;
import com.example.quiz_5.fragments.FourthFragment;
import com.example.quiz_5.fragments.SecondFragment;
import com.example.quiz_5.fragments.ThirdFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new FirstFragment();
            case 1: return new SecondFragment();
            case 2: return new ThirdFragment();
            case 3: return new FourthFragment();
            default: return new FifthFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
