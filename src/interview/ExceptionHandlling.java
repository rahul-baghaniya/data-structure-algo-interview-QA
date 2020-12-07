package interview;

import java.io.*;

public class ExceptionHandlling {

    public static void readFailingFile() throws Exception {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(new File("abc")));
            rd.readLine();
        }catch (FileNotFoundException e){
            System.out.println("--inside FileNotFoundException--");
            throw new FileNotFoundException();
        }catch (Exception e){
            System.out.println("--inside Exception--");
            throw new Exception();
        }
        finally {
            System.out.println("--inside finally--");
            throw new FileNotFoundException();
        }
    }

     public static  void main(String[] args) throws Exception {
        readFailingFile();
    }
}
