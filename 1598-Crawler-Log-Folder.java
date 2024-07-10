class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        int n = logs.length;
        for(int i=0;i<n;i++) {
            if (logs[i].contains("../")) {
                count--;
                if (count < 0) {
                    count = 0;
                }
            } else if (logs[i].contains("./")) {
               continue;
            } else {
                count++;
            }
        }
        return count > 0 ? count : 0;
    }
}