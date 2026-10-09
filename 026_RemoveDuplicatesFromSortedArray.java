class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 0;
        for (int num : nums) {
            if (size == 0 || num != nums[size - 1]) nums[size++] = num;
        }
        return size;
    }
}
