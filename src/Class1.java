public class Class1 extends ClassA
                    implements InterfaceA, InterfaceB, InterfaceC{
    //new InterfaceA();
    //Interface is can not be instanced
    @Override
    public void hoge(){
        System.out.println("hello");
    }
    //Can add a many Interface, and Also the Method can be double.
    @Override
    public void hello(){
        System.out.println("hello World!");
    }
    @Override
    public void hello_World(){
        System.out.println("hello World! Method!");
    }

    @Override
    public void hello_Sky(){
        System.out.println("hello World! Sky Method!");
    }

}
