package Searching.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        //driver function

        int[] arr = {-19,-11,2,3,4,5,7,88};
        int target = 21;

        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }


    //return the index
    //return -1 if not exist

    static int binarySearch(int[ ] arr, int target){


        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            //find the mid element

           // int mid = (start+end)/2;//int got fixed size range of integer of java
            int mid=start+(end-start)/2;


            if(target< arr[mid])
            {
                end = mid -1;

            }

            else if(target>arr[mid]){
                start = mid+1;

            }

            else{
                return mid;//already found the target into the array
            }
        }

        return -1;

    }
}
