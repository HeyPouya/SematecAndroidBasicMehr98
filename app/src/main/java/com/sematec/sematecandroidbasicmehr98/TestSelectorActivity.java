package com.sematec.sematecandroidbasicmehr98;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_selector);


        Intent intent = new Intent(TestSelectorActivity.this, TestService.class);
//        startService(intent);


        Button btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TestSelectorActivity.this, "Some Text!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
