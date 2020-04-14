package com.example.ufs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LinearRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain;
    private Button AddFile;
    private Button DeleteFile;
    private Button SearchFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        mRvMain = findViewById(R.id.rv_main);
        mRvMain.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        mRvMain.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));

        // Add new file to file list
        AddFile = findViewById(R.id.AddFile);

        // Delete a file from file list
        DeleteFile = findViewById(R.id.DeleteFile);

        // Search file by using regular expression
        SearchFile = findViewById(R.id.SearchFile);
        setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        AddFile.setOnClickListener(onClick);
        DeleteFile.setOnClickListener(onClick);
        SearchFile.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.AddFile:
                    // Do add file

                    break;
                case R.id.DeleteFile:
                    // Do delete file

                    break;
                case R.id.SearchFile:
                    // Do search file

                    break;
            }
            intent = new Intent(LinearRecyclerViewActivity.this,
                                              LinearRecyclerViewActivity.class);
            Toast.makeText(LinearRecyclerViewActivity.this,
                           "Jump successfully1", Toast.LENGTH_SHORT)
                          .show();
            startActivity(intent);
        }
    }
}
