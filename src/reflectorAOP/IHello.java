package src.reflectorAOP;

public interface IHello {
	/**
	  * 假设这是一个业务方法
	  * @param name
	  */
	   void sayHello(String name);
	   
    /**
	    * 业务处理B方法
	    * @param name
	    */
       void sayGoogBye(String name);
}
