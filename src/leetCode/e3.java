package src.leetCode;

public class e3 {

	public static void main(String[] args) {
		
		/*
		    Given a string, find the length of the longest substring without repeating characters. 
			For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
			For "bbbbb" the longest substring is "b", with the length of 1.
		*/
		//System.out.println( lengthOfLongestSubstring("abcabcbb"));
		//System.out.println( lengthOfLongestSubstring("bbbbbbb"));
		
		System.out.println( lengthOfLongestSubstring("abcdabcabdbabcda"));
	}
	
	static int lengthOfLongestSubstring(String s) {
		
		
		
		/*int result = 0;
		int temp = 0;
		String ts= "";
		for(int i=0; i<s.length()/2; i++){
			if(s.contains(s.substring(0, i+1))){
				temp =  i;
				if(temp > result && !ts.equals(s.substring(0, i+1))){
					result = temp;
					ts= s.substring(0, i+1);
				}
			}
		}
        return result;*/
		
		/*if (s == null || s.length() == 0) {
	        return 0;
	    }
	    if (s.length() == 1) {
	        return 1;
	    }
	    int[] container = new int[128];
	    int start = 0;
	    int max = 0;
	    int tmpMax = 0;
	    for (int i = 0, j = s.length(); i < j && j - i + tmpMax > max; i++) {
	        int key = s.charAt(i) - '\0';
	        int v = container[key];
	        int index = v - 1;
	        if (index < start) {
	            ++tmpMax;
	        } else {
	            if (tmpMax > max) {
	                max = tmpMax;
	            }
	            tmpMax = i - index;
	            start = index;
	        }
	        container[key] = i + 1;
	    }
	    return Math.max(max, tmpMax);*/
	    
/*	    int[] dict = new int[128];
	    int ret=0, maxret=0, i;
	    for(i=0;i<s.length();i++){
	      if(dict[s.charAt(i)]==0) ret++;
	      else{
	        int tmp = i+1-dict[s.charAt(i)];
	        if(ret>=tmp) ret=tmp;
	        else ret++;
	      }
	      dict[s.charAt(i)]=i+1;
	      maxret = maxret<ret?ret:maxret;
	    }
	    return maxret;*/
		
		int max = 0, i =0 , j = 0,index;
        int[] hm = new int[128];
        while(j<s.length()){
            if(hm[s.charAt(j)] == 0){
                hm[s.charAt(j)] = j+1;
                j++;
                if((j-i) > max)
                    max = j-i;
            }
            else {
                index = hm[s.charAt(j)];
                hm[s.charAt(j)] = 0;
                if (i < index)
                    i = index;
            }
        }
        return max;
		
		
		
    }

}

