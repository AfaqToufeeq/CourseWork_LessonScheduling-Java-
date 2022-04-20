package courseWork.assignment;

import java.util.Scanner;

import static courseWork.assignment.Index.*;

public class TimeTable {
    static int selectDay=0;
    static String[] exercise = new String[]{"YOGA", "RUNNING", "BODY FIT", "BODY BLITZ", "AQUACISE", "ZUMBA"};

    static String[] timing= new String[]{"morning", "afternoon", "evening"};

    //Object of price class
    Price p=new Price();
    Scanner o = new Scanner(System.in);

    TimeTable()
    {
        System.out.println("\n********Select the timetable********");
    }
    void selectTimeTable(){

        while(true) {
            System.out.println("1: DAY");
            System.out.println("2: LESSON NAME");
            System.out.println("3: SEE PRICES");
            System.out.println("4: My TimeTable");
            System.out.println("5: Monthly Report");
            System.out.println("6: Monthly Champion Exercise Report");
            System.out.println("7: Exit");

            System.out.print("Choose an option: ");
            int option = o.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\n*****TIMETABLE BY DAY*****");
                    byDay();
                    break;

                case 2:
                    System.out.println("\n*****TIMETABLE BY NAME*****");
                    byName();
                    break;
                case 3:
                    p.prices();
                    break;
                case 4:
                    myTimeTable();
                    break;
                case 5:
                   monthlyReport mR= new monthlyReport();
                   mR.WeeksReport();
                    break;
                case 6:
                    monthlyReport mR2= new monthlyReport();
                    mR2.championExerciseReport();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input!!!");

            }
        }
    }

   void myTimeTable() {
        for(int i=0;i< students.length;i++)
        {
            for(int j=0;j<students[i].length;j++)
            {

                if(j==0)
                {
                    System.out.println("********TimeTable********");
                    System.out.print("Name: ");
                }
                if(!students[i][j].equals("null"))
                {
                    System.out.println(students[i][j]);
                }
                if(j==1)
                {
                    System.out.println("---> Lessons Booked <---");
                }

            }
        }
        System.out.println();

    }

    void byDay(){
        while(true) {
            System.out.println("1: SATURDAY");
            System.out.println("2: SUNDAY");
            System.out.println("3: SEE PRICES");
            System.out.println("4: MainMenu");
            System.out.println("5: EXIT");
            System.out.print("Choose a day: ");
            int option = o.nextInt();
            switch (option) {
                case 1:
                    saturday();
                    break;
                case 2:
                    sunday();
                    break;
                case 3:
                    p.prices();
                    break;
                case 4:
                    selectTimeTable();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input!!!");

            }
        }

    }
    void saturday(){
        System.out.println("\n* * * * * * SATURDAY LESSONS * * * * * *");

        for (int i=0; i<3; i++){
            System.out.println("EXERCISE "+(i+1)+"--> "+ exercise[i]+" is in "+ timing[i]);
        }

        Scanner p= new Scanner(System.in);

        System.out.println("press y to book a lesson, and n to go to main menu: ");
        char opt = p.next().charAt(0);
        if (opt == 'y'){
            LessonBook b = new LessonBook();
            selectDay=1;
            b.booking();

        }
        else if(opt == 'n'){
            selectTimeTable();
        }
        else{
            System.out.println("WRONG INPUT");
            saturday();
        }

    }
    void sunday(){

        System.out.println("\n* * * * * * SUNDAY LESSONS * * * * * *");
        int a;
        for (int i=3; i<6; i++){
            a=i-3;
            System.out.println("EXERCISE "+(i+1)+"--> "+ exercise[i]+" in "+ timing[a]);

        }
        Scanner p= new Scanner(System.in);

        System.out.println("press y to book a lesson, and n to go to main menu: ");
        char opt = p.next().charAt(0);
        if (opt == 'y'){
            LessonBook b = new LessonBook();
            selectDay=2;
            b.booking();

        }
        else if(opt == 'n'){
            selectTimeTable();
        }
        else{
            System.out.println("WRONG INPUT");
            sunday();
        }
    }

    void byName(){
        Price p= new Price();
        Scanner op=new Scanner(System.in);
        System.out.print("enter y to see prices: ");
        char in= op.next().charAt(0);
        if (in=='y'){
            p.prices();
        }
        for (int i=0; i<6; i++){
            System.out.println((i+1)+": "+ TimeTable.exercise[i]);
        }
        Scanner o = new Scanner(System.in);
        System.out.print("enter number of lesson: ");
        int exercise_opt= o.nextInt();
        if(exercise_opt==1 || exercise_opt==2 || exercise_opt==3)
        {
            System.out.println("Lessons on "+ TimeTable.exercise[exercise_opt]+ " Every Saturday in "+timing[exercise_opt]);
        }

        if(exercise_opt==4 || exercise_opt==5 || exercise_opt==6){
            int a=exercise_opt-4;

            System.out.println("Lessons on "+ TimeTable.exercise[exercise_opt]+ " Every Sunday in "+timing[a]);
        }
        Scanner ip= new Scanner(System.in);

        System.out.println("press y to book a lesson, and n to go to main menu: ");
        char opt = ip.next().charAt(0);
        if (opt == 'y'){
            LessonBook b = new LessonBook();
            b.booking();
        }
        else if(opt == 'n'){
            selectTimeTable();
        }
        else{
            System.out.println("WRONG INPUT");
            byName();
        }
    }

    }
