class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] num = new Integer[nums.length];
        for(Integer i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }


        for(int i = 0; i<nums.length;i++) {
            num[i] = nums[i];
        }

        Arrays.sort(num, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return Integer.compare(b,a);
            } else {
                return Integer.compare(map.get(a), map.get(b));
            }
        });

        int[] ans = new int[nums.length];
        for(int i=0;i<num.length;i++) {
            ans[i] = num[i];
        }
        return ans;
    }
}