package com.example.escreening.ui.fragfour;

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

public class FragFour extends Fragment {

    private FragFourViewModel fragFourViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragFourViewModel =
                ViewModelProviders.of(this).get(FragFourViewModel.class);
        View root = inflater.inflate(R.layout.fragment_four, container, false);
        final TextView textView = root.findViewById(R.id.text_fragFour);
        fragFourViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
