class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int aTime = 0;
        double awTime = 0;

        for (int i = 0; i < n; i++) {
            int arrival = customers[i][0];
            int preparation = customers[i][1];

            if (aTime < arrival) {
                aTime = arrival;
            }

            aTime += preparation;
            awTime += aTime - arrival;
        }

        return awTime/n;
    }
}