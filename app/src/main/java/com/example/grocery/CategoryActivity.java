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

public class CategoryActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();

    }
}