package org.example;

public class Main {
    static long time;
    static int pcs = 10_000;
    public static Notebook[] notebooks = new Notebook[pcs];

    public static void main(String[] args) {
        time = System.currentTimeMillis();

        fill();
        notebooks = Sort.sorByBrand(notebooks);
//        show();
//        printTime();

        notebooks = Sort.sortByRAM(notebooks);
//        show();
//        printTime();

        notebooks = Sort.sortByPrice(notebooks);
        show();
//        printTime();

    }

    private static void show() {
        for (Notebook notebook : notebooks) {
            print(notebook.price + "$, RAM " + notebook.ram + "gb, " + notebook.brand);
        }
    }

    private static void fill() {
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void printTime() {
        print(Integer.toString((int)(System.currentTimeMillis() - time)) + " Millis");
        time = System.currentTimeMillis();
    }
}