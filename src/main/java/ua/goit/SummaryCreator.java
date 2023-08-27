package ua.goit;

/**
 * Task 16
 **/

public class SummaryCreator {
    public String create(String text) {
        String shortText = new String(text);
        if (shortText.length() <= 15) {
            return shortText;
        }
        if (shortText.charAt(15) != ' ')
            return shortText.substring(0, 15) + "...";
        else {
            return shortText.substring(0, 15);
        }
    }
}

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
