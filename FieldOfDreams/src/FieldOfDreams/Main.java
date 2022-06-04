package FieldOfDreams;

import java.util.Scanner;

public class Main {
    public final static String word = "community";
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String maskWord = "*".repeat(word.length());
        System.out.println("Welcome to the show!");
        System.out.println("Your word is: ");
        System.out.println(maskWord);

        do {
            System.out.println("Say the letter: ");
            char c = scan.next().charAt(0);
            if (word.indexOf(c) >= 0) {
                if (maskWord.indexOf(c) >= 0){
                    System.out.println("Why you said that again?\n- 10 points");
                    count -= 5;
                } else {
                    System.out.println("Correct!\n+ 10 points");
                    count += 10;
                    for (char element : word.toCharArray()) {
                        if (element == c) {
                            maskWord = replaceMaskLetter(c, maskWord);
                        }
                    }
                }
                System.out.println(maskWord);
            } else {
                System.out.println("Miss!\n- 5 points\nTry again!");
                count -= 5;
                System.out.println(maskWord);
            }
        } while(maskWord.contains("*"));
        System.out.println("You win\nYour score is " + count);

        scan.close();
    }

    public static String replaceMaskLetter(char c, String maskWord) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                stringBuilder.append(c);
            } else if (maskWord.charAt(i) != '*') {
                stringBuilder.append(maskWord.charAt(i));
            } else {
                stringBuilder.append("*");
            }
        }
        return stringBuilder.toString();
    }
}
