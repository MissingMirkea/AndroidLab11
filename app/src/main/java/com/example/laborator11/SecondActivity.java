package com.example.laborator11;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    GridView gridView;
    Button backButton;

    // Lista de imagini și denumiri pentru SecondActivity
    String[] itemNames = {"Android", "iOS", "Windows", "Linux"};
    int[] itemImages = {
            R.drawable.andro,
            R.drawable.macios,
            R.drawable.windows,
            R.drawable.linux
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Inițializează GridView
        gridView = findViewById(R.id.gridView2);
        ImageAdapter adapter = new ImageAdapter(this, itemNames, itemImages);
        gridView.setAdapter(adapter);

        // Inițializează butonul și adaugă funcția de întoarcere la MainActivity
        backButton = findViewById(R.id.buttonGoBack);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
