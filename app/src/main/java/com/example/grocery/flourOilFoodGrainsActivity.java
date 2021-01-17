package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.grocery.ui.category.CategoryFragment;
import com.example.grocery.ui.category.CategoryViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class flourOilFoodGrainsActivity extends AppCompatActivity {

            private Button wheatButton;
            private Button plus;
            private Button minus;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_flour_oil_food_grains);
                Intent intent = getIntent();

                wheatButton = findViewById(R.id.wheat);

                FloatingActionButton fab = findViewById(R.id.fab);
                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(flourOilFoodGrainsActivity.this, FileActivity.class));

                    }
                });

                wheatButton.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view, "Added to cart", Snackbar.LENGTH_SHORT)
                                .setAction("Action", null).show();
                    }
                }));

                final int n = 3;
                plus = findViewById(R.id.wheatPlus);
                plus.setOnClickListener((new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        String str = String.valueOf(n)+" kg Wheat added to your cart!";
                        Snackbar.make(v, str, Snackbar.LENGTH_SHORT)
                                .setAction("Action", null).show();
                    }
                }));
            }


    }