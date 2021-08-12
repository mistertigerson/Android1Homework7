package com.example.android1homework7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1homework7.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private SecondAdapter adapter;
    private ArrayList<StringModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new SecondAdapter();
        createList();
        binding.secondRecycler.setAdapter(adapter);
        adapter.setList(list);
    }

    private void createList() {
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLanet","Earth (209)"));
        list.add(new StringModel("PLaner","Earth (209)"));
        list.add(new StringModel("PLaner","Earth (209)"));
        list.add(new StringModel("PLaner","Earth (209)"));

    }


}