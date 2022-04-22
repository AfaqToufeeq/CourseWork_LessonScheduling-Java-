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
            System.out.println("4: Exit");

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
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input!!!");

            }
        }
    }

   static void myTimeTable() {
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
    static void myAttendLessons() {
        for(int i=0;i<attendLessons.length;i++)
        {
            for(int j=0;j<attendLessons[i].length;j++)
            {

                if(j==0)
                {
                    System.out.println("********Attend Lessons By********");
                    System.out.print("Name: ");
                }
                if(!attendLessons[i][j].equals("null"))
                {
                    System.out.println(attendLessons[i][j]);
                }

            }
        }
        System.out.println();

    }
    static void myReviewsLessons() {
        for(int i=0;i<reviewsLessons.length;i++)
        {
            for(int j=0;j< reviewsLessons[i].length;j++)
            {

                if(j==0)
                {
                    System.out.println("********Reviews Lessons By********");
                    System.out.print("Name: ");
                }
                if(!reviewsLessons[i][j].equals("null"))
                {
                    System.out.println(reviewsLessons[i][j]);
                }

            }
        }
        System.out.println();

    }
    static void myRatingsLessons() {
        for(int i=0;i<ratingLessons.length;i++)
        {
            for(int j=0;j< ratingLessons[i].length;j++)
            {

                if(j==0)
                {
                    System.out.println("********Ratings Lessons By********");
                    System.out.print("Name: ");
                }
                if(!ratingLessons[i][j].equals("null"))
                {
                    System.out.println(ratingLessons[i][j]);
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
        for (int i=0; i<6; i++){
            System.out.println((i+1)+": "+ TimeTable.exercise[i]);
        }
        Scanner o = new Scanner(System.in);
        System.out.print("enter number of lesson: ");
        int exercise_opt= o.nextInt();
        if(exercise_opt==1 || exercise_opt==2 || exercise_opt==3)
        {
            System.out.println("Lessons on "+ TimeTable.exercise[exercise_opt-1]+ " Every Saturday in "+timing[exercise_opt-1]);
        }

        if(exercise_opt==4 || exercise_opt==5 || exercise_opt==6){
            int a=exercise_opt-4;

            System.out.println("Lessons on "+ TimeTable.exercise[exercise_opt-1]+ " Every Sunday in "+timing[a]);
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
