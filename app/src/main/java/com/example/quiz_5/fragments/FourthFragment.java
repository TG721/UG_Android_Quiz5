package com.example.quiz_5.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quiz_5.R;
import com.example.quiz_5.databinding.FragmentFourthBinding;

public class FourthFragment extends Fragment {

    FragmentFourthBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFourthBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}