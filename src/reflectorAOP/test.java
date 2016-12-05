package src.reflectorAOP;

public class test {

	public static void main(String[] args) {
        //IHello hello = new HelloProxy(new Hello());
        //hello.sayHello("Doublej");
        
//        IHello hello = (IHello)new DynaProxyHello().bind(new Hello());
//        hello.sayGoogBye("Double J");
//        hello.sayHello("Double J");
        
        IHello hello = (IHello)new DynaProxyHello().bind(new Hello(),new LoggerOperation());
        hello.sayGoogBye("Double J");
        hello.sayHello("Double J");
	}

}
