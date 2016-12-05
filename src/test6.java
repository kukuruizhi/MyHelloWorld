package src;

public  class test6 implements interfaceI{
	@SuppressWarnings("unused")
	public static void main(String[] args){ 
	    int i=0,j=5; 
	    tp:  for(;;i++){ 
	         for(;;--j) 
	        	 if(i>j)break tp; 
	       } 
	   System.out.println("i="+i+",j="+j); 
	   
	   byte b=0; 
       b--;
	   
	   //try{System.exit(0);} 
	  // finally{System.out.println("Finally");} 
	   //int a = 3.5;
	   //int x = 9/0;
	   //System.out.println("111="+x); 
	   
	   int Output = 10;
	   boolean b1 = false;
	   if((b1 == true) && ((Output += 10) == 20))
	   {
	       System.out.println("We are equal " + Output);
	   }
	   else
	   {
	       System.out.println("Not equal! " + Output);
	   }  

	   test6 t6 = new test6();
	   test6 t2 = new test6();
	   interfaceI iI ;
	   
	   iI =  (interfaceI)t6;
	   t2 = (test6) iI;
	   
	}

	@Override
	public void test1(String a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	
	
}
