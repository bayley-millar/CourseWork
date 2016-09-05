import java.util.*;
import java.io.*;

public class BitLevel{
    public static void main(String[] args){
        String inputFile = args[0];
        String outputFile = args[1];
        System.out.println("Enter Key: ");
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        try{
            InputStream Input = new FileInputStream(inputFile);
            OutputStream Output = new FileOutputStream(outputFile);
            int i = 0;
           
            int bits = Input.read();
            while(bits != -1){
                if(i >= key.length()){
                    i = 0;
                }
                Output.write(bits ^ key.charAt(i));
                Output.flush();
                bits = Input.read();
                i++;
            }
        } catch(IOException e){
            System.out.println("IOException: "+ e);
        }
    
    }
}
        

