package Searching.BinarySearch;

public class agnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {199, 111, 32, 22, 14, 5, -7};
        int target = -7;

        int ans = agnosticBinarySearch1(arr, target);
        System.out.println(ans);


    }

    static int agnosticBinarySearch1(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end - 1];
//        if(arr[start]<arr[end-1])
//        {
//            isAsc = true;
//
//        }
//
//        else{
//            isAsc = false;
//        }


        while (start <= end) {

            //find the mid element

            // int mid = (start+end)/2;//int got fixed size range of integer of java
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (target > arr[mid]) {
                    end = mid + 1;

                } else if (target < arr[mid]) {
                    start = mid - 1;

                } else {
                    return mid;//already found the target into the array
                }

               // return -1;

            }


            else {


                if (target > arr[mid]) {
                    end = mid + 1;

                } else if (target < arr[mid]) {
                    start = mid - 1;

                } else {
                    return mid;//already found the target into the array
                }

               // return -1;
            }

        }
        return -1;
    }

}


