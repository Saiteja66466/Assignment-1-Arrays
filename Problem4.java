
public class Problem4{
	static int[] addOne(int[] digits) {
		
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
	public static void main(String[] args) {
		
		int[] digits = {1,2,3};
		
		int[] res = addOne(digits);
		for(int k : res) {
			System.out.print(k + " ");
		}
	}
}