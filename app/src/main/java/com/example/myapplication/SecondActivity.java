package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получение переданного параметра
        String receivedParam = getIntent().getStringExtra("key");

        // Найдем TextView и установим текст с переданным параметром
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + receivedParam);
    }
}
