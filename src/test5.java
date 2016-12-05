package src;

public class test5 {
    public static void main(String args[]){ 
        /*if(odd(5)) 
            System.out.println("odd"); 
        else 
            System.out.println("even"); */
        
        String foo="ABCDE"; 
        String a = foo.substring(3); 
        String b = foo.concat("XYZ"); 
         System.out.println(foo);
         System.out.println(a);
         System.out.println(b);
     } 
     public static int odd(int x){return x%2;}   
}
