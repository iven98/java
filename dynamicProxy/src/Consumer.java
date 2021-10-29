import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Consumer {
    public static void main(String[] args) {
        Person p=new Worker();
        InvocationHandler invocationHandler=new WorkHandler(p);
        Person proxy=(Person) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), p.getClass().getInterfaces(),invocationHandler);
        System.out.println(proxy.work());
    }
}
