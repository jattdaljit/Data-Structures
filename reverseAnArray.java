public class Test {

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 7, 79};
        Arrays.stream(reverseArray(a)).forEach(System.out::println);

    }

    static public int[] reverseArray(int[] a) {
        int reverse[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            reverse[a.length - 1 - i] = a[i];
        }
        return reverse;
    }

}