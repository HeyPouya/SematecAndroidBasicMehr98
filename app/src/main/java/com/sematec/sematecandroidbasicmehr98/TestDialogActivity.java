package com.sematec.sematecandroidbasicmehr98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dialog);

        Button btnName = findViewById(R.id.btnName);
        final EditText edtName = findViewById(R.id.edtName);


        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TestDialogActivity.this, edtName.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
