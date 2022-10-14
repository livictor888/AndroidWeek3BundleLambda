package com.example.bundlelambda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Get the intent
        Intent intent = getIntent();

//        // Extract data from intent
//        String name = intent.getStringExtra("name");
//        String address = intent.getStringExtra("address");
//        String postalCode = intent.getStringExtra("postalCode");
//        String age = intent.getStringExtra("age");A
//        String gender = intent.getStringExtra("gender");

        // Extract data from intent
        Bundle bundle = intent.getBundleExtra("bundle");
        String name = bundle.getString("name");
        String address = bundle.getString("address");
        String postalCode = bundle.getString("postalCode");
        String age = bundle.getString("age");
        String gender = bundle.getString("gender");

        // Display info
        TextView textView = findViewById(R.id.textViewInfo);
        String info = "Name: " + name + "\n" + "Address: " + address + "\n"
                    + "Postal Code: " + postalCode + "\n" + "Age: " + age + "\n"
                    + "Gender: " + gender;
        textView.setText(info);
    }
}
