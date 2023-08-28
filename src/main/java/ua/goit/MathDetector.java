package ua.goit;

import java.util.Arrays;

/**
 * Task 17
 **/

public class MathDetector {
    public boolean isMath(String text) {
        String textWithoutLettersAndSpaces = text.replaceAll("[A-Z]|[a-z]|\\s+", "");
        int countNumbers = 0;
        int countMathOperator = 0;
        int countEqualSign = 0;
        //System.out.println(textWithoutLettersAndSpaces);
        if (textWithoutLettersAndSpaces.equals("")) {
            return false;
        }
        char[] textLeft = textWithoutLettersAndSpaces.toCharArray();
        for (char oneChar: textLeft) {
            if (oneChar >= '0' && oneChar <= '9') {
                countNumbers++;
            }
            if (oneChar == '+' || oneChar == '-' || oneChar == '*' || oneChar == '/') {
                countMathOperator++;
            }
            if (oneChar == '=') {
                countEqualSign++;
            }
        }
        if (countMathOperator >= 1 && countEqualSign >= 1 && countNumbers >= 2) {
            return true;
        } else {
            return false;
        }

    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));

        //false
        System.out.println(new MathDetector().isMath("d+g=3"));

    }
}
