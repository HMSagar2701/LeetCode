class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closeSum=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
           
            while(start<end) {
             int closeCurr= nums[i]+nums[start]+nums[end];

            if(Math.abs(target-closeCurr)< Math.abs(target-closeSum)){   
                closeSum=closeCurr;
            }
            if(closeCurr==target) return target;

            if(closeCurr>target){
                end--;
            }
            else
            start++;
        }      

    }
    return closeSum;
    }
}