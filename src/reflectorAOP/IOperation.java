package src.reflectorAOP;

import java.lang.reflect.Method;

public interface IOperation {
	/**
      * ����ִ��֮ǰ�Ĳ���
      * @param method
      */
    void start(Method method);
    /**
     * ����ִ��֮��Ĳ���
     * @param method
     */
    void end(Method method);
}
