import java.util.*;

class Main
{
    public static HashMap<String, Integer> counterOfWords(String sentence) {  // almost a word count problem
        HashMap<String, Integer> counter = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word: words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }

        return counter;
    }


    public static void main(String[] args) {
        String sentence = "hela thor loki hela loki thor loki loki hela";
        System.out.println(counterOfWords(sentence));
    }
}