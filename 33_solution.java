class Solution {
    private int bs(int[] arr, int x, int y, int z) {
        int l = x;
        int r = y;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == z) {
                return mid;
            } else if (arr[mid] > z) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    private int pivot(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int x = arr[r];
        int pivot = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= x) {
                pivot = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return pivot;
    }

    public int search(int[] nums, int target) {
        int p = pivot(nums);
        int a = bs(nums, 0, p - 1, target);
        int b = bs(nums, p, nums.length - 1, target);
        return Math.max(a, b);
    }
}
