import java.util.HashSet;
import java.util.Set;

public class Problem8{
	
	static int[] findMissing(int[] nums) {
		
		int n = nums.length;
		
		Set<Integer> numSet = new HashSet<>();
		int duplicate = 0;
		int missing = 0;
		
		for(int num : nums) {
			if(numSet.contains(num)) {
				duplicate = num;
			}
			numSet.add(num);
			missing += num;
		}
		
		int totalSum = (n * (n+1))/2;
		missing = totalSum - missing + duplicate;
		
		return new int[] {duplicate, missing};
	}
	public static void main(String[] args) {
		
		int[] nums = {1,2,2,4};
		
		int[] res = findMissing(nums);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
}