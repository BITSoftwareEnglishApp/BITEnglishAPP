package com.bit.learnenglishapp.video;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.bit.learnenglishapp.R;

public class VideoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View informationFragment = inflater.inflate(R.layout.video_main, container, false);
        return informationFragment;
    }
}
