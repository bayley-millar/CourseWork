import java.util.*;
import java.io.*;

public class Caesar{
    public static void main(String[] args){
        int shift = Integer.parseInt(args[0]);
        try{
            int b;
            while(( b = System.in.read()) != -1){
                b = b + shift;
                if(b>255){
                    b = 0;
                }
                System.out.write(b);
                System.out.flush();
            }
        
            System.out.close();
        } catch(IOException e){
            System.out.println("IOException: "+ e);
        }
    
    }
}
   
