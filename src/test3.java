package src;

public class test3 {

	public static void main(String[] args) {
		for(int i=0; i<20 ; i++){
			int j = Integer.valueOf(i/3);
			if(j%2 ==0){
				System.out.println("1");
			}else{
				System.out.println("2");
			}
			
			
		}
		
		
		Print a = new Print();
		String value = a.testP();
		String b = a.p;
		value.split("");
		String[] bb = {"1","2","3","4"};
		System.out.println(bb.length);
		System.out.println(value);
		System.out.println(b);
	}
	
	
	public String test111(){
		return "test111";
	}
}

class Print{
	
	public String p = "T";
	public String testP(){
		return "test";
	}
	
}
