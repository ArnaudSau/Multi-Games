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
import com.example.multi_game.databinding.FragmentResultatBinding;
import com.example.multi_game.databinding.FragmentSettingsBinding;

public class ResultatFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentResultatBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_resultat, container, false);
        return binding.getRoot();
    }
}
