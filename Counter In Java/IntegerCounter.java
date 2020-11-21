import java.util.*;

class Main
{
    public static HashMap<Integer, Integer> counterOfNumbers(int[] arr) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int number: arr) {
            counter.put(number, counter.getOrDefault(number, 0) + 1);
        }

        return counter;
    }


    public static void main(String[] args) {
        int[] array = {3, 7, 6, 3, 6, 8, 3, 6};
        System.out.println(counterOfNumbers(array));
    }
}