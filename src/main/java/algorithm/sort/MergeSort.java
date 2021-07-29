package algorithm.sort;

import java.util.Arrays;

public class MergeSort {

    public static <T extends Comparable<T>> void sort(T[] array) {
        sort(array,0, array.length-1);
    }

    private static <T extends Comparable<T>> void sort(T[] array,int left,int right) {
        if (left < right) {
            //使用 >>>（有符号右移），不使用/、>>（无符号右移）可以防止大数溢出的问题
            int mid = (left + right) >>> 1;
            sort(array, left, mid);
            sort(array, mid+1, right);
            merge(array,left,mid,right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] array, int left, int mid,int right) {
        int length = right - left + 1;
        T[] buff = (T[]) new Comparable[length];
        int lb = left;
        int midt = mid+1;
        int k =0;
        while (lb <= mid && midt <= right) {
            if (array[lb].compareTo(array[midt]) >= 0) {
                buff[k++] = array[midt++];
            } else {
                buff[k++] = array[lb++];
            }
        }
        while (lb <= mid) {
            buff[k++] = array[lb++];
        }
        while (midt <= right) {
            buff[k++] = array[midt++];
        }
        System.arraycopy(buff,0,array,left,length);
    }

    public static void main(String[] args) {
        Integer[] l = new Integer[]{10,26554,33,45,13,65,87,234,64,6577,123,765};
        sort(l);
        System.out.println(Arrays.toString(l));
    }
}
