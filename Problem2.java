
public class Problem2 {
	
	static int removeElement(int[] nums, int target) {
		
		int i=0; 
		for(int j=0; j<nums.length; j++) {
			if(nums[j] != target) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		
		int[] nums = {3,2,2,3};
		int val = 3;

		int res = removeElement(nums, val);
		System.out.println(res);
	}
}
