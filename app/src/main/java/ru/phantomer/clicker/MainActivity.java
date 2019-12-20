package ru.phantomer.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView output;
    private TextView output2;

    private int score = 0;
    private int upgrade = 100;
    private int add = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.textView);
        output2 = findViewById(R.id.textView2);
        output2.setText("Цена апгрейда: " + "\n" + upgrade);
    }

    public void upgrade(View view) {
        if (score >= upgrade) {
            score -= upgrade;
            output.setText("Кол-во кликов: " + score);
            upgrade = upgrade * 2 + 3 * add / 2; // Нужно высчитать специальную формулу
            output2.setText("Цена апгрейда: " + "\n" + upgrade);
            add++;
        }
    }

    public void click(View view) {
        score += add;
        output.setText("Кол-во кликов: " + score);
    }
}