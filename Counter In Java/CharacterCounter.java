import java.util.*;

class Main
{
    public static HashMap<Character, Integer> counterOfLetters(String word) {
        HashMap<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        return counter;
    }


    public static void main(String[] args) {
        String word = "mississippi";
        System.out.println(counterOfLetters(word));
    }
}