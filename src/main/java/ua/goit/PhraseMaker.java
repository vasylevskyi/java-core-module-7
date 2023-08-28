package ua.goit;

/**
 * Task 26
 **/

public class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            if (words[i].length() <= 3) {
                result.append(words[i].toUpperCase());
            } else {
                result.append(words[i].toLowerCase());
            }
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}