package com.bit.learnenglishapp.informaion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.bit.learnenglishapp.R;

public class InformationFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View informationFragment = inflater.inflate(R.layout.information_main, container, false);
        return informationFragment;
    }
}
