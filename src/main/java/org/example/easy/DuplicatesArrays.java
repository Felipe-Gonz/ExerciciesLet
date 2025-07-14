package org.example.easy;

public class DuplicatesArrays {
    public int removeDuplicates(int[] nums) {

        int slow = 0;

        if (nums.length == 0 ){
            return 0;
        }

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[slow]){
                slow = slow + 1;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }
}
