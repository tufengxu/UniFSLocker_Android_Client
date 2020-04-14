package com.example.ufs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddFileActivity extends AppCompatActivity {
    private Button OK;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_file);

        int Flag = 0;
        Bundle flag = getIntent().getExtras();
        if (flag != null)
            Flag = flag.getInt("flag");
        final int finalFlag = Flag;

        // Get the input information
        if (finalFlag == 1) {
            EditText et = findViewById(R.id.editText);
            et.setHint("Please input a keyword");
        } else {
            editText = findViewById(R.id.editText);
        }

        // Click OK button
        OK = findViewById(R.id.OK);
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddFileActivity.this, ShowFiles.class);
                final String filename = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("Added", filename);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
