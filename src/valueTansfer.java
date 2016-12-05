package src;

public class valueTansfer {

	public static void main(String[] args) {
		int a = 1;
		String b = "b";
		Model m = new Model(100,"Model");
		ValueTest t = new ValueTest();
		t.changeValue(a,b,m );
		System.out.println(a);
		System.out.println(b);
		System.out.println(m.getId());
	}

}

class ValueTest{
	public void changeValue(int a,String b, Model c){
		a = a+1;
		b = b+"2";
		c.setId(1);
	}
}

class Model{
	private int id;
	private String name;
	public Model(){}
	public Model(int a, String b){
		this.id = a;
		this.name = b;
	}
	public void setId(int a){
		this.id = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
}
