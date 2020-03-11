package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("please input unencrypted massage: ");
        StringBuilder s = new StringBuilder(input.nextLine());

        System.out.print("\nplease input the number of letters to rotate the alphabet by: ");
        int rotate = input.nextInt();

        StringBuilder lowerCase = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        StringBuilder tempLowerCase = new StringBuilder();
        tempLowerCase.append(lowerCase.substring(rotate));
        tempLowerCase.append(lowerCase.substring(0,rotate));

        StringBuilder upperCase = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuilder tempUpperCase = new StringBuilder();
        tempUpperCase.append(upperCase.substring(rotate));
        tempUpperCase.append(upperCase.substring(0,rotate));

        System.out.println(tempLowerCase+ "  "+tempUpperCase);
        String temp;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 98 || s.charAt(i) <123){
                for (int j = 0; j < lowerCase.length(); j++) {
                    if (s.charAt(i) == lowerCase.charAt(j)){
                        s.setCharAt(i ,tempLowerCase.charAt(j));
                    }
                }
            }else if (s.charAt(i) > 64 || s.charAt(i) < 91){
                for (int j = 0; j < upperCase.length(); j++) {
                    if (s.charAt(i) == upperCase.charAt(j)){
                        s.setCharAt(i ,tempUpperCase.charAt(j));
                    }
                }
            }
        }
        System.out.println();
        System.out.println(s);


    }
}
