class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<Pair<Integer, Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int res = 0;
            int j = 0;
            if (num == 0) {
                res = mapping[0];
            } else {
                while (num > 0) {
                    int d = num % 10;
                    int mapNum = mapping[d];
                    res = mapNum * (int) Math.pow(10, j) + res;
                    num = num / 10;
                    j++;
                }
            }
            list.add(new Pair(res, i));
        }

        Collections.sort(list, new Comparator<Pair<Integer, Integer>>() {
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.getKey() - o2.getKey();
            }
        });
        int[] ans = new int[nums.length];
        int index = 0;
        for (Pair<Integer, Integer> p : list) {
            ans[index] = nums[p.getValue()];
            index++;
        }
        return ans;
    }
}