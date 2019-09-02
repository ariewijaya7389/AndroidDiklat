package com.example.diklatappjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final EditText editTextName = findViewById(R.id.editTextName);
        Button buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String nama = editTextName.getText().toString();

                String welcome = "Welcome, " +nama+ ", Anda sudah terdaftar dengan E-mail " +email;

                Toast.makeText(MainActivity.this, welcome, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
