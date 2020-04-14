package com.example.ufs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ufs.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ShowFiles extends AppCompatActivity {

    private String Name = "Fengxu";
    private String[] FileList = new String[]{"FILE #1", "FILE #2", "FILE #3"};
    private TextView[] myTextView = new TextView[FileList.length];
    private Button Finish;
    private Button Add;
    private Button Delete;
    private Button Search;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showfiles);

        // Get current user info (username and file list)
        /*
        Name = ;
        FileList = ;
        */

        // Get information from other activities
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
            FileList[0] = bundle.getString("Added");
        Bundle newUserBundle = getIntent().getExtras();
        if (newUserBundle != null)
            Name = newUserBundle.getString("newUsername");

        setTitle(Name);
        // LinearLayout
        LinearLayout linearLayout = findViewById(R.id.ShowFileLayout);
        linearLayout.setWeightSum(5);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        for (int ii = 0; ii < FileList.length; ii++) {
            myTextView[ii] = new TextView(this);
            myTextView[ii].setText(FileList[ii]);
            myTextView[ii].setTextSize(20);
            linearLayout.addView(myTextView[ii]);
        }

        Add = findViewById(R.id.AddFile);
        Delete = findViewById(R.id.DeleteFile);
        Search = findViewById(R.id.SearchFile);
        Finish = findViewById(R.id.Return);
        setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        Add.setOnClickListener(onClick);
        Delete.setOnClickListener(onClick);
        Search.setOnClickListener(onClick);
        Finish.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.AddFile:
                case R.id.DeleteFile:
                    intent = new Intent(ShowFiles.this, AddFileActivity.class);
                    break;
                case R.id.SearchFile:
                    intent = new Intent(ShowFiles.this, AddFileActivity.class);
                    Bundle flag = new Bundle();
                    flag.putInt("flag", 1);
                    intent.putExtras(flag);
                    break;
                case R.id.Return:
                    intent = new Intent(ShowFiles.this, MainActivity.class);
            }
            startActivity(intent);
        }
    }
}
