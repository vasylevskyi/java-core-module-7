package ua.goit;

/**
 * Task 20
 **/

public class BigOrSmall {
    public String calculate(String text) {
        String textWithoutSpaces = text.replaceAll("\\s+", "");
        String small = textWithoutSpaces.replaceAll("[A-Z]", "");
        String big = textWithoutSpaces.replaceAll("[a-z]", "");
        if (small.length() > big.length()) {
            return "Small";
        }
        if (big.length() > small.length()) {
            return "Big";
        }
        return "Same";
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
