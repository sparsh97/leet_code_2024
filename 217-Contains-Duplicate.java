class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i: nums) {
            int count = map.getOrDefault(i, 0) + 1;
            if (count >= 2) return true;
            map.put(i, count);
        }
        return false;
    }
}