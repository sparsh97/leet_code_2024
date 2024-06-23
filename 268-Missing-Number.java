class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n+1))/2;
        int nSum = 0;
        for(Integer i : nums) {
            nSum += i;
        }

        return sum - nSum;
    }
}