package com.daniel.abc;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c = scanner.next().charAt(0);
        String s = String.valueOf(c);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
