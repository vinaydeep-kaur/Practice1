package arrays;

public class RemoveDupicate {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        for(i=1,j=i;j<nums.length;){
            if(nums[j]>nums[i-1]){
                nums[i++]=nums[j++];
               
            }
            else{
                j++;
            }
        }
        return i;
    }
}
