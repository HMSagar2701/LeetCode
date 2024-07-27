class Solution {
    public int[] sortedSquares(int[] nums) {  
        int output[] = new int [nums.length];
        for(int num = 0; num < nums.length ;num++)
            output[num] = nums[num]*nums[num];
        Arrays.sort(output);
        return output;
    }
}