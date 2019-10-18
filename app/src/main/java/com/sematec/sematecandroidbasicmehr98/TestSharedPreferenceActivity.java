package com.sematec.sematecandroidbasicmehr98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class TestSharedPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_preference);

        final EditText edtName = findViewById(R.id.edtName);
        TextView txtName = findViewById(R.id.txtName);
        Button btnSave = findViewById(R.id.btnSave);


        String userName = PreferenceManager.getDefaultSharedPreferences(TestSharedPreferenceActivity.this).getString("name", "Unknown Name!");

        txtName.setText(userName);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                PreferenceManager.getDefaultSharedPreferences(TestSharedPreferenceActivity.this).edit().putString("name", name).apply();
            }
        });
    }
}
