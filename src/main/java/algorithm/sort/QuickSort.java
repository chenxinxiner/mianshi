package algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    public static <T extends Comparable<T>> void sort(T[] array) {
        sort(array,0, array.length-1);
    }

    private static <T extends Comparable<T>> void sort(T[] array,int left,int right) {
        if (left >= right) return;
        int l = partition(array, left, right);
        sort(array,left,l);
        sort(array,l+1,right);
    }

    private static <T extends Comparable<T>> int partition(T[] array, int left,int right) {
        int i = left+1;
        int j = right;
        T t = array[left];
        while (true) {
            while (t.compareTo(array[i]) > 0) {
                i++;
                if (i == right) {
                    break;
                }
            }
            while (t.compareTo(array[j]) < 0) {
                j--;
                if (j == left) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(array,i,j);
        }
        swap(array,left,j);
        return j;
    }

    public static <T extends Comparable<T>> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] l = new Integer[]{10,26554,33,45,13,65,87,234,64,6577,123,765};
        sort(l);
        System.out.println(Arrays.toString(l));
    }
}
