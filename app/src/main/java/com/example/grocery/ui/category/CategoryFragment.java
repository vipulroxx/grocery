package com.example.grocery.ui.category;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.grocery.R;
import com.example.grocery.flourOilFoodGrainsActivity;

public class CategoryFragment extends Fragment {

    private CategoryViewModel categoryViewModel;
    Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoryViewModel = ViewModelProviders.of(this).get(CategoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_category, container, false);
        button = root.findViewById(R.id.flourOilFoodGrains);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), flourOilFoodGrainsActivity.class);
            startActivity(intent);
        });

        return root;
    }
}