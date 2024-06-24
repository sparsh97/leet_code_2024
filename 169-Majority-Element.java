class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int maj = 0;
        for (Integer i : nums) {
            if (maj == i) {
                count++;
            } else {
                if (count == 0) {
                    maj = i;
                    count++;
                } else {
                    count--;
                }
            }
        }
        // if (count == 0) {
        //     maj = nums[nums.length - 1];
        // }

        count = 0;
        for (Integer i : nums) {
            if (i == maj) {
                count++;
            }
        }

        return count > (nums.length / 2) ? maj : maj;
    }
}