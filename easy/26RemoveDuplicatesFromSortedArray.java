public int removeDuplicates(int[] nums) {
    int n=nums.length;
    if(n<2) return 2;
    int i=1;
    for(int j=1;j<n;++j){
        if(nums[j]!=nums[j-1])
            nums[i++]=nums[j];
    }
    return i;
}