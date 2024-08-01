class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count = 0;
        for(String s : details) {
            String age = s.substring(11, 13);
            if (Integer.parseInt(age) > 60) {
                count++;
            }
        }
        return count;
    }
}