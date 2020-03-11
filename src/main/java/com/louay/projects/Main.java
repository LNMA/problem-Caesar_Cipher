package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input unencrypted massage: ");
        StringBuilder s = new StringBuilder(input.nextLine());

        System.out.print("\nplease input the number of letters to rotate the alphabet by: ");
        int rotate = input.nextInt();

        StringBuilder lowerCase = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        StringBuilder tempLowerCase = new StringBuilder();
        tempLowerCase.append(lowerCase.substring(rotate));
        tempLowerCase.append(lowerCase.substring(0, rotate));

        StringBuilder upperCase = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuilder tempUpperCase = new StringBuilder();
        tempUpperCase.append(upperCase.substring(rotate));
        tempUpperCase.append(upperCase.substring(0, rotate));

        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp > 98 || temp < 123) {
                for (int j = 0; j < lowerCase.length(); j++) {
                    if (temp == lowerCase.charAt(j)) {
                        s.setCharAt(i, tempLowerCase.charAt(j));
                    }
                }
            }
            if (temp > 64 || temp < 91) {
                for (int j = 0; j < upperCase.length(); j++) {
                    if (temp == upperCase.charAt(j)) {
                        s.setCharAt(i, tempUpperCase.charAt(j));
                    }
                }
            }
        }

        System.out.println("\n"+s);

    }
}
