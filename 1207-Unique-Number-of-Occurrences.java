class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        Set<Integer> s = new HashSet<>();
        for(Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (s.contains(set.getValue())) {
                return false;
            } else {
                s.add(set.getValue());
            }
        }
        return true;
    }
}