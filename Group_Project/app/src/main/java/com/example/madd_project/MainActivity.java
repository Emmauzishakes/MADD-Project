package com.example.madd_project;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // 🔹 Variable declarations
    EditText etWeight, etHeight;
    Button btnCompute, btnReset;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 🔹 Initialize views
        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
        btnCompute = findViewById(R.id.btnCompute);
        btnReset = findViewById(R.id.btnReset);
        tvResult = findViewById(R.id.tvResult);

        // 🔹 INPUT HANDLER LOGIC
        btnCompute.setOnClickListener(v -> {

            String weightStr = etWeight.getText().toString().trim();
            String heightStr = etHeight.getText().toString().trim();

            if (weightStr.isEmpty() || heightStr.isEmpty()) {
                tvResult.setText("Please enter both weight and height");
                return;
            }

            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr);

            // Values ready for BMI calculation
        });

        // 🔹 Reset button
        btnReset.setOnClickListener(v -> {
            etWeight.setText("");
            etHeight.setText("");
            tvResult.setText("");
        });
    }
}
