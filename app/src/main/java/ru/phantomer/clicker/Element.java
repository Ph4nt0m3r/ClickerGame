package ru.phantomer.clicker;

import android.graphics.Color;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum Element {
    TREES("Дерево", 5, 0xFFFFFFFF, Color.parseColor("#357d2f"), "CHOP DOWN SOME TREES!", "дерева", 0),
    STONE("Камень", 10, 0xFFFFFFFF, Color.parseColor("#999c98"), "MINE SOME STONE!", "камня", 0),
    COAL("Уголь", 15, 0xFFFFFFFF, Color.parseColor("#4c4d4c"), "MINE SOME COAL!", "угля", 0),
    COPPER("Медь", 20, 0xFFFFFFFF, Color.parseColor("#e87d13"), "MINE SOME COPPER!", "меди", 0),
    SILVER("Серебро", 25, 0xFF000000, Color.parseColor("#ebebeb"), "MINE SOME SILVER!", "серебра", 0),
    GOLD("Золото", 30, 0xFF000000, Color.parseColor("#fff93d"), "MINE SOME GOLD!", "золота", 0),
    LEAD("Свинец", 35, 0xFFFFFFFF, Color.parseColor("#b1c0c9"), "MINE SOME LEAD!", "свинца", 0),
    TIN("Олово", 40, 0xFF000000, Color.parseColor("#f7fff7"), "MINE SOME TIN!", "олова", 0),
    IRON("Железо", 45, 0xFF000000, Color.parseColor("#dbdad5"), "MINE SOME IRON!", "железа", 0),
    CARBON("Углерод", 50, 0xFFFFFFFF, 0xFF000000, "PRODUCE SOME CARBON!", "углерода", 0),
    ANTIMONY("Сурьма", 55, 0xFF000000, Color.parseColor("#b6f4fa"), "PRODUCE SOME ANTIMONY!", "сурьмы", 0),
    QUICKSILVER("Ртуть", 60, 0xFF000000, Color.parseColor("#d6d6d6"), "PRODUCE SOME QUICKSILVER!", "ртути", 0),
    ZINC("Цинк", 65, 0xFF000000, Color.parseColor("#d7eafc"), "PRODUCE SOME ZINC!", "цинка", 0),
    SULFUR("Сера", 70, 0xFF000000, Color.parseColor("#e6f725"), "PRODUCE SOME SULFUR!", "серы", 0),
    ARSENIC("Мышьяк", 75, 0xFF000000, Color.parseColor("#e0ded1"), "PRODUCE SOME ARSENIC!", "мышьяка", 0),
    BISMUTH("Висмут", 80, 0xFFFFFFFF, Color.parseColor("#8f8777"), "PRODUCE SOME BISMUTH!", "висмута", 0),
    PHOSPHORUS("Фосфор", 85, 0xFFFFFFFF, Color.parseColor("#910a15"), "PRODUCE SOME PHOSPHORUS!", "фосфора", 0),
    COBALT("Кобальт", 90, 0xFF000000, Color.parseColor("#ebedfc"), "PRODUCE SOME COBALT!", "кобальта", 0),
    PLATINUM("Платина", 95, 0xFF000000, Color.parseColor("#e6f5ff"), "PRODUCE SOME PLATINUM!", "платины", 0),
    NICKEL("Никель", 100, 0xFF000000, Color.parseColor("#f0f5df"), "PRODUCE SOME NICKEL!", "никеля", 0),
    HYDROGEN("Водород", 105, 0xFF000000, 0xFFFFFFFF, "PRODUCE SOME HYDROGEN!", "водорода", 0),
    NITROGEN("Азот", 110, 0xFF000000, 0xFFFFFFFF, "PRODUCE SOME NITROGEN!", "азота", 0),
    OXYGEN("Кислород", 115, 0xFF000000, Color.parseColor("#cffdff"), "PRODUCE SOME OXYGEN!", "кислорода", 0),
    MANGANESE("Марганец", 120, 0xFF000000, Color.parseColor("#e6eaff"), "PRODUCE SOME MANGANESE!", "марганца", 0),
    CHLORINE("Хлор", 125, 0xFF000000, Color.parseColor("#c7ff66"), "PRODUCE SOME CHLORINE!", "хлора", 0),
    BARIUM("Барий", 130, 0xFFFFFFFF, Color.parseColor("#4d4f49"), "PRODUCE SOME BARIUM!", "бария", 0),
    MOLYBDENUM("Молибден", 135, 0xFF000000, Color.parseColor("#b5b8ae"), "PRODUCE SOME MOLYBDENUM!", "молибдена", 0),
    TUNGSTEN("Фольфрам", 140, 0xFF000000, Color.parseColor("#ceedc5"), "PRODUCE SOME TUNGSTEN!", "вольфрама", 0),
    TELLURIUM("Теллур", 145, 0xFF000000, Color.parseColor("#f5f1e4"), "PRODUCE SOME TELLURIUM!", "теллура", 0),
    URANIUM("Уран", 150, 0xFF000000, Color.parseColor("#eafcac"), "PRODUCE SOME URANIUM!", "урана", 0),
    ZIRCONIUM ("Цирконий", 155, 0xFF000000, Color.parseColor("#ede8da"), "PRODUCE SOME ZIRCONIUM!", "циркония",0),
    STRONTIUM ("Стронций", 160, 0xFF000000, Color.parseColor("#ffeebf"),"PRODUCE SOME STRONTIUM!", "стронция",0),
    YTTRIUM ("Иттрий", 165, 0xFF000000, Color.parseColor("#c4c4c4"), "PRODUCE SOME YTTRIUM!", "иттрия", 0),
    TITAN ("Титан", 170, 0xFF000000,Color.parseColor("#ededed"), "PRODUCE SOME TITAN!", "титана",0),
    CHROMIUM ("Хром",175, 0xFF000000, Color.parseColor("#d1f3ff"), "PRODUCE SOME CHROMIUM!", "хрома",0),
    BERYLLIUM ("Бериллий", 180, 0xFFFFFFFF, Color.parseColor("#494b52"), "PRODUCE SOME BERYLLIUM!", "берилия",0),
    NIOBIUM ("Ниобий", 185, 0xFF000000, Color.parseColor("#97d2e6"), "PRODUCE SOME NIOBIUM!", "ниобия", 0),
    TANTALUM ("тантал", 190, 0xFFFFFFFF, Color.parseColor("#5b6163"),"PRODUCE SOME TANTALUM!","тантала", 0),;

    private String name;
    private int upgradeStatus;
    private int textColor;
    private int backgroundColor;
    private String displayName;
    private String sklonenie;

    @Setter
    private double elementAmount;
}

