package FieldOfDreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public final static String word = "community";
    public static int count = 0;

    public static void main(String[] args) throws FileNotFoundException {
        int globalCount = readData();

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
        globalCount += count;
        System.out.println("General score is " + globalCount);
        printData(new File("score"),globalCount);

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

    public static int readData() throws FileNotFoundException {
        Scanner scanMethod = new Scanner(new File("score"));
        int answer = Integer.parseInt(scanMethod.nextLine());
        scanMethod.close();
        return answer;
    }

    public static void printData(File file, int score) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print("");
        printWriter.print(score);
        printWriter.close();
    }
}
