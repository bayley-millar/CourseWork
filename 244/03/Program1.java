/**Program1.java
 *Bayley Millar
 */
import java.io.*;

public class Program1{

    public static void main(String[] args){
       
        try{

            int b;
            InputStream in = System.in;
            OutputStream out = System.out;
            b = in.read();
            while(b != -1){
                out.write(b);
                b = in.read();
            }
        

        }catch(IOException e){
            System.out.println("error: IOException");
        }
    }
}
