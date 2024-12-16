package com.example.syrian_sales.view.delegates;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.syrian_sales.R;
import com.example.syrian_sales.viewModel.delegates.DelegatesViewModel;

public class DelegatesFragment extends Fragment {

    private DelegatesViewModel mViewModel;

    public static DelegatesFragment newInstance() {
        return new DelegatesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_delegates, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DelegatesViewModel.class);
        // TODO: Use the ViewModel
    }

}