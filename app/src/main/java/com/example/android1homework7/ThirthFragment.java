package com.example.android1homework7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.android1homework7.databinding.FragmentFirstBinding;
import com.example.android1homework7.databinding.FragmentThirthBinding;


public class ThirthFragment extends Fragment {

    private FragmentThirthBinding binding;
    private MainModel mainModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentThirthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.text2Thirth.setText(mainModel.getName());
        binding.imageThirthFragment.setImageResource(mainModel.getImg());
        binding.textThirth.setText(mainModel.getDead());

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (requireArguments() != null) {
            mainModel = (MainModel) requireArguments().getSerializable("MYKEY");
        }

    }
}