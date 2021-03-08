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
import com.example.multi_game.activity.MainActivity;
import com.example.multi_game.databinding.ActivityMainBinding;
import com.example.multi_game.databinding.FragmentFastTapBinding;
import com.example.multi_game.utils.ActivityUtils;

public class FastTapFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentFastTapBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_fast_tap,container,false);

        binding.commencerFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.addFragmentToActivity(FastTapFragment.this, new FastTapGameFragment(), R.id.container_fast_tap);
            }
        });

        return binding.getRoot();
    }




}
