import java.io.*;
public class ReadWriteThread extends Thread {
    private BufferedReader input;
    private PrintWriter output;
    private String arrow;
    public ReadWriteThread(InputStream input, OutputStream output,String x) {
        this.input = new BufferedReader(new InputStreamReader(input));
        this.output = new PrintWriter(output, true);
        this.arrow = x;
    }
    public void run() {
        try {
            String line;
            while ((line = input.readLine()) != null) {
                output.println(arrow + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
