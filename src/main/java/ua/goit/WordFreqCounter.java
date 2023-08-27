package ua.goit;

/**
 * Task 8
 **/

public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] wordsArray = phrase.toLowerCase().split(" ");
        int counter = 0;
        float result;
        for (String wordFromPhrase: wordsArray) {
            if (word.toLowerCase().equals(wordFromPhrase)) {
                counter++;
            }
        }
        result = ((float) counter) / wordsArray.length;
        return result;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
