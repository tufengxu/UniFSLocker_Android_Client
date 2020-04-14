package com.example.ufs;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NewUser extends AppCompatActivity {

    private Button btnNewUser;
    private String UserName;
    private ArrayList<String> UserDirs;
    private EditText newUser;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newuser);

        newUser = findViewById(R.id.et_new);

        btnNewUser = findViewById(R.id.btn_create);
        btnNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewUser.this, ShowFiles.class);

                // Get the info from user input
                final String userDir = newUser.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("newUsername", userDir);
                intent.putExtras(bundle);
                Toast.makeText(NewUser.this, "Success!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
