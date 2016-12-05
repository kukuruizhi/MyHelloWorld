package src.reflectorAOP;

public class HelloProxy implements IHello {
    private IHello hello;
 
    public HelloProxy(IHello hello) {
       this.hello = hello;
    }
 
    public void sayHello(String name) {
        Logger.logging(Level.DEBUGE, "sayHello method start.");
        hello.sayHello(name);
        Logger.logging(Level.INFO, "sayHello method end!");
    }

	@Override
	public void sayGoogBye(String name) {
		// TODO Auto-generated method stub
		
	}

}

