package com.company.modul1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> trainDisplay = new ArrayList<>();
        trainDisplay.add(new Locomotive().display());
        System.out.println("Создаём поезд)");
        while (true) {
            System.out.println("Выберите тип вагона: cargo, passngr1cl, passngr2cl ? Или end для завершения.");
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "cargo":
                    trainDisplay.add(new Cargo().display());
                    continue;
                case "passngr1cl":
                    trainDisplay.add(new Passngr1cl().display());
                    continue;
                case "passngr2cl":
                    trainDisplay.add(new Passngr2cl().display());
                    continue;
            }
            if (input.equals("end"))
                break;
        }
        System.out.println();
        System.out.println("Пункт отправки : KHARKOV, KYIV, LVIV");
        City start = null;
        String s = scanner.nextLine().trim().toUpperCase();
        start = City.valueOf(s);

        System.out.println();
        System.out.println("Пункт назначения : KHARKOV, KYIV, LVIV");
        City finish = null;
        String f = scanner.nextLine().trim().toUpperCase();
        finish = City.valueOf(f);

        System.out.println();
        System.out.println("Поезд следует из " + start + " в " + finish + ".");
        System.out.println("Схема поезда:");
        System.out.print(trainDisplay.get(0));
        for (int i = 1; i < trainDisplay.size(); i++) {
            System.out.print(trainDisplay.get(i));
        }
    }
}