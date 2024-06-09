package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean checkForPalindrome(String text){
       String cleanText= text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);
    }
public static String convertDecimalToBinary(int decimal){
    LinkedList<Integer>binary=new LinkedList<>();
    while(decimal>0){
        int remain=decimal%2;
        binary.addFirst(remain);
        decimal=decimal/2;
    }
    StringBuilder binaryString = new StringBuilder();
    for (int bit : binary) {
        binaryString.append(bit);
    }

    return binaryString.toString();
}
}