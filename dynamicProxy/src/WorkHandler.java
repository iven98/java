import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkHandler implements InvocationHandler {
    private Object obj;

    public WorkHandler() {
    }

    public WorkHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.nanoTime();
        Object invoke=method.invoke(obj,args);
        long endTime = System.nanoTime();
        System.out.println("程序用时：" + ( (endTime - startTime) / 1000L));
        return invoke;
    }
}
