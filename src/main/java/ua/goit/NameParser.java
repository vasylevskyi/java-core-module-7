package ua.goit;

/**
 * Task 29
 **/

public class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            result.append(names[i].split(" ")[0]);
            if (i != names.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}