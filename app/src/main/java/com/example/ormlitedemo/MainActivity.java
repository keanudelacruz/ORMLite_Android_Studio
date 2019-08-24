package com.example.ormlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donoteDataStuff();
    }

    //generate Override > onCreateOptionsMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
//        getMenuInflater().inflate(R.menu.main, menu);
    }

    private void donoteDataStuff(){

    }
}
