package Assignment2;

import java.io.*;

public class Studentinfo {

    int rollno;
    String name, grade;
    public float gt, tyt, syt, per;

    public void gets() throws IOException {
        System.out.println("Enter rollno and name of the student: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rollno = Integer.parseInt(br.readLine());
        name = br.readLine();
    }
}

