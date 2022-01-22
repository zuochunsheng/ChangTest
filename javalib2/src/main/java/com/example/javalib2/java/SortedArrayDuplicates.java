package com.example.javalib2.java;

//去除重复元素
public class SortedArrayDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    private  static  int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int start = 0;//慢指针
        for (int end = 1; end < nums.length; end++) {
            if(nums[end] != nums[start]){
//               nums[start + 1]  = nums[end] ;
//               start ++;

                start ++;
                nums[start]  = nums[end] ;

            }
        }
        return  start + 1;
    }


}
