package ru.phantomer.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {

    private TextView output, themeButton, prestigeButton, clickButton, upgradeButton;
    private int upgrade = 100, upgradeCounter = 0;
    private int addAmount = 1;
    private int prestige = 0, needForPrestige = 10;
    private int prestigeClickAmount =0; /*temp*/
    private int clickingProducing = 1, upgradeProducing = 1;
    private boolean themeNow = false;
    private int white = 0xFFFFFFFF, black = 0xFF000000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        output = findViewById(R.id.textView);
        output.setText("Кол-во дерева: " + 0 + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
        upgradeButton = findViewById(R.id.button2);
        upgradeButton.setText("UPGRADE!" + "\n" + "Цена апгрейда: " + "\n" + upgrade);
        clickButton = findViewById(R.id.button);
        prestigeButton = findViewById(R.id.button3);
        prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);
        themeButton = findViewById(R.id.button5);
    }

    //Клики и вывод текста на textView
    public void clickHandler(View view) {
        currentElement().setElementAmount(currentElement().getElementAmount()+clickingProducing);
        output.setText("Кол-во " + currentElement().getSklonenie() + ": " + currentElement().getElementAmount() + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);

        prestigeClickAmount = 0; /*temp*/
        prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige); /*temp*/
    }

    //Улучшения и вывод текста на textView
    public void upgradeHandler(View view) {
        if (currentElement().getElementAmount() >= upgrade) {
            currentElement().setElementAmount(currentElement().getElementAmount()-upgrade);
            clickingProducing++;
            upgrade += 10 * upgradeProducing;
            upgradeCounter++;
            upgradeProducing++;
            upgradeButton.setText("UPGRADE!" + "\n" + "Цена апгрейда: " + "\n" + upgrade);

            output.setText("Кол-во " + currentElement().getSklonenie() + ": " + currentElement().getElementAmount() + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
        }

        prestigeClickAmount = 0; /*temp*/
        prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);/*temp*/
    }

    //Определение ресурсов и их вывод на кнопку
    public Element currentElement() {

        if ((upgradeCounter % 5 == 1 && addAmount == upgradeCounter / 5)
                || (upgradeCounter == 5 && addAmount == 1)) {
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

    // Механика престижа.
    public void prestigeReset(View view) {

            prestigeClickAmount++; /*temp*/
            if (prestigeClickAmount==1) { /*temp*/
            prestigeButton.setText("Подтвердите действие повторным нажатием"); /*temp*/
            return; /*temp*/
            }
            else if ((prestigeClickAmount==2) & (upgradeCounter < needForPrestige)) { /*temp*/
                prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige); /*temp*/
                prestigeClickAmount = 0; /*temp*/

            }
       else if ((upgradeCounter >= needForPrestige)& /*temp*/(prestigeClickAmount == 2)) {
            prestige++;
            upgrade = 100;
            upgradeCounter = 0;
            addAmount = 1;
            upgradeProducing = 1;
            output.setText("Кол-во " + currentElement().getSklonenie() + ": " + currentElement().getElementAmount() + "\n" + "PRESTIGE LVL= " + prestige + "\n" + "PRODUCING= " + clickingProducing + "\n" + "LVL= " + upgradeCounter);
            upgradeButton.setText("Цена апгрейда: " + "\n" + upgrade);
            clickButton.setText(currentElement().getDisplayName());
            clickButton.setTextColor(currentElement().getTextColor());
            clickButton.setBackgroundColor(currentElement().getBackgroundColor());
            needForPrestige += 10;
            prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige);
            prestigeClickAmount=0; /*temp*/
        }
    }

    //Смена темы.
    public void changeTheme(View view) {
        findViewById(R.id.background1).setBackgroundColor(themeNow ? white : black);
        output.setTextColor(themeNow ? black : white);
        themeButton.setBackgroundColor(themeNow ? black : white);
        themeButton.setTextColor(themeNow ? white : black);
        themeNow = !themeNow;

        prestigeClickAmount = 0; /*temp*/
        prestigeButton.setText("PRESTIGE!" + "\n" + "REQ.LVL= " + needForPrestige); /*temp*/
    }

    //TODO: + 24. + Сменить фон на картинку + сменить иконку + смена цвета текста +
    // меню выбора цвета + подтверждение сброса уровня (Диалоговое окно) +
    // придумать более увлекательную формулу +
    // инвентарь и постройки?

}

