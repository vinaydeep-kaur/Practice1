package arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int j=0;
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        
        return j;
    }
}
