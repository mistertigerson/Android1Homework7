package com.example.android1homework7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android1homework7.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView btn;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new FirstFragment()).commit();



        btn = findViewById(R.id.bottonavi_am);
        btn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.character:
                        binding.toolBar.setTitle("Character");
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new FirstFragment()).commit();
                        break;
                    case R.id.location:
                        binding.toolBar.setTitle("Location");
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new SecondFragment()).commit();
                        break;
                }
                    return true;
            }
        });


    }
}