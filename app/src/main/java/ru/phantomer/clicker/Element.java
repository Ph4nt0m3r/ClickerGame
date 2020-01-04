package ru.phantomer.clicker;

import android.graphics.Color;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Element {
    TREES("Дерево", 5, Color.WHITE, Color.parseColor("#357d2f"), "CHOP DOWN SOME TREES!", "дерева"),
    STONE("Камень", 10, Color.WHITE, Color.parseColor("#999c98"), "MINE SOME STONE!", "камня"),
    COAL("Уголь", 15, Color.WHITE, Color.parseColor("#4c4d4c"), "MINE SOME COAL!", "угля"),
    COPPER("Медь", 20, Color.WHITE, Color.parseColor("#e87d13"), "MINE SOME COPPER!", "меди"),
    SILVER("Серебро", 25, Color.BLACK, Color.parseColor("#ebebeb"), "MINE SOME SILVER!", "серебра"),
    GOLD("Золото", 30, Color.BLACK, Color.parseColor("#fff93d"), "MINE SOME GOLD!", "золота"),
    LEAD("Свинец", 35, Color.WHITE, Color.parseColor("#b1c0c9"), "MINE SOME LEAD!", "свинца"),
    TIN("Олово", 40, Color.BLACK, Color.parseColor("#f7fff7"), "MINE SOME TIN!", "олова"),
    IRON("Железо", 45, Color.BLACK, Color.parseColor("#dbdad5"), "MINE SOME IRON!", "железа"),
    CARBON("Углерод", 50, Color.WHITE, Color.BLACK, "PRODUCE SOME CARBON!", "углерода"),
    ANTIMONY("Сурьма", 55, Color.BLACK, Color.parseColor("#b6f4fa"), "PRODUCE SOME ANTIMONY!", "сурьмы"),
    QUICKSILVER("Ртуть", 60, Color.BLACK, Color.parseColor("#d6d6d6"), "PRODUCE SOME QUICKSILVER!", "ртути"),
    ZINC("Цинк", 65, Color.BLACK, Color.parseColor("#d7eafc"), "PRODUCE SOME ZINC!", "цинка"),
    SULFUR("Сера", 70, Color.BLACK, Color.parseColor("#e6f725"), "PRODUCE SOME SULFUR!", "серы"),
    ARSENIC("Мышьяк", 75, Color.BLACK, Color.parseColor("#e0ded1"), "PRODUCE SOME ARSENIC!", "мышьяка"),
    BISMUTH("Висмут", 80, Color.WHITE, Color.parseColor("#8f8777"), "PRODUCE SOME BISMUTH!", "висмута"),
    PHOSPHORUS("Фосфор", 85, Color.WHITE, Color.parseColor("#910a15"), "PRODUCE SOME PHOSPHORUS!", "фосфора"),
    COBALT("Кобальт", 90, Color.BLACK, Color.parseColor("#ebedfc"), "PRODUCE SOME COBALT!", "кобальта"),
    PLATINUM("Платина",95,Color.BLACK,Color.parseColor("#e6f5ff"),"PRODUCE SOME PLATINUM!","платины"),
    NICKEL("Никель",100,Color.BLACK,Color.parseColor("#f0f5df"),"PRODUCE SOME NICKEL!","никеля"),
    Hydrogen("Водород",105,Color.BLACK, Color.WHITE,"PRODUCE SOME HYDROGEN!","водорода"),
    Nitrogen("Азот",110,Color.BLACK,Color.WHITE,"PRODUCE SOME NITROGEN!","азота" ),
    Oxygen ("Кислород", 115,Color.BLACK,Color.parseColor("#cffdff"),"PRODUCE SOME OXYGEN!","кислорода"),
    Manganese ("Марганец",120,Color.BLACK,Color.parseColor("#e6eaff"),"PRODUCE SOME MANGANESE!","марганца"),
    Chlorine ("Хлор",125, Color.BLACK,Color.parseColor("#c7ff66"),"PRODUCE SOME CHLORINE!","хлора"),
    Barium ("Барий",130, Color.WHITE,Color.parseColor("#4d4f49"),"PRODUCE SOME BARIUM!", "бария"),
    Molybdenum ("Молибден",135, Color.BLACK, Color.parseColor("#b5b8ae"),"PRODUCE SOME MOLYBDENUM!","молибдена"),
    Tungsten ("Фольфрам",140, Color.BLACK,Color.parseColor("#ceedc5"),"PRODUCE SOME TUNGSTEN!", "вольфрама"),
    Tellurium ("Теллур",145,Color.BLACK, Color.parseColor("#f5f1e4"), "PRODUCE SOME TELLURIUM!", "теллура"),
    Uranium ("Уран", 150, Color.BLACK,Color.parseColor("#eafcac"),"PRODUCE SOME URANIUM!","урана"),;

    private String name;
    private int upgradeStatus;
    private int textColor;
    private int backgroundColor;
    private String displayName;
    private String sklonenie;
}
