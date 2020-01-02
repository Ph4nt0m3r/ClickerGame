package ru.phantomer.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private TextView upgradeButton;
    private TextView clickButton;
    private TextView prestigeButton;
    private TextView themeButton;
    private double itemAmount = 0;
    private int upgrade = 100;
    private int upgradeCounter = 0;
    private int addAmount = 1;
    private int prestige = 0;
    private int needForPrestige = 5;
    private int clickingProducing = 1;
    private int upgradeProducing = 1;
    private int themeNow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        output = findViewById(R.id.textView);
        output.setText("Кол-во дерева: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
        upgradeButton = findViewById(R.id.button2);
        upgradeButton.setText("UPGRADE!" + "\n" + "Цена апгрейда: " + "\n" + upgrade);
        clickButton = findViewById(R.id.button);
        prestigeButton = findViewById(R.id.button3);
        prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);
        themeButton = findViewById(R.id.button5);
    }

    //Улучшения и вывод текста на textView
    public void upgrade(View view) {
        nowIs();
        if (itemAmount >= upgrade) {
            itemAmount -= upgrade;
            clickingProducing++;
            upgrade += 10 * upgradeProducing;
            upgradeCounter++;
            upgradeProducing++;
            upgradeButton.setText("UPGRADE!" + "\n" + "Цена апгрейда: " + "\n" + upgrade);

            //output.setText("Кол-во ЭЛЕМЕНТА: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);

            switch (nowIs()) {
                case "Дерево":
                    output.setText("Кол-во дерева: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Камень":
                    output.setText("Кол-во камня: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Уголь":
                    output.setText("Кол-во угля: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Медь":
                    output.setText("Кол-во меди: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Серебро":
                    output.setText("Кол-во серебра: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Золото":
                    output.setText("Кол-во золота: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Свинец":
                    output.setText("Кол-во свинца: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Олово":
                    output.setText("Кол-во олова: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Железо":
                    output.setText("Кол-во железа: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Углерод":
                    output.setText("Кол-во углерода: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Сурьма":
                    output.setText("Кол-во сурьмы: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Ртуть":
                    output.setText("Кол-во ртути: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Цинк":
                    output.setText("Кол-во цинка: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Сера":
                    output.setText("Кол-во серы: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Мышьяк":
                    output.setText("Кол-во мышьяка: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Висмут":
                    output.setText("Кол-во висмута: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Фосфор":
                    output.setText("Кол-во фосфора: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
                case "Кобальт":
                    output.setText("Кол-во кобальта: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                    break;
            }
        }
    }

    //Клики и вывод текста на textView
    public void clicking(View view) {
        itemAmount += clickingProducing;

        //output.setText("Кол-во ЭЛЕМЕНТА: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);

        switch (nowIs()) {
            case "Дерево":
                output.setText("Кол-во дерева: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Камень":
                output.setText("Кол-во камня: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Уголь":
                output.setText("Кол-во угля: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Медь":
                output.setText("Кол-во меди: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Серебро":
                output.setText("Кол-во серебра: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Золото":
                output.setText("Кол-во золота: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Свинец":
                output.setText("Кол-во свинца: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Олово":
                output.setText("Кол-во олова: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Железо":
                output.setText("Кол-во железа: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Углерод":
                output.setText("Кол-во углерода: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Сурьма":
                output.setText("Кол-во сурьмы: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Ртуть":
                output.setText("Кол-во ртути: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Цинк":
                output.setText("Кол-во цинка: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Сера":
                output.setText("Кол-во серы: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Мышьяк":
                output.setText("Кол-во мышьяка: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Висмут":
                output.setText("Кол-во висмута: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Фосфор":
                output.setText("Кол-во фосфора: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
            case "Кобальт":
                output.setText("Кол-во кобальта: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
                break;
        }
    }

    //Определение ресурсов и их вывод на кнопку
    public String nowIs() {

        if ((upgradeCounter % 5 == 1 && addAmount == upgradeCounter / 5)
                || (upgradeCounter == 5 && addAmount == 1)) {
            itemAmount = 0;
            addAmount++;
        }


/*if (upgradeCounter<ЧИСЛО){
        clickButton.setText("CHOP DOWN SOME НАЗВ.АНГЛ!");
        clickButton.setTextColor(Color.parseColor("ХЕКС ЦВЕТ текста"));
        clickButton.setBackgroundColor(Color.parseColor("ХЕКС ЦВЕТ фона"));
        return "РЕСУРС";
        */

        if (upgradeCounter < 5) {
            clickButton.setText("CHOP DOWN SOME TREES!");
            clickButton.setTextColor(Color.parseColor("#ffffff")); //белый
            clickButton.setBackgroundColor(Color.parseColor("#357d2f")); //зелёный
            return "Дерево";
        } else if (upgradeCounter <= 10) {
            clickButton.setText("MINE SOME STONE!");
            clickButton.setBackgroundColor(Color.parseColor("#999c98")); //серый
            return "Камень";
        } else if (upgradeCounter <= 15) {
            clickButton.setText("MINE SOME COAL!");
            clickButton.setTextColor(Color.parseColor("#ffffff")); //белый
            clickButton.setBackgroundColor(Color.parseColor("#4c4d4c")); //темно-серый
            return "Уголь";
        } else if (upgradeCounter <= 20) {
            clickButton.setText("MINE SOME COPPER!");
            clickButton.setBackgroundColor(Color.parseColor("#e87d13")); //оранжевый
            return "Медь";
        } else if (upgradeCounter <= 25) {
            clickButton.setText("MINE SOME SILVER!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#ebebeb")); //светло-серый
            return "Серебро";
        } else if (upgradeCounter <= 30) {
            clickButton.setText("MINE SOME GOLD!");
            clickButton.setBackgroundColor(Color.parseColor("#fff93d")); //жёлто-белый
            return "Золото";
        } else if (upgradeCounter <= 35) {
            clickButton.setText("MINE SOME LEAD!");
            clickButton.setTextColor(Color.parseColor("#ffffff")); //белый
            clickButton.setBackgroundColor(Color.parseColor("#b1c0c9")); //светло-серо-синий
            return "Свинец";
        } else if (upgradeCounter <= 40) {
            clickButton.setText("MINE SOME TIN!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#f7fff7")); //бело-зеленый
            return "Олово";
        } else if (upgradeCounter <= 45) {
            clickButton.setText("MINE SOME IRON!");
            clickButton.setBackgroundColor(Color.parseColor("#dbdad5")); //серо-желтый
            return "Железо";
        } else if (upgradeCounter <= 50) {
            clickButton.setText("PRODUCE SOME CARBON!");
            clickButton.setTextColor(Color.parseColor("#ffffff")); //белый
            clickButton.setBackgroundColor(Color.parseColor("#000000")); //черный
            return "Углерод";
        } else if (upgradeCounter <= 55) {
            clickButton.setText("PRODUCE SOME ANTIMONY!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#b6f4fa")); //бело-голубой
            return "Сурьма";
        } else if (upgradeCounter <= 60) {
            clickButton.setText("PRODUCE SOME QUICKSILVER!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#d6d6d6")); //серебристый
            return "Ртуть";
        } else if (upgradeCounter <= 65) {
            clickButton.setText("PRODUCE SOME ZINC!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#d7eafc")); //бело-синий
            return "Цинк";
        } else if (upgradeCounter <= 70) {
            clickButton.setText("PRODUCE SOME SULFUR!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#e6f725")); //ярко-желтый
            return "Сера";
        } else if (upgradeCounter <= 75) {
            clickButton.setText("PRODUCE SOME ARSENIC!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#e0ded1")); //бело-желтый
            return "Мышьяк";
        } else if (upgradeCounter <= 80) {
            clickButton.setText("PRODUCE SOME BISMUTH!");
            clickButton.setTextColor(Color.parseColor("#ffffff")); //белый
            clickButton.setBackgroundColor(Color.parseColor("#8f8777")); //серо-оранжевый
            return "Висмут";
        } else if (upgradeCounter <= 85) {
            clickButton.setText("PRODUCE SOME PHOSPHORUS!");
            clickButton.setTextColor(Color.parseColor("#ffffff")); //белый
            clickButton.setBackgroundColor(Color.parseColor("#910a15")); //красный
            return "Фосфор";
        } else if (upgradeCounter <= 90) {
            clickButton.setText("PRODUCE SOME COBALT!");
            clickButton.setTextColor(Color.parseColor("#000000")); //черный
            clickButton.setBackgroundColor(Color.parseColor("#ebedfc")); //бело-синий
            return "Кобальт";
        }


//TODO: + 42. + Сменить фон на картинку + сменить иконку + смена цвета текста + меню выбора цвета + подтверждение сброса уровня


            clickButton.setText("Antimatter!");
        return "Антиматерия";

    }

    //Механика престижа.
    public void prestige(View view) {
        if (upgradeCounter >= needForPrestige) {
            prestige++;
            itemAmount = 0;
            upgrade = 100;
            upgradeCounter = 0;
            addAmount = 1;
            upgradeProducing = 1;
            output.setText("Кол-во дерева: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
            upgradeButton.setText("Цена апгрейда: " + "\n" + upgrade);
            clickButton.setText("CHOP DOWN SOME TREES!");
            clickButton.setTextColor(Color.parseColor("#ffffff")); //белый
            clickButton.setBackgroundColor(Color.parseColor("#357d2f")); //зелёный
            needForPrestige += 5;
            prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);
        }
    }
    //Смена темы.
    public void theme(View view) {
        if (themeNow == 0) {
            findViewById(R.id.background1).setBackgroundColor(Color.parseColor("#000000")); //черный
            output.setTextColor(Color.parseColor("#ffffff"));
            themeButton.setBackgroundColor(Color.parseColor("#ffffff")); //белый
            themeButton.setTextColor(Color.parseColor("#000000")); //черный
            themeNow++;
        } else if (themeNow == 1) {
            findViewById(R.id.background1).setBackgroundColor(Color.parseColor("#ffffff")); //белый
            output.setTextColor(Color.parseColor("#000000"));
            themeButton.setBackgroundColor(Color.parseColor("#000000")); //черный
            themeButton.setTextColor(Color.parseColor("#ffffff")); //белый
            themeNow = 0;
        }
    }
}
