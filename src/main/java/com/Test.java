package com;

import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        while (true) {
            // input
            Scanner cin = new Scanner(System.in);
            String s = cin.next();
            // Solution
            LetterCombination letterCombination = new LetterCombination();
            List<String> list = letterCombination.combination(s);
            // to output
            list.forEach(c -> System.out.println("print " + c));
            // Exit
            if (s.equals("exit")) {
                break;
            }
        }
    }
}