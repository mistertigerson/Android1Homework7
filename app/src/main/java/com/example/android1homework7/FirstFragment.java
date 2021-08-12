package com.example.android1homework7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.example.android1homework7.databinding.FragmentFirstBinding;
import com.example.android1homework7.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<MainModel> list = new ArrayList<>();
    private FragmentFirstBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false);
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
        createList();
        recyclerView = view.findViewById(R.id.main_recycler);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setList(list);
        adapter.setListener(new OnViewClickListener() {
            @Override
            public void onClick() {
                getParentFragmentManager().beginTransaction().replace(R.id.main_frame, new ThirthFragment()).commit();
            }
        });


    }

    private void createList() {

        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector", R.drawable._image_,
                "alive", "Rick Sanchez"));

    }
}