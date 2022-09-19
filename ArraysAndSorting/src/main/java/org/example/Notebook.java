package org.example;

import java.util.Random;

public class Notebook {
    private static final int maxRam = 5;
    private static final int minRam = 1;
    private static final int maxPrice = 7;
    private static final int minPrice = 1;

    private static final int maxBrand = 4;
    private static final int minBrand = 0;


    public int ram;
    public int price;
    public String brand;
    Random random = new Random();

    public Notebook() {
        ram = randomRam();
        price = randomPrice();
        brand = randomBrand();
    }
    private int randomRam() {
        return (int) (Math.random() * ((maxRam - minRam) + 1) + minRam) * 4;
    }

    private int randomPrice() {
        return (int) (Math.random() * ((maxPrice - minPrice) + 1) + minPrice) * 100;
    }

    private String randomBrand() {
        int max = (int) (Math.random() * ((maxBrand - minBrand) + 1) + minBrand);
        switch (max) {
            case 0:
                return "Lenuvo";
            case 1:
                return "Asos";
            case 2:
                return "MacNote";
            case 3:
                return "Eser";
            default:
                return "Xamiou";
        }
    }


}
