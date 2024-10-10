package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText text; // Объявляем переменную

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализируем переменную после setContentView
        text = findViewById(R.id.edit);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Получаем текст из EditText
                String userInput = text.getText().toString();

                // Создаем Intent и передаем введенный текст
                Intent intent = new Intent(getApplicationContext(), com.example.myapplication.SecondActivity.class);
                intent.putExtra("key", userInput);  // передача параметра (введенного текста)
                startActivity(intent);
            }
        });
    }
}