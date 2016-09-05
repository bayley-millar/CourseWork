import java.io.*;
import java.net.*;
import java.util.*;
public class TCPProgram2 {

    private PrintWriter output;
    private BufferedReader input;
    
    public TCPProgram2(Socket socket) throws Exception {
        output = new PrintWriter(socket.getOutputStream(), true);
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    public void startReceiving() throws Exception {
        String line;
        Scanner stdin = new Scanner(System.in);
        while ((line = input.readLine()) != null) {
            System.out.println(line);
            output.println(stdin.nextLine());
        }
    }
    public void startSending()throws Exception {
        String line;
        Scanner stdin = new Scanner(System.in);
        System.err.println("Please enter data here");
        while (stdin.hasNextLine()) {
            output.println(stdin.nextLine());
            System.out.println(input.readLine());
        }
    }
    public static void main(String[] args) {
        Socket socket = null;
        try {
            int port = Integer.parseInt(args[0]);
            if (args.length > 1) {
                socket = new Socket(args[1], port);
                System.err.println("Connected to " + args[1] + " on port " + port);
                TCPProgram2 example = new TCPProgram2(socket);
                example.startSending();
            } else {
                ServerSocket serverSocket = new ServerSocket(port);
                System.err.println("Waiting for someone to connect");
                socket = serverSocket.accept();
                System.err.println("Accepted connection on port " + port);
                TCPProgram2 example = new TCPProgram2(socket);
                example.startReceiving();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("\nUsage: java TCPExample <port> [host]");
        }
    }
}
