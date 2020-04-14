package com.example.ufs;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AllUsers extends AppCompatActivity {

    private Button Finish;
    private String[] UserList = new String[]{"Jing Song", "Jialun Wang",
                                             "Yuhao Zhou", "Haoqi Gu", "Fengxu Tu"};
    private TextView[] myTextView = new TextView[UserList.length];

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users);

        // LinearLayout
        LinearLayout linearLayout = findViewById(R.id.UserListPage);
        linearLayout.setWeightSum(10);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        for (int ii = 0; ii < UserList.length; ii++) {
            myTextView[ii] = new TextView(this);
            myTextView[ii].setText(UserList[ii]);
            myTextView[ii].setTextSize(20);
            myTextView[ii].setPadding(20, 0, 0, 20);
            linearLayout.addView(myTextView[ii]);
        }

        Finish = findViewById(R.id.Back);
        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllUsers.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
