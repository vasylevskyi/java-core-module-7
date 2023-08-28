package ua.goit;

/**
 * Task 23
 **/

public class EmailDetector {
    public boolean isPresent(String text) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.matches("((\\S+|\\w+)[^\\s+]@[^\\s+](\\S+|\\w+))")) return true;
            // OR "\\S{2,}@\\S{2,}"
        }
        return false;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
