//////////////////////////////////////////////////////////////////
/////// Leetcode Question 26: Remove Duplicates from Sorted Array
//////////////////////////////////////////////////////////////////

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int head = 0;
        
        for(int i=1; i < nums.length; i++){
            if(nums[i] != nums[head]){
                head++;
                nums[head] = nums[i];
            }   
        }
        return ++head;
    }
}