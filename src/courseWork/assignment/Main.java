package courseWork.assignment;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Price {

    static int[] price = new int[]{50, 10, 20, 40, 25, 30};

    static void prices()
    {
        for (int i=0; i<6; i++)
        {
            System.out.println("PRICE OF "+ TimeTable.exercise[i] + " : "+ price[i]+"$");
        }
    }
}


public class Main {

static int weekPass=0;
    static int studentI=9;

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        // write your code here
        System.out.println("********Management System********");
        System.out.println("\n********Select the Option********");

        while(true) {
            System.out.println("1: TimeTable");
            System.out.println("2: Monthly Report");
            System.out.println("3: Monthly Champion Exercise Report");
            System.out.println("4: Exit");

            System.out.print("Choose an option: ");
            int option = o.nextInt();
            switch (option) {
                case 1:
                    Index i = new Index();
                    i.indexing();
                    System.out.println();
                    TimeTable t = new TimeTable();
                    t.selectTimeTable();
                    break;

                case 2:
                    monthlyReport mR= new monthlyReport();
                    mR.fourWeeksReport();
                    break;
                case 3:
                    monthlyReport mR2= new monthlyReport();
                    mR2.championExerciseReport();
                    break;
                case 4:
                   System.exit(0);
                    break;

                default:
                    System.out.println("wrong input!!!");

            }
        }

    }
}
