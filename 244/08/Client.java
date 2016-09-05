import java.net.*;

   
public class Client {
                  
    public static void main(String[] args) {
        Socket socket = null;
        try {                  
            int port = Integer.parseInt(args[0]);                   
            socket = new Socket(args[1], port);      
            System.err.println("Waiting for a client to connnect");             
            System.err.println("Accepted connection on port " + port);
            new ReadWriteThread(System.in, socket.getOutputStream()).start(); 
            new ReadWriteThread(socket.getInputStream(), System.out).start();
                   
        } catch (Exception e) {               
            e.printStackTrace();                
            System.err.println("\nUsage: java Server <port>");             
        }
       
    }
  
        
}
