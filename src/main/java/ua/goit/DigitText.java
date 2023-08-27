package ua.goit;

/**
 * Task 15
 **/

public class DigitText {
    public boolean detect(String text) {
        String textWithoutSpaces = text.replaceAll("\\s+", "");
        if (textWithoutSpaces.matches("\\d+")) {
            return true;
        }
        return false;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
