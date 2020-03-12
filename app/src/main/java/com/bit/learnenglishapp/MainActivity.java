package com.bit.learnenglishapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bit.learnenglishapp.informaion.InformationFragment;
import com.bit.learnenglishapp.video.VideoFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Information Part
    private InformationFragment informationFragment;
    private View informationLayout;
    private ImageView informationImage;
    private TextView informationText;
    //Video Part
    private VideoFragment videoFragment;
    private View videoLayout;
    private ImageView videoImage;
    private TextView videoText;
    //
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        fragmentManager=getSupportFragmentManager();
        setTabSelection(2);
    }
    private void initViews()
    {
        //Information Part
        informationLayout = findViewById(R.id.information_layout);
        informationImage = findViewById(R.id.information_tab_image);
        informationText = findViewById(R.id.information_tab_text);
        informationLayout.setOnClickListener(this);
        //Video Part
        videoLayout = findViewById(R.id.video_layout);
        videoImage = findViewById(R.id.video_tab_image);
        videoText = findViewById(R.id.vocabulary_tab_text);
        videoLayout.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.information_layout:
                setTabSelection(0);
                break;
            case R.id.video_layout:
                setTabSelection(1);
                break;
            default:
                Toast.makeText(this, "未定义", Toast.LENGTH_LONG).show();
        }
    }
    private void setTabSelection(int index)
    {
        clearSelection();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragments(transaction);
        switch (index)
        {
            case 0:
                if(informationFragment == null)
                {
                    informationFragment = new InformationFragment();
                    transaction.add(R.id.content, informationFragment);
                }
                else
                {
                    transaction.show(informationFragment);
                }
                break;
            case 1:
                if(videoFragment == null)
                {
                    videoFragment = new VideoFragment();
                    transaction.add(R.id.content, videoFragment);
                }
                else
                {
                    transaction.show(videoFragment);
                }
                break;
        }
        transaction.commit();
    }
    private void clearSelection()
    {

    }
    private void hideFragments(FragmentTransaction  transaction)
    {
        if(informationFragment != null)
        {
            transaction.hide(informationFragment);
        }
        if(videoFragment != null)
        {
            transaction.hide(videoFragment);
        }
    }
}
