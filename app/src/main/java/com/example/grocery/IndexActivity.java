package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.internal.SignInButtonImpl;

public class IndexActivity extends AppCompatActivity {

    private Button previousOrders;
    private Button newOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        previousOrders = findViewById(R.id.previousOrders);
        newOrder = findViewById(R.id.newOrder);

        previousOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndexActivity.this, PreviousOrderActivity.class));
            }
        });

        newOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndexActivity.this, NewOrderActivity.class));
            }
        });
    }
}