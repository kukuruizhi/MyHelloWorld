package src.leetCode;

public class tset9 {

	public static void main(String[] args) {
		int[] i={2,1,9,4,4,56,90,3};
		Solution solution = new Solution();
		int[] a = solution.twoSum(i, 8);
		System.out.print(a[0]+"_"+a[1]);
	}
}
 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int fi =0;
        int si =1;
        aa:
        for(int j =0 ;j<nums.length;j++){
	        for(int i =1 ;i<nums.length; i++){
	            int tempInt = nums[j] +nums[i];
	            if(target == tempInt && j!=i){
	            	fi = j;
	                si = i;
	                break aa;
	            }
	        }
        }
        int[] result = new int[2]; 
        result[0] = fi;
        result[1] = si;
        return result;
    }
}