class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ar : accounts) {
            int sum = 0;
            for (int element : ar) {
                sum = sum + element;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
    
}