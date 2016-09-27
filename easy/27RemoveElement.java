public int removeElement(int[] nums, int val) {
    int i = -1;
    if(nums.length == 0) return 0;
    int j = 0;
    while(j<nums.length){
        if(nums[j]!=val){
            nums[++i] = nums[j];
        }
        j++;
    }
    return i+1;
}