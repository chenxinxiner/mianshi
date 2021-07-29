package algorithm.sort;

public class QuickSort {

    public static <T extends Comparable<T>> void sort(T[] array) {
        sort(array,0, array.length-1);
    }

    private static <T extends Comparable<T>> void sort(T[] array,int left,int right) {

    }

    private static <T extends Comparable<T>> void partition(T[] array, int left,int right) {
        int mid = (right+left) >>> 1;

    }

    public static void main(String[] args) {
    }
}
