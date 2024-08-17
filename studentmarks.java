package Assignment2;

import java.io.*;

class studentmarks {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of students: ");
        int n = Integer.parseInt(br.readLine());
        symarks sy[] = new symarks[n];
        TYClass ty[] = new TYClass[n];
        Studentinfo si[] = new Studentinfo[n];

        for (int i = 0; i < n; i++) {
            si[i] = new Studentinfo();
            sy[i] = new symarks();
            ty[i] = new TYClass();

            si[i].gets();
            sy[i].gets();
            ty[i].gets();

            si[i].syt = sy[i].ct + sy[i].et + sy[i].mt;
            si[i].tyt = ty[i].pm + ty[i].tm;
            si[i].gt = si[i].syt + si[i].tyt;
            si[i].per = (si[i].gt / 1200) * 100;

            if (si[i].per >= 70) {
                si[i].grade = "A";
            } else if (si[i].per >= 60) {
                si[i].grade = "B";
            } else if (si[i].per >= 50) {
                si[i].grade = "C";
            } else if (si[i].per >= 40) {
                si[i].grade = "Pass";
            } else {
                si[i].grade = "Fail";
            }
        }

        System.out.println("Roll No\tName\tSyTotal\tTyTotal\tGrandTotal\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(si[i].rollno + "\t" + si[i].name + "\t" + si[i].syt + "\t" + si[i].tyt + "\t" + si[i].gt
                    + "\t\t" + si[i].per + "\t\t" + si[i].grade);

        }
    }
}
