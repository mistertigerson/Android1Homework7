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

    private MainAdapter adapter;
    private ArrayList<MainModel> list = new ArrayList<>();
    private FragmentFirstBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new MainAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createList();
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        initList();
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter.setListener(new OnViewClickListener() {
            @Override
            public void onClick(MainModel mainModel) {
                ThirthFragment thirthFragment = new ThirthFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.main_frame, thirthFragment).commit();
                Bundle bundle = new Bundle();
                bundle.putSerializable("MYKEY", mainModel);
                thirthFragment.setArguments(bundle);
            }

            @Override
            public void onClick(StringModel stringModel) {

            }
        });


    }

    private void initList() {
        adapter.setList(list);
        binding.mainRecycler.setAdapter(adapter);
    }

    private void createList() {
        list.add(new MainModel(R.drawable._image_,"dead","Agency fdsaf"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency fdsafadsf"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency fsdafsd"));
        list.add(new MainModel(R.drawable._image_,"dead","RICK SANCHEZ"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Difsdafsadrrector"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency fdsafdsa"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency fsdafdsaf"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency sdafsd"));
        list.add(new MainModel(R.drawable._image_,"dead","Agedsfncy ewqr"));
        list.add(new MainModel(R.drawable._image_,"dead","Agency Dirrector"));

    }
}