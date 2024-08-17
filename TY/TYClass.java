package Assignment2.TY;
import java.io.*;

public class TYClass {
    public int pm, tm;
    
    public void gets() throws IOException{
        System.out.println("Enter the marks of theory out of 400 and practocal out of 200: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        tm = Integer.parseInt(br.readLine());
        pm = Integer.parseInt(br.readLine());
    }
}
