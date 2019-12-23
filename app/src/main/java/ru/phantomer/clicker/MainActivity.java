package ru.phantomer.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView output;
    private TextView output2;
    private TextView output3;
    public double itemAmount = 0;
    private int upgrade = 100;
    private int producing = 1;
    private int upgradeCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.textView);
        output.setText("Кол-во дерева: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        output2 = findViewById(R.id.textView2);
        output2.setText("Цена апгрейда: " + "\n" + upgrade);
        output3 = findViewById(R.id.button);
        output3.setBackgroundColor(Color.parseColor("#357d2f"));
    }

    //Улучшения и вывод текста на textView и на TextView2
    public void upgrade(View view) {
        nowIs();
        if (itemAmount >= upgrade) {
            itemAmount -= upgrade;
            producing++;
            upgrade = upgrade + upgrade/10*producing;
            upgradeCounter++;
            output2.setText("Цена апгрейда: " + "\n" + upgrade);

            if (nowIs().equals("Дерево"))
                output.setText("Кол-во дерева: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Камень"))
                output.setText("Кол-во камня: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
            else if (nowIs().equals("Уголь"))
                output.setText("Кол-во угля: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Медь"))
                output.setText("Кол-во меди: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Серебро"))
                output.setText("Кол-во серебра: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Золото"))
                output.setText("Кол-во золота: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Свинец"))
                output.setText("Кол-во свинца: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Олово"))
                output.setText("Кол-во олова: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Железо"))
                output.setText("Кол-во железа: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
             else if (nowIs().equals("Углерод"))
                output.setText("Кол-во углерода: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        }
    }

    //Клики и вывод текста на textView
    public void clicking(View view) {
        itemAmount += producing;
        if (nowIs().equals("Дерево"))
            output.setText("Кол-во дерева: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Камень"))
            output.setText("Кол-во камня: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Уголь"))
            output.setText("Кол-во угля: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Медь"))
            output.setText("Кол-во меди: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Серебро"))
            output.setText("Кол-во серебра: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Золото"))
            output.setText("Кол-во золота: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Свинец"))
            output.setText("Кол-во свинца: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Олово"))
            output.setText("Кол-во олова: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Железо"))
            output.setText("Кол-во железа: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
        else if (nowIs().equals("Углерод"))
            output.setText("Кол-во углерода: " + itemAmount + "\n" + "LVL= " + upgradeCounter);
    }

    //Определение ресурсов и их вывод на кнопку
    public String nowIs() {

        

        if (upgradeCounter < 5) {
            output3.setText("CHOP DOWN SOME TREES!");
            output3.setTextColor(Color.parseColor("#ffffff")); //белый
            output3.setBackgroundColor(Color.parseColor("#357d2f")); //зелёный
            return "Дерево";
        } else if (upgradeCounter <= 10) {
            output3.setText("MINE SOME STONE!");
            output3.setBackgroundColor(Color.parseColor("#999c98")); //серый
            return "Камень";
        } else if (upgradeCounter <= 15) {
            output3.setText("MINE SOME COAL!");
            output3.setTextColor(Color.parseColor("#ffffff")); //белый
            output3.setBackgroundColor(Color.parseColor("#4c4d4c")); //темно-серый
            return "Уголь";
        } else if (upgradeCounter <= 20) {
            output3.setText("MINE SOME COPPER!");
            output3.setBackgroundColor(Color.parseColor("#e87d13")); //оранжевый
            return "Медь";
        } else if (upgradeCounter <= 25) {
            output3.setText("MINE SOME SILVER!");
            output3.setBackgroundColor(Color.parseColor("#ebebeb")); //светло-серый
            return "Серебро";
        } else if (upgradeCounter <= 30) {
            output3.setText("MINE SOME GOLD!");
            output3.setBackgroundColor(Color.parseColor("#fff93d")); //жёлто-белый
            return "Золото";
        } else if (upgradeCounter <= 35) {
            output3.setText("MINE SOME LEAD!");
            output3.setBackgroundColor(Color.parseColor("#b1c0c9")); //светло-серо-синий
            return "Свинец";
        } else if (upgradeCounter <= 40) {
            output3.setText("MINE SOME TIN!");
            output3.setBackgroundColor(Color.parseColor("#f7fff7")); //бело-зеленый
            return "Олово";
        } else if (upgradeCounter <= 45) {
            output3.setText("MINE SOME IRON!");
            output3.setBackgroundColor(Color.parseColor("#dbdad5")); //серо-желтый
            return "Железо";
        } else if (upgradeCounter <= 50) {
            output3.setText("PRODUCE SOME CARBON!");
            output3.setTextColor(Color.parseColor("#ffffff")); //белый
            output3.setBackgroundColor(Color.parseColor("#000000")); //черный
            return "Углерод";
        }

//TODO: + 50. + Сделать обнуление ресурсов после перехода на новый. + Сменить фон на картинку

        output3.setText("Antimatter!");
        return "Антиматерия";
        }
    }
