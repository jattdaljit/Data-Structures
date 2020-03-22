package com.epam.Demo;

import java.util.Arrays;

public class MergeHeap {
    public static void main(String[] args) {
        int a[] = {20,15,10,7,12,2};
        int b[] = {14,9,10,1,3};

        int c[] = new int[a.length + b.length];

        int index = 0;
        for(int i=0; i< a.length; i++){
            c[index] = a[i];
            index++;
        }

        for(int i=0; i< b.length; i++){
            c[index] = b[i];
            heapyfiy(c,index);
            index++;
        }

        Arrays.stream(c).forEach(System.out::println);
    }

    public static void heapyfiy(int[] arr, int i){
     if(i <= 0) {
         return;
     }
     if(i % 2 == 0) {
         int x = (i-2)/2;
         if(arr[i] > arr[x]){
             int temp = arr[i];
             arr[i] = arr[x];
             arr[x] = temp;
         }
         heapyfiy(arr, x);
         return;
     }
        if(i % 2 != 0) {
            int x = (i-1)/2;
            if(arr[i] > arr[x]){
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }
            heapyfiy(arr, x);
            return;
        }
    }
}
