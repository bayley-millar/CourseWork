/**Program2.java
 *Bayley Millar
 */
import java.io.*;

public class Program2{

    public static void main(String[] args){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try{
            String string;;
            while((string = buf.readLine()) != null){
                System.out.println(new StringBuilder(string).reverse());
            }
        }catch(IOException e){
            System.out.println("error: IOException");
        }
    }
}
