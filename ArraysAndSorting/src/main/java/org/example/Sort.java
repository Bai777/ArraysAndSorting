package org.example;

import java.util.Arrays;

public class Sort {
    static int[] Lenuvo;
    static int[] Asos;
    static int[] MacNote;
    static int[] Eser;
    static int[] Xamiou;
    static int LenuvoCounter;
    static int AsosCounter;
    static int MacNoteCounter;
    static int EserCounter;
    static int XamiouCounter;

    public static Notebook[] sorByBrand(Notebook[] array) {
        Notebook[] newArray = new Notebook[array.length];

        Lenuvo = new int[array.length];
        Asos = new int[array.length];
        MacNote = new int[array.length];
        Eser = new int[array.length];
        Xamiou = new int[array.length];

        LenuvoCounter = 0;
        AsosCounter = 0;
        MacNoteCounter = 0;
        EserCounter = 0;
        XamiouCounter = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i].brand) {
                case "Lenuvo":
                    Lenuvo[LenuvoCounter] = i;
                    LenuvoCounter++;
                    break;
                case "Asos":
                    Asos[AsosCounter] = i;
                    AsosCounter++;
                    break;
                case "MacNote":
                    MacNote[MacNoteCounter] = i;
                    MacNoteCounter++;
                    break;
                case "Eser":
                    Eser[EserCounter] = i;
                    EserCounter++;
                    break;
                default:
                    Xamiou[XamiouCounter] = i;
                    XamiouCounter++;
            }
        }

        int counter;

        for (int i = 0; i < LenuvoCounter; i++) {
            newArray[i] = array[Lenuvo[i]];
        }
        counter = LenuvoCounter;
        for (int i = 0; i < AsosCounter; i++) {
            newArray[i + counter] = array[Asos[i]];
        }
        counter += AsosCounter;
        for (int i = 0; i < MacNoteCounter; i++) {
            newArray[i + counter] = array[MacNote[i]];
        }
        counter += MacNoteCounter;
        for (int i = 0; i < EserCounter; i++) {
            newArray[i + counter] = array[Eser[i]];
        }
        counter += EserCounter;
        for (int i = 0; i < XamiouCounter; i++) {
            newArray[i + counter] = array[Xamiou[i]];
        }

        return newArray;
    }

    public static Notebook[] sortByRAM(Notebook[] array) {

        Notebook[] newArray = new Notebook[array.length];

        int[] RAM4 = new int[array.length];
        int[] RAM8 = new int[array.length];
        int[] RAM16 = new int[array.length];
        int[] RAM20 = new int[array.length];
        int[] RAM24 = new int[array.length];
        int RAM4Counter = 0;
        int RAM8Counter = 0;
        int RAM16Counter = 0;
        int RAM20Counter = 0;
        int RAM24Counter = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i].ram) {
                case 4:
                    RAM4[RAM4Counter] = i;
                    RAM4Counter++;
                    break;
                case 8:
                    RAM8[RAM8Counter] = i;
                    RAM8Counter++;
                    break;
                case 16:
                    RAM16[RAM16Counter] = i;
                    RAM16Counter++;
                    break;
                case 20:
                    RAM20[RAM20Counter] = i;
                    RAM20Counter++;
                    break;
                default:
                    array[i].ram = 24;
                    RAM24[RAM24Counter] = i;
                    RAM24Counter++;
            }
        }

        int counter = 0;

        for (int i = 0; i < RAM24Counter; i++) {
            newArray[i] = array[RAM24[i]];
        }
        counter = RAM24Counter;

        for (int i = 0; i < RAM20Counter; i++) {
            newArray[i + counter] = array[RAM20[i]];
        }
        counter += RAM20Counter;

        for (int i = 0; i < RAM16Counter; i++) {
            newArray[i + counter] = array[RAM16[i]];
        }
        counter += RAM16Counter;

        for (int i = 0; i < RAM8Counter; i++) {
            newArray[i + counter] = array[RAM8[i]];
        }
        counter += RAM8Counter;

        for (int i = 0; i < RAM4Counter; i++) {
            newArray[i + counter] = array[RAM4[i]];
        }

        return newArray;
    }

    public static Notebook[] sortByPrice(Notebook[] array) {
        Notebook[] newArray = new Notebook[array.length];

        int[] price100 = new int[array.length];
        int[] price200 = new int[array.length];
        int[] price300 = new int[array.length];
        int[] price400 = new int[array.length];
        int[] price500 = new int[array.length];
        int[] price600 = new int[array.length];
        int[] price700 = new int[array.length];

        int price100Counter = 0;
        int price200Counter = 0;
        int price300Counter = 0;
        int price400Counter = 0;
        int price500Counter = 0;
        int price600Counter = 0;
        int price700Counter = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i].price) {
                case 100:
                    price100[price100Counter] = i;
                    price100Counter++;
                    break;
                case 200:
                    price200[price200Counter] = i;
                    price200Counter++;
                    break;
                case 300:
                    price300[price300Counter] = i;
                    price300Counter++;
                    break;
                case 400:
                    price400[price400Counter] = i;
                    price400Counter++;
                    break;
                case 500:
                    price500[price500Counter] = i;
                    price500Counter++;
                    break;
                case 600:
                    price600[price600Counter] = i;
                    price600Counter++;
                    break;
                default:
                    price700[price700Counter] = i;
                    price700Counter++;
            }
        }

        int counter = 0;

        for (int i = 0; i < price100Counter; i++) {
            newArray[i] = array[price100[i]];
        }
        counter += price100Counter;

        for (int i = 0; i < price200Counter; i++) {
            newArray[i + counter] = array[price200[i]];
        }
        counter += price200Counter;

        for (int i = 0; i < price300Counter; i++) {
            newArray[i + counter] = array[price300[i]];
        }
        counter += price300Counter;

        for (int i = 0; i < price400Counter; i++) {
            newArray[i + counter] = array[price400[i]];
        }
        counter += price400Counter;

        for (int i = 0; i < price500Counter; i++) {
            newArray[i + counter] = array[price500[i]];
        }
        counter += price500Counter;

        for (int i = 0; i < price600Counter; i++) {
            newArray[i + counter] = array[price600[i]];
        }
        counter += price600Counter;

        for (int i = 0; i < price700Counter; i++) {
            newArray[i + counter] = array[price700[i]];
        }
        return newArray;
    }
}
