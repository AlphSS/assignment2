package Assignment2.SY;
import java.io.*;


public class symarks{
    public int mt,ct,et;

    public void gets() throws IOException{
        System.out.println("Enter marks of maths, computer, electronic out of 200: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ct = Integer.parseInt(br.readLine());
        mt = Integer.parseInt(br.readLine());
        et = Integer.parseInt(br.readLine());
    }
}