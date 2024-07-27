class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[] = new int[n];
        int ind=n-1;
        int l=0;
        int r=n-1;
    
        while(l <= r){
            int rightsq = nums[r]*nums[r];
            int leftsq = nums[l]*nums[l];
            if(rightsq > leftsq){
                res[ind]=rightsq;
                r--;
            }
            else{
                res[ind]=leftsq;
                l++;
            }
            ind--;
        }
        return res;
    }
}