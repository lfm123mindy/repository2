/**
 * Created by liufengming on 2017/7/14.
 */
public class testJava {
    public static void main(String[] args){
        System.out.print("testing...");

        TestInterface testInterface = new TestInterfaceImp();
        System.out.println(testInterface.test());
        System.out.println(testInterface.test2());
    }
}
