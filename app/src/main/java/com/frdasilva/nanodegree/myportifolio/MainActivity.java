package com.frdasilva.nanodegree.myportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPopularMovies;
    private Button btnStockHawk;
    private Button btnBuildItBigger;
    private Button btnMakeMaterial;
    private Button btnGoUbiquitous;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopularMovies = (Button) findViewById(R.id.btPopularMovies);
        btnStockHawk = (Button) findViewById(R.id.btStockHawk);
        btnBuildItBigger = (Button) findViewById(R.id.btBuildItBigger);
        btnMakeMaterial = (Button) findViewById(R.id.btMakeMaterial);
        btnGoUbiquitous = (Button) findViewById(R.id.btGoUbiquitous);
        btnCapstone = (Button) findViewById(R.id.btCapstone);

        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will lunch my Popular Movies App",Toast.LENGTH_LONG).show();
            }
        });

        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk App",Toast.LENGTH_LONG).show();
            }
        });

        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger App",Toast.LENGTH_LONG).show();
            }
        });

        btnMakeMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material App",Toast.LENGTH_LONG).show();
            }
        });

        btnGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous App",Toast.LENGTH_LONG).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App",Toast.LENGTH_LONG).show();
            }
        });
    }
}
