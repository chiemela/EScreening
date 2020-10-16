package com.example.escreening.ui.fragtwo;

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

import com.example.escreening.R;

public class FragTwo extends Fragment {

    private FragTwoViewModel fragTwoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragTwoViewModel =
                ViewModelProviders.of(this).get(FragTwoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_two, container, false);
        final TextView textView = root.findViewById(R.id.text_fragTwo);
        fragTwoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
