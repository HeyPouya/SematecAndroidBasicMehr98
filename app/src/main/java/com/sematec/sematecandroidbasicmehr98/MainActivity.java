package com.sematec.sematecandroidbasicmehr98;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String s;
        final TextView txtName = findViewById(R.id.txtName);
        Button btnOk = findViewById(R.id.btnOk);
        final EditText edtAge = findViewById(R.id.edtAge);
        Button btnActivity = findViewById(R.id.btnActivity);

        txtName.setText("Pouya");

        btnOk.setText(getString(R.string.ok));

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = edtAge.getText().toString();
                Toast.makeText(MainActivity.this, age, Toast.LENGTH_LONG).show();
            }
        });

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = edtAge.getText().toString();

                Intent i = new Intent(MainActivity.this, TestActivity.class);
                i.putExtra("age", age);
                startActivity(i);
            }
        });

        Log.d("MYTAG", "in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MYTAG", "in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG", "in onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYTAG", "in onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYTAG", "in onStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYTAG", "in onStart");

    }
}
