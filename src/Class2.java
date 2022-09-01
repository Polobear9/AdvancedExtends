public class Class2 extends ClassA
                    implements InterfaceA, InterfaceB{
    @Override
    public void hoge(){
        System.out.println("hello");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void hello_World() {
        System.out.println("hello world Method!");
    }
}
