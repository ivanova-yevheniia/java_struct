package proxyExample;

public class ProxySample {
    public static void main(String[] args)throws Exception{


        SomeEntity entity = new SomeEntity();
        SomeInterface proxy = (SomeInterface) SomeProxy.newProxyInstance(entity);
        System.out.println(proxy.getField());
        proxy.setField(5);
    }
}
