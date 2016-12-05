package src;

import java.io.File;


public class MainFunction {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("D:/µÁ”∞");
	       
        String[] str = f.list();
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        showAllFiles(f);
	}
	
	final static void showAllFiles(File dir) throws Exception{
	   File[] fs = dir.listFiles();
	   for(int i=0; i<fs.length; i++){
	    System.out.println(fs[i].getAbsolutePath());
	    String temp = "qwe";
	    if( temp.indexOf("wer")!= -1){
	    	
	    } 
	    //fs[i].getp
	    if(fs[i].isDirectory()){
	     try{
	      showAllFiles(fs[i]);
	     }catch(Exception e){}
	    }
	  }
	}

}
