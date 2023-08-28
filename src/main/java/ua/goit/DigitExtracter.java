package ua.goit;

import java.util.Arrays;

/**
 * Task 19
 **/


public class DigitExtracter {
    public int[] extract(String text) {
        String textDigits = text.replaceAll("\\D+", "");
        char[] charNumbers = textDigits.toCharArray();
        int[] numbers = new int[charNumbers.length];
        for (int i = 0; i < charNumbers.length; i++) {
            numbers[i] = charNumbers[i] - '0';
        }
        return numbers;
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
