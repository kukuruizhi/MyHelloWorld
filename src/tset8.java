package src;

public class tset8 {

       public int a = 1;
       private int b = 2;
       public void method(final int c)
       {
           int d = 3;
            class Inner
            {
               private void iMethod(int e)
               {
            	   int x1 =a;
            	   int x2 =b;
            	   int x3 =c;
            	   //int x4 =d;
            	   int x5 =e;
               }
           }
       }

}


