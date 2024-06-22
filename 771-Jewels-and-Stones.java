class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : jewels.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for(Character c : stones.toCharArray()) {
            if (map.containsKey(c)) {
                count++;
            }
        }
        return count;
    }
}