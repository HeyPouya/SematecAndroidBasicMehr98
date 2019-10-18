package com.sematec.sematecandroidbasicmehr98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final EditText edtAge = findViewById(R.id.edtAge);
        TextView txtName = findViewById(R.id.txtName);
        Button btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userAge = edtAge.getText().toString();
                Intent intent = new Intent(TestActivity.this, TestActivityForResult.class);
                intent.putExtra("age", userAge);
                startActivityForResult(intent, 354);
            }
        });

//        Intent i = getIntent();
//        String age = i.getStringExtra("age");

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 354) {
            if (resultCode == Activity.RESULT_OK) {
                String userName = data.getStringExtra("name");
                Toast.makeText(TestActivity.this, userName, Toast.LENGTH_LONG).show();
            }
        }


    }
}
