package com.epam.Demo;

public class ArrayIsHeap{
    public static void main(String[] args) {
        int a[] = {20,15,10,7,12,2};
        boolean flag = false;
        for(int i =0; i< a.length; i++){
            if(2*i+1 < a.length && a[i] < a[2*i+1]){
                flag = true;
            } if (2*i+2 < a.length && a[i] < a[2*i+2]){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Not a heap");
        } else {
            System.out.println("Heap");
        }
    }
}
