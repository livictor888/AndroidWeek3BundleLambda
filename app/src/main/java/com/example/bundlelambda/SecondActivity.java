package com.example.bundlelambda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Link to textView
        TextView textName = findViewById(R.id.textViewName);
        TextView textAddress = findViewById(R.id.textViewAddress);
        TextView textPostalCode = findViewById(R.id.textViewPostalCode);

        // Get the intent
        Intent intent = getIntent();

//        // Extract data from intent
//        String name = intent.getStringExtra("name");
//        String address = intent.getStringExtra("address");
//        String postalCode = intent.getStringExtra("postalCode");

        // Extract data from intent
        Bundle bundle = intent.getBundleExtra("bundle");
        String name = bundle.getString("name");
        String address = bundle.getString("address");
        String postalCode = bundle.getString("postalCode");

        // Display the data
        textName.setText(name);
        textAddress.setText(address);
        textPostalCode.setText(postalCode);

        // Create a button to start the third activity
        Button to_third = findViewById(R.id.btnToThird);
        to_third.setOnClickListener(view -> {
            // Get user input
            EditText textAge = findViewById(R.id.editTextAge);
            String age = textAge.getText().toString();
            EditText textGender = findViewById(R.id.editTextGender);
            String gender = textGender.getText().toString();

            // Create an intent to pass data
            Intent intent1 = new Intent(view.getContext(), ThirdActivity.class);

//            // Store data in the intent
//            intent1.putExtra("name", name);
//            intent1.putExtra("address", address);
//            intent1.putExtra("postalCode", postalCode);
//            intent1.putExtra("age", age);
//            intent1.putExtra("gender", gender);

            // Store data in the intent
            bundle.putString("age", age);
            bundle.putString("gender", gender);
            intent1.putExtra("bundle", bundle);

            // Start the third Activity
            startActivity(intent1);
        });
    }
}
