package src.equals;

public class test {

	public static void main(String[] args) {
		String a = new String("foo");
		String b = new String("foo");
		String c = a;
		
		if(a.equals(b)){
			System.out.println("a equals b");
		}
		if(a == b){
			System.out.println("a == b");
		}
		if(a.equals(c)){
			System.out.println("a equals c");
		}
		if(b.equals(c)){
			System.out.println("b equals c");
		}
		
		Model aa =  new Model(1);
		Model bb =  new Model(1);
		Model cc = aa;
		if(aa.equals(bb)){
			System.out.println("aa equals bb");
		}
		if(aa == bb){
			System.out.println("aa == bb");
		}
		if(aa.equals(cc)){
			System.out.println("aa equals cc");
		}
		if(bb.equals(cc)){
			System.out.println("bb equals cc");
		}
		
		Model2 aaa = new Model2("tt");
		Model2 bbb = new Model2("tt");
		Model2 ccc = aaa;
		if(aaa.equals(bbb)){
			System.out.println("aaa equals bbb");
		}
		if(aaa == bbb){
			System.out.println("aaa == bbb");
		}
		if(aaa.equals(ccc)){
			System.out.println("aaa equals ccc");
		}
		if(bbb.equals(ccc)){
			System.out.println("bbb equals ccc");
		}
	}

}

class Model{
	public Model(int a){
		this.count = a;
	}
	private int count;
}

class Model2{
	public Model2(String a){
		this.name = a;
	}
	
	private String name;
}


