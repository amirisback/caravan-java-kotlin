package app;


import app.playground.Word;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Word word = new Word();
        word.outputWord();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);

    }

}
