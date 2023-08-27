package ua.goit;

import java.util.Arrays;

/**
 * Task 12
 **/


public class UniqueCharCounter {
    public int count(String phrase) {
        int counter = 1;
        char[] phraseChars = phrase.toCharArray();
        Arrays.sort(phraseChars);
        for (int i = 0; i < phraseChars.length - 1; i++) {
            if (phraseChars[i] == phraseChars[i+1]) {
                continue;
            }
            counter++;
        }
        return counter;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
