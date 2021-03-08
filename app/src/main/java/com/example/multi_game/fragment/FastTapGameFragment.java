package com.example.multi_game.fragment;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.multi_game.R;
import com.example.multi_game.databinding.FragmentFastTapGameBinding;
import com.example.multi_game.databinding.FragmentIpacBinding;

public class FastTapGameFragment extends Fragment {

    private static final int START_TIME = 20;
    private int currentTime = START_TIME;

    private static final int START_SCORE = 0;
    private int currentScore= START_SCORE;

    private boolean isLongTap;
    private boolean endGame = false;

    private FragmentFastTapGameBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_fast_tap_game,container,false);

        new CountDownTimer(20000, 1000){
            public void onTick(long millisUntilFinished){
                binding.timeLeft.setText(getString(R.string.time_left,currentTime));
                currentTime--;
            }
            public  void onFinish(){
                binding.timeLeft.setText("FINISH!!");
                endGame = true;
            }
        }.start();

        binding.timeLeft.setText(getString(R.string.time_left,currentTime));
        binding.score.setText(getString(R.string.score,currentScore));

        if(Math.random() > 0.5){
            binding.typeOfTap.setText("TAP");
            isLongTap=false;
        }else{
            binding.typeOfTap.setText("LONG TAP");
            isLongTap=true;
        }

        binding.fastTapGame.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(!endGame){
                if (isLongTap) {
                    currentScore++;
                    changeTap();
                }
                binding.score.setText(getString(R.string.score,currentScore));
                }
                return true;

            }
        });

        binding.fastTapGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!endGame) {
                    if (!isLongTap) {
                        currentScore++;
                        changeTap();
                    }
                    binding.score.setText(getString(R.string.score, currentScore));
                }
            }
        });

        return binding.getRoot();
    }
    public void changeTap(){
        if(Math.random() > 0.5){
            binding.typeOfTap.setText("TAP");
            isLongTap=false;
        }else{
            binding.typeOfTap.setText("LONG TAP");
            isLongTap=true;
        }
    }
}
