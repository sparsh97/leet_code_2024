class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
        // System.out.print(ch);
        int l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        while (r < n) {
            if (map.get(s.charAt(r)) != null) {
                if (map.get(s.charAt(r)) >= l) {
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            ans = Math.max(ans, r - l + 1);
            map.put(s.charAt(r), r);
            r++;
        }
        return ans;
    }
}