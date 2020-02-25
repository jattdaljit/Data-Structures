public class Test {

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 7, 79};
        System.out.println(findMax(a, 0));

    }

    static public int findMax(int[] a, int i) {
        if (i == a.length - 1) return a[i];
        return Math.max(a[i], findMax(a, i + 1));
    }

}