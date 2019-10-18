package com.sematec.sematecandroidbasicmehr98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivityForResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_for_result);


        TextView txtAge = findViewById(R.id.txtAge);
        Button btnConfirm = findViewById(R.id.btnConfirm);
        final EditText edtName = findViewById(R.id.edtName);

        Intent intent = getIntent();
        String age = intent.getStringExtra("age");
        txtAge.setText(age);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                Intent i = new Intent();
                i.putExtra("name", name);
                setResult(Activity.RESULT_OK, i);
                finish();

            }
        });

    }
}
