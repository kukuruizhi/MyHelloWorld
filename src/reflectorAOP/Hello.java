package src.reflectorAOP;

public class Hello implements IHello {

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    
    public void sayGoogBye(String name) {
        System.out.println(name+" GoodBye!");
    }

}
