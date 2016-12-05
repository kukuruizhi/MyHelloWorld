package src.reflectorAOP;

import java.lang.reflect.Method;

public class LoggerOperation implements IOperation {

    public void end(Method method) {
        Logger.logging(Level.DEBUGE, method.getName() + " Method end .");
    }

    public void start(Method method) {
        Logger.logging(Level.INFO, method.getName() + " Method Start!");
    }

}
