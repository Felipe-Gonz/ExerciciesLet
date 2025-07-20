package org.example.easy;

public class RemoveElement {
    public int removeElements(int[] nums, int val) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++){

            if (nums[i] != val){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
