package ru.phantomer.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {

    private TextView output, themeButton, prestigeButton, clickButton, upgradeButton;
    private double itemAmount = 0;
    private int upgrade = 100, upgradeCounter = 0;
    private int addAmount = 1;
    private int prestige = 0, needForPrestige = 5;
    private int clickingProducing = 1, upgradeProducing = 1;
    private boolean themeNow = false;
    private int white = 0xFFFFFFFF, black = 0xFF000000;

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
    public void upgradeHandler(View view) {
        getPresentElement();
        if (itemAmount >= upgrade) {
            itemAmount -= upgrade;
            clickingProducing++;
            upgrade += 10 * upgradeProducing;
            upgradeCounter++;
            upgradeProducing++;
            upgradeButton.setText("UPGRADE!" + "\n" + "Цена апгрейда: " + "\n" + upgrade);

            output.setText("Кол-во " + getPresentElement().getSklonenie() + ": " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
        }
    }

    //Клики и вывод текста на textView
    public void clickHandler(View view) {
        itemAmount += clickingProducing;
        output.setText("Кол-во " + getPresentElement().getSklonenie() + ": " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
    }

    //Определение ресурсов и их вывод на кнопку
    public Element getPresentElement() {

        if ((upgradeCounter % 5 == 1 && addAmount == upgradeCounter / 5)
                || (upgradeCounter == 5 && addAmount == 1)) {
            itemAmount = 0;
            addAmount++;
        }

        for (Element element : Element.values()) {
            if (upgradeCounter <= element.getUpgradeStatus()) {
                clickButton.setText(element.getDisplayName());
                clickButton.setTextColor(element.getTextColor());
                clickButton.setBackgroundColor(element.getBackgroundColor());
                return element;
            }
        }
        return Element.TREES;
    }

    //TODO: + 30. + Сменить фон на картинку + сменить иконку + смена цвета текста +
    // меню выбора цвета + подтверждение сброса уровня +
    // придумать более увлекательную формулу (мб переменная для всех ресов?) +
    // инвентарь и постройки?

    /**
     * Механика престижа.
     *
     * @param view - позволяет увидеть кнопке метод
     */
    public void prestigeReset(View view) {
        if (upgradeCounter >= needForPrestige) {
            prestige++;
            itemAmount = 0;
            upgrade = 100;
            upgradeCounter = 0;
            addAmount = 1;
            upgradeProducing = 1;
            output.setText("Кол-во " + getPresentElement().getSklonenie() + ": " + itemAmount + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
            upgradeButton.setText("Цена апгрейда: " + "\n" + upgrade);
            clickButton.setText(getPresentElement().getDisplayName());
            clickButton.setTextColor(getPresentElement().getTextColor());
            clickButton.setBackgroundColor(getPresentElement().getBackgroundColor());
            needForPrestige += 5;
            prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);
        }
    }

    //Смена темы.
    public void changeTheme(View view) {
        findViewById(R.id.background1).setBackgroundColor(themeNow ? white : black);
        output.setTextColor(themeNow ? black : white);
        themeButton.setBackgroundColor(themeNow ? black : white);
        themeButton.setTextColor(themeNow ? white : black);
        themeNow = !themeNow;
    }
}

