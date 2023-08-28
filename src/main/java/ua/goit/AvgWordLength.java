package ua.goit;

/**
 * Task 18
 **/

public class AvgWordLength {
    public double count(String phrase) {
        String[] words = phrase.split(" ");
        int counter = 0;
        double result;
        for (String oneWord: words
             ) {
            counter += oneWord.length();
        }
        result = (double) counter / words.length;
        return result;
    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}


