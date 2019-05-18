package com.example.taller41;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.taller41.Fragmentos.Fragment_Taller;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new Fragment_Taller()).commit();

    }
}
