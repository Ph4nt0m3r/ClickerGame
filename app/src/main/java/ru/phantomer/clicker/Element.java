package ru.phantomer.clicker;

import android.graphics.Color;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Element {
    TREES("Дерево", 5, Color.WHITE, Color.parseColor("#357d2f"), "CHOP DOWN SOME TREES!", "дерева",0),
    STONE("Камень", 10, Color.WHITE, Color.parseColor("#999c98"), "MINE SOME STONE!", "камня",0),
    COAL("Уголь", 15, Color.WHITE, Color.parseColor("#4c4d4c"), "MINE SOME COAL!", "угля",0),
    COPPER("Медь", 20, Color.WHITE, Color.parseColor("#e87d13"), "MINE SOME COPPER!", "меди",0),
    SILVER("Серебро", 25, Color.BLACK, Color.parseColor("#ebebeb"), "MINE SOME SILVER!", "серебра",0),
    GOLD("Золото", 30, Color.BLACK, Color.parseColor("#fff93d"), "MINE SOME GOLD!", "золота",0),
    LEAD("Свинец", 35, Color.WHITE, Color.parseColor("#b1c0c9"), "MINE SOME LEAD!", "свинца",0),
    TIN("Олово", 40, Color.BLACK, Color.parseColor("#f7fff7"), "MINE SOME TIN!", "олова",0),
    IRON("Железо", 45, Color.BLACK, Color.parseColor("#dbdad5"), "MINE SOME IRON!", "железа",0),
    CARBON("Углерод", 50, Color.WHITE, Color.BLACK, "PRODUCE SOME CARBON!", "углерода",0),
    ANTIMONY("Сурьма", 55, Color.BLACK, Color.parseColor("#b6f4fa"), "PRODUCE SOME ANTIMONY!", "сурьмы",0),
    QUICKSILVER("Ртуть", 60, Color.BLACK, Color.parseColor("#d6d6d6"), "PRODUCE SOME QUICKSILVER!", "ртути",0),
    ZINC("Цинк", 65, Color.BLACK, Color.parseColor("#d7eafc"), "PRODUCE SOME ZINC!", "цинка",0),
    SULFUR("Сера", 70, Color.BLACK, Color.parseColor("#e6f725"), "PRODUCE SOME SULFUR!", "серы",0),
    ARSENIC("Мышьяк", 75, Color.BLACK, Color.parseColor("#e0ded1"), "PRODUCE SOME ARSENIC!", "мышьяка",0),
    BISMUTH("Висмут", 80, Color.WHITE, Color.parseColor("#8f8777"), "PRODUCE SOME BISMUTH!", "висмута",0),
    PHOSPHORUS("Фосфор", 85, Color.WHITE, Color.parseColor("#910a15"), "PRODUCE SOME PHOSPHORUS!", "фосфора",0),
    COBALT("Кобальт", 90, Color.BLACK, Color.parseColor("#ebedfc"), "PRODUCE SOME COBALT!", "кобальта",0),
    PLATINUM("Платина",95,Color.BLACK,Color.parseColor("#e6f5ff"),"PRODUCE SOME PLATINUM!","платины",0),
    NICKEL("Никель",100,Color.BLACK,Color.parseColor("#f0f5df"),"PRODUCE SOME NICKEL!","никеля",0),
    Hydrogen("Водород",105,Color.BLACK, Color.WHITE,"PRODUCE SOME HYDROGEN!","водорода",0),
    Nitrogen("Азот",110,Color.BLACK,Color.WHITE,"PRODUCE SOME NITROGEN!","азота",0),
    Oxygen ("Кислород", 115,Color.BLACK,Color.parseColor("#cffdff"),"PRODUCE SOME OXYGEN!","кислорода",0),
    Manganese ("Марганец",120,Color.BLACK,Color.parseColor("#e6eaff"),"PRODUCE SOME MANGANESE!","марганца",0),
    Chlorine ("Хлор",125, Color.BLACK,Color.parseColor("#c7ff66"),"PRODUCE SOME CHLORINE!","хлора",0),
    Barium ("Барий",130, Color.WHITE,Color.parseColor("#4d4f49"),"PRODUCE SOME BARIUM!", "бария",0),
    Molybdenum ("Молибден",135, Color.BLACK, Color.parseColor("#b5b8ae"),"PRODUCE SOME MOLYBDENUM!","молибдена",0),
    Tungsten ("Фольфрам",140, Color.BLACK,Color.parseColor("#ceedc5"),"PRODUCE SOME TUNGSTEN!", "вольфрама",0),
    Tellurium ("Теллур",145,Color.BLACK, Color.parseColor("#f5f1e4"), "PRODUCE SOME TELLURIUM!", "теллура",0),
    Uranium ("Уран", 150, Color.BLACK,Color.parseColor("#eafcac"),"PRODUCE SOME URANIUM!","урана",0),;

    private String name;
    private int upgradeStatus;
    private int textColor;
    private int backgroundColor;
    private String displayName;
    private String sklonenie;
    public double elementAmount;
}
