package ru.phantomer.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private TextView output2;
    private TextView output3;
    private TextView output4;
    public double itemAmount = 0;
    private int upgrade = 100;
    private int upgradeCounter = 0;
    public int addAmount = 1;
    private int prestige = 0;
    int needForPrestige = 5;
    int clickingProducing = 1;
    int upgradeProducing = 1;
    int themeNow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        output = findViewById(R.id.textView);
        output.setText("Кол-во дерева: " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
        output2 = findViewById(R.id.button2);
        output2.setText("UPGRADE!" + "\n" + "Цена апгрейда: " + "\n" + upgrade);
        output3 = findViewById(R.id.button);
        output3.setBackgroundColor(Color.parseColor("#357d2f"));
        output4 = findViewById(R.id.button3);
        output4.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);

        //String color = "#000000";
    }

    //Улучшения и вывод текста на textView и на TextView2
    public void upgrade(View view) {
        nowIs();
        if (itemAmount >= upgrade) {
            itemAmount -= upgrade;
            clickingProducing++;
            upgrade += 10 * upgradeProducing; //DID IT
            upgradeCounter++;
            upgradeProducing++;
            output2.setText("UPGRADE!" + "\n" + "Цена апгрейда: " + "\n" + upgrade);

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

        if (upgradeCounter == 5 && addAmount == 1) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 11 && addAmount == 2) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 16 && addAmount == 3) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 21 && addAmount == 4) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 26 && addAmount == 5) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 31 && addAmount == 6) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 36 && addAmount == 7) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 41 && addAmount == 8) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 46 && addAmount == 9) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 51 && addAmount == 10) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 56 && addAmount == 11) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 61 && addAmount == 12) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 66 && addAmount == 13) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 71 && addAmount == 14) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 76 && addAmount == 15) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 81 && addAmount == 16) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 86 && addAmount == 17) {
            itemAmount = 0;
            addAmount++;
        } else if (upgradeCounter == 91 && addAmount == 18) {
            itemAmount = 0;
            addAmount++;
        }

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
        } else if (upgradeCounter <= 55) {
            output3.setText("PRODUCE SOME ANTIMONY!");
            output3.setTextColor(Color.parseColor("#000000")); //черный
            output3.setBackgroundColor(Color.parseColor("#b6f4fa")); //бело-голубой
            return "Сурьма";
        } else if (upgradeCounter <= 60) {
            output3.setText("PRODUCE SOME QUICKSILVER!");
            output3.setTextColor(Color.parseColor("#000000")); //черный
            output3.setBackgroundColor(Color.parseColor("#d6d6d6")); //серебристый
            return "Ртуть";
        } else if (upgradeCounter <= 65) {
            output3.setText("PRODUCE SOME ZINC!");
            output3.setTextColor(Color.parseColor("#000000")); //черный
            output3.setBackgroundColor(Color.parseColor("#d7eafc")); //бело-синий
            return "Цинк";
        } else if (upgradeCounter <= 70) {
            output3.setText("PRODUCE SOME SULFUR!");
            output3.setTextColor(Color.parseColor("#000000")); //черный
            output3.setBackgroundColor(Color.parseColor("#e6f725")); //ярко-желтый
            return "Сера";

        } else if (upgradeCounter <= 75) {
            output3.setText("PRODUCE SOME ARSENIC!");
            output3.setTextColor(Color.parseColor("#000000")); //черный
            output3.setBackgroundColor(Color.parseColor("#e0ded1")); //бело-желтый
            return "Мышьяк";
        } else if (upgradeCounter <= 80) {
            output3.setText("PRODUCE SOME BISMUTH!");
            output3.setTextColor(Color.parseColor("#000000")); //черный
            output3.setBackgroundColor(Color.parseColor("#8f8777")); //серо-оранжевый
            return "Висмут";
        } else if (upgradeCounter <= 85) {
            output3.setText("PRODUCE SOME PHOSPHORUS!");
            output3.setTextColor(Color.parseColor("#ffffff")); //белый
            output3.setBackgroundColor(Color.parseColor("#910a15")); //красный
            return "Фосфор";
        } else if (upgradeCounter <= 90) {
            output3.setText("PRODUCE SOME COBALT!");
            output3.setTextColor(Color.parseColor("#000000")); //черный
            output3.setBackgroundColor(Color.parseColor("#ebedfc")); //бело-синий
            return "Кобальт";

        }


//TODO: + 42. + Сменить фон на картинку + тест формулы + сменить иконку


        output3.setText("Antimatter!");
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
            output2.setText("Цена апгрейда: " + "\n" + upgrade);
            output3.setText("CHOP DOWN SOME TREES!");
            output3.setTextColor(Color.parseColor("#ffffff")); //белый
            output3.setBackgroundColor(Color.parseColor("#357d2f")); //зелёный
            needForPrestige += 5;
            output4.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);
        }
    }

    public void theme(View view) {
        if (themeNow == 0) {
            findViewById(R.id.background1).setBackgroundColor(Color.parseColor("#000000")); //черный
            themeNow++;
        } else if (themeNow == 1) {
            findViewById(R.id.background1).setBackgroundColor(Color.parseColor("#ffffff")); //белый
            themeNow = 0;
        }
    }
}
