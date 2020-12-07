import java.util.Arrays;
import java.util.ResourceBundle;

public class Main {

    final public static  void main(String[] args) throws Exception {


        System.out.println("args:"+ Arrays.toString(args));
        System.out.println("main:"+get());

        byte aa = 0;
        System.out.println(aa);

//        ClassA classA = new ClassA();
//        System.gc();
//      long aa=  Runtime.getRuntime().maxMemory();
//        System.out.println("free memory:"+ aa);
//    ClassA.a = 1;
//        //ClassA classA2 = new ClassA();
//        ClassA.a = 2;
//
//        System.out.println("a:"+ClassA.a);
    }

    public static int get() throws Exception {

        try{
            return 1;
        }
        catch(Exception e){
            throw new Exception(e);
        }finally{
            System.out.println("finally");

        }
        //return -1;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int add(int c, float d){
        return c+ (int)d ;
    }

}
