package com.baghaniya.datastruture.Array;
/*
* Given a sorted array, remove the duplicates in place such that each element appear only
* once and return the new length.
*
* */
public class RemoveDuplicate {

    public static void main(String[] args){
        int[] inputArr = {1,1,1,2,2,3,4,4};
        int n= inputArr.length;

        int sol = removeDuplicate(inputArr,n);

        for(int i=0;i<=sol;i++){
            System.out.println(inputArr[i]+" ");
        }
    }

    private static int removeDuplicate(int[] inputArr, int n) {
        if(n<2)
            return n;

        int i=0,j=1;
        while (j<n){
            if (inputArr[i]==inputArr[j]){
                j++;
            }else {
                i++;
                inputArr[i] = inputArr[j];
            }
        }
       return i;
    }
}
