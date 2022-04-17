package com.company;

import java.util.Scanner;

public class Main {
    private static boolean czyPierwsza(int v) {
        if (v == 1) {
            return false;
        }
        for (int i = 2; i < (v/2) + 1; i++) {
            if (v%i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {
            number = sc.nextInt();
            String wynik = czyPierwsza(number) == true ? "TAK" : "NIE";
            System.out.println(wynik);

        }
    }
}

