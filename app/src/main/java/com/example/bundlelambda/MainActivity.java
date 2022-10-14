package com.example.bundlelambda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a button to start the second activity
        Button to_second = findViewById(R.id.btnToSecond);
        to_second.setOnClickListener(view -> {
            // Get user input
            EditText textName = findViewById(R.id.editTextName);
            String name = textName.getText().toString();
            EditText textAddress = findViewById(R.id.editTextAddress);
            String address = textAddress.getText().toString();
            EditText textPostalCode = findViewById(R.id.editTextPostalCode);
            String postalCode = textPostalCode.getText().toString();

            // Create an intent to pass data
            Intent intent = new Intent(view.getContext(), SecondActivity.class);

//            // Store data in the intent
//            intent.putExtra("name", name);
//            intent.putExtra("address", address);
//            intent.putExtra("postalCode", postalCode);

                // Create a bundle to store data
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putString("address", address);
                bundle.putString("postalCode", postalCode);
                intent.putExtra("bundle", bundle);

            // Start the second Activity
            startActivity(intent);
        });

    }
}