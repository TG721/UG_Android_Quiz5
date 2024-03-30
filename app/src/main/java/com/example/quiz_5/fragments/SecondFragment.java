package com.example.quiz_5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.quiz_5.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout and initialize the binding object
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        // Return the root view of the binding object
        return binding.getRoot();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Set the binding object to null to avoid memory leaks
        binding = null;
    }

}