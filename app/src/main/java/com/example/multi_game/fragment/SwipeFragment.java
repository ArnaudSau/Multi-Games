package com.example.multi_game.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.multi_game.R;
import com.example.multi_game.databinding.FragmentSwipeBinding;

public class SwipeFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSwipeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_swipe,container,false);
        return binding.getRoot();
    }
}
