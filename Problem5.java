
public class Problem5 {
	
	static int[] merge(int[] nums1, int[] nums2, int m, int n) {
		int[] nums1copy = new int[m];
		
		for(int i=0; i<m; i++) {
			nums1copy[i] = nums1[i];
		}
		
		int p1 = 0;
		int p2 = 0;
		
		
		for(int p=0; p<m+n; p++) {
			if(p2>=n || (p1 < m && nums1copy[p1] < nums2[p2])) {
				nums1[p] = nums1copy[p1++];
			}
			else {
				nums1[p] = nums2[p2++];
			}
		}
		return nums1;
	}
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		
		nums1 = merge(nums1,nums2,m,n);
		for(int k : nums1) {
			System.out.print(k + " ");
		}
	}
}
