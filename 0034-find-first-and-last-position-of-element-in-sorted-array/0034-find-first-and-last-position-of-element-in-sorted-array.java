class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = FirstOccurance(nums, target);
        ans[1] = LastOccurance(nums, target);
        return ans;
    }

    int FirstOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                ans = mid;
                end = mid - 1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    int LastOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                ans = mid;
                start = mid + 1;
            }else if(nums[mid]>target){
                end = mid - 1;;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}