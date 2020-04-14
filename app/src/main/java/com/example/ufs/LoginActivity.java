package com.example.ufs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private Button userLogin;
    private EditText username;
    private EditText password;
    private ArrayList<String> UsersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Input Username
        username = findViewById(R.id.Username);
        UsersList.add(username.getText().toString());

        // Login
        userLogin = findViewById(R.id.LoginClick);
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this,
//                                LinearRecyclerViewActivity.class);
                Intent intent = new Intent(LoginActivity.this, ShowFiles.class);
                startActivity(intent);
            }
        });


    }
}
