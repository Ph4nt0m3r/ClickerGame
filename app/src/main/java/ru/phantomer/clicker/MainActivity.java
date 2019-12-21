package ru.phantomer.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView output;
    private TextView output2;
    private TextView output3;
    private double itemAmount = 0;
    private int upgrade = 100;
    private int producing = 1;
    private int upgradeCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.textView);
        output2 = findViewById(R.id.textView2);
        output2.setText("Цена апгрейда: " + "\n" + upgrade);
        output3 = findViewById(R.id.button);

    }

    //Улучшения и вывод текста на textView и на TextView2
    public void upgrade(View view) {
        nowIs();
        if (itemAmount >= upgrade) {
            itemAmount -= upgrade;
            producing++;
            upgrade = upgrade+upgrade/10*producing;
            upgradeCounter ++;
            output2.setText("Цена апгрейда: " + "\n" + upgrade);
        }
            if (nowIs().equals("Дерево"))
                output.setText("Кол-во дерева: " + itemAmount);
            else if (nowIs().equals("Камень"))
                output.setText("Кол-во камня: " + itemAmount);
            else if (nowIs().equals("Уголь"))
                output.setText("Кол-во угля: " + itemAmount);
            else if (nowIs().equals("Медь"))
                output.setText("Кол-во меди: " + itemAmount);
            else if (nowIs().equals("Серебро"))
                output.setText("Кол-во серебра: " + itemAmount);
            else if (nowIs().equals("Золото"))
                output.setText("Кол-во золота: " + itemAmount);
            else if (nowIs().equals("Свинец"))
                output.setText("Кол-во свинца: " + itemAmount);
            else if (nowIs().equals("Олово"))
                output.setText("Кол-во олова: " + itemAmount);
            else if (nowIs().equals("Железо"))
                output.setText("Кол-во железа: " + itemAmount);
            else if (nowIs().equals("Углерод"))
                output.setText("Кол-во углерода: " + itemAmount);
        }

        //Клики и вывод текста на textView
    public void clicking(View view) {
        itemAmount += producing;
        if (nowIs().equals("Дерево"))
            output.setText("Кол-во дерева: " + itemAmount);
        else if (nowIs().equals("Камень"))
            output.setText("Кол-во камня: " + itemAmount);
        else if (nowIs().equals("Уголь"))
            output.setText("Кол-во угля: " + itemAmount);
        else if (nowIs().equals("Медь"))
            output.setText("Кол-во меди: " + itemAmount);
        else if (nowIs().equals("Серебро"))
            output.setText("Кол-во серебра: " + itemAmount);
        else if (nowIs().equals("Золото"))
            output.setText("Кол-во золота: " + itemAmount);
        else if (nowIs().equals("Свинец"))
            output.setText("Кол-во свинца: " + itemAmount);
        else if (nowIs().equals("Олово"))
            output.setText("Кол-во олова: " + itemAmount);
        else if (nowIs().equals("Железо"))
            output.setText("Кол-во железа: " + itemAmount);
        else if (nowIs().equals("Углерод"))
            output.setText("Кол-во углерода: " + itemAmount);
    }

    //Определение ресурсов и вывод кол-ва определённого ресурса на textView

    public String nowIs() {
        if (upgradeCounter < 5) {
            output3.setText("CHOP DOWN SOME TREES!");
            return "Дерево";
        } else if (upgradeCounter <= 10) {
            output3.setText("MINE SOME STONE!");
            return "Камень";
        } else if (upgradeCounter <= 15) {
            output3.setText("MINE SOME COAL!");
            return "Уголь";
        } else if (upgradeCounter <= 20) {
            output3.setText("MINE SOME COPPER!");
            return "Медь";
        } else if (upgradeCounter <= 25) {
            output3.setText("MINE SOME SILVER!");
            return "Серебро";
        } else if (upgradeCounter <= 30) {
            output3.setText("MINE SOME GOLD!");
            return "Золото";
        } else if (upgradeCounter <= 35) {
            output3.setText("MINE SOME LEAD!");
            return "Свинец";
        } else if (upgradeCounter <= 40) {
            output3.setText("MINE SOME TIN!");
            return "Олово";
        } else if (upgradeCounter <= 45) {
            output3.setText("MINE SOME IRON!");
            return "Железо";
        } else if (upgradeCounter <= 50) {
            output3.setText("PRODUCE SOME CARBON!");
            return "Углерод";
        }

//TODO: + 50. + Сделать обнуление ресурсов после перехода на новый.

        output3.setText("Antimatter!");
        return "Антиматерия";
    }
}