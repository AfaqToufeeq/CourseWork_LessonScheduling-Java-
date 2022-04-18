package courseWork.assignment;

import java.util.Scanner;

public class Index {
    static int a;

    static String[][] lessons= {
            {"1", "2", "3","4","5","6"},
            {"YOGA", "RUNNING", "BODY FIT", "BODY BLITZ", "AQUACISE", "ZUMBA"},
            {"30", "10", "20", "15", "25", "30"}
    };

    static String[][] students = new String[20][20];
    static int sYoga=0, sRunning=0, sBodyFit=0, sBodyBlitz=0, sAquacise=0, sZumba=0;
    public Index() {

    }

    void indexing(){
       a= Main.studentI+=1;
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        students[a][0]="Student "+a+1;
        students[a][1]=s.nextLine();

        students[a][2]="null";
        students[a][3]="null";
        students[a][4]="null";
        students[a][5]="null";
        students[a][6]="null";
        students[a][7]="null";
        System.out.println(students[a][0]+" : "+students[a][1]);
        System.out.println();
    }
}
