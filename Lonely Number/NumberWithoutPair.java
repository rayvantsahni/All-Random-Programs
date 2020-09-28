class Main
{
    public static int numberWithoutPair(int[] arr) {
        int n = 0;

        for (int number: arr)
            n ^= number;

        return n;
    }


    public static void main(String[] args) {
        int[] arr = {1,9,5,9,3,8,1,3,5};
        System.out.println("Only number without pair is " + numberWithoutPair(arr));
    }
}