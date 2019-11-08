package com.sematec.sematecandroidbasicmehr98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestDataBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_data_base);

        final EditText edtName = findViewById(R.id.edtName);
        final EditText edtFamily = findViewById(R.id.edtFamily);
        final EditText edtGrade = findViewById(R.id.edtGrade);
        Button btnInsert = findViewById(R.id.btnInsert);
        Button btnRead = findViewById(R.id.btnRead);


        final SqliteHelper helper = new SqliteHelper(TestDataBaseActivity.this, "Sematec", null, 1);


        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String family = edtFamily.getText().toString();
                int grade = Integer.parseInt(edtGrade.getText().toString());

                helper.insertStudent(name, family, grade);

            }
        });


        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = helper.getAllStudentsName();
                Toast.makeText(TestDataBaseActivity.this, names, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
