package ua.goit;

/**
 * Task 24
 **/

public class NameCounter {
    public int count(String text) {
        String[] words = text.split("\\s+");
        int counter = 0;
        for (String word : words) {
            if (word.matches("([A-Z{1}][a-z]+)")) counter++;
        }
        return counter;
   }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
