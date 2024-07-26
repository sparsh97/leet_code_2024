class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] num, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(num, low, mid);
        mergeSort(num, mid + 1, high);
        merge(num, low, mid, high);
    }

    public void merge(int[] num, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (num[left] <= num[right]) {
                list.add(num[left]);
                left++;
            } else {
                list.add(num[right]);
                right++;
            }
        }

        while (left <= mid) {
            list.add(num[left]);
            left++;
        }

        while (right <= high) {
            list.add(num[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            num[i] = list.get(i - low);
        }
    }
}