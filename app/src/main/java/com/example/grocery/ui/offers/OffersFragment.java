package com.example.grocery.ui.offers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.grocery.R;

public class OffersFragment extends Fragment {

    private OffersViewModel offersViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        offersViewModel =
                ViewModelProviders.of(this).get(OffersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_offers, container, false);
        return root;
    }
}