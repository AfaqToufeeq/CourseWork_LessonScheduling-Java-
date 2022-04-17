package com.company;

import java.util.Scanner;


class Index {

    static int sYoga=0, sRunning=0, sBodyFit=0, sBodyBlitz=0, sAquacise=0, sZumba=0;
    public Index() {

    }

    void indexing(){
        Scanner s = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME: ");
        String name = s.nextLine();


    }
}
class Price {

    static int[] price = new int[]{50, 10, 20, 40, 25, 30};

    void prices(){
        for (int i=0; i<6; i++){
            System.out.println("PRICE OF "+ TimeTable.execrcise[i] + " is: "+ price[i]);
        }

    }
}
class Attend{
    void attendLesson(){
        System.out.println("LESSON ATTENDED...");
        System.out.println("write a short review on lesson that you attended.");
        Scanner r=new Scanner(System.in);
        String review = r.nextLine();
        System.out.print("Rate the lesson out of 5: ");
        int rating = r.nextInt();

        
    }
}
class LessonBook{
    TimeTable t = new TimeTable();
    void booking(){
        Scanner o = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO BOOK RESPECTIVE LESSON: ");
        int bookLesson = o.nextInt();

        if (bookLesson==1){
            if (Index.sYoga<4){
                Index.sYoga++;
                System.out.println("lesson Booked");
                System.out.println("student "+Index.sYoga);

            }
            else{
                System.out.println("SEATS FULL...");
                t.selectTimeTable();

            }

        }
        else if (bookLesson==2){
            if (Index.sRunning<4){
                Index.sRunning++;
                System.out.println("lesson Booked");
                System.out.println("student "+Index.sRunning);
            }
            else{
                System.out.println("SEATS FULL...");
                t.selectTimeTable();

            }

        }
        else if (bookLesson==3){
            if (Index.sBodyFit<4){
                Index.sBodyFit++;
                System.out.println("lesson Booked");
                System.out.println("student "+Index.sBodyFit);
            }
            else{
                System.out.println("SEATS FULL...");
                t.selectTimeTable();

            }

        }
        else if (bookLesson==4){
            if (Index.sBodyBlitz<4){
                Index.sBodyBlitz++;
                System.out.println("lesson Booked");
                System.out.println("student "+Index.sBodyBlitz);
            }
            else{
                System.out.println("SEATS FULL...");
                t.selectTimeTable();

            }

        }
        else if (bookLesson==5){
            if (Index.sAquacise<4){
                Index.sAquacise++;
                System.out.println("lesson Booked");
                System.out.println("student "+Index.sAquacise);
            }
            else{
                System.out.println("SEATS FULL...");
                t.selectTimeTable();

            }

        }
        else if (bookLesson==6){
            if (Index.sZumba<4){
                Index.sZumba++;
                System.out.println("lesson Booked");
                System.out.println("student "+Index.sZumba);
            }
            else{
                System.out.println("SEATS FULL...");
                t.selectTimeTable();

            }

        }

        else{
            System.out.println("WRONG INPUT!!!");
        }


        System.out.println("1: TO CHANGE BOOKING ");
        System.out.println("2: TO BOOK LESSON ");
        System.out.println("2: TO ATTEND LESSON ");
        System.out.print("choose an option: ");
        Scanner a = new Scanner(System.in);
        int c=a.nextInt();
        if (c==1){
            System.out.println("change booking");

        }
        else if (c==2){
            t.selectTimeTable();

        }
        else if(c==3){
            Attend attend = new Attend();
            attend.attendLesson();
        }
        else{
            System.out.println("Wrong INPUT!!!");

        }
    }
}
class TimeTable{
    static String[] execrcise= new String[]{"YOGA", "RUNNING", "BODY FIT", "BODY BLITZ", "AQUACISE", "ZUMBA"};

    static String[] timing= new String[]{"morning", "afternoon", "evening"};
    Price p=new Price();
    Scanner o = new Scanner(System.in);
    TimeTable(){
        System.out.println("********Select the timetable********");


    }
    void selectTimeTable(){

        while(true) {
            System.out.println("1: DAY");
            System.out.println("2: LESSON NAME");
            System.out.println("3: SEE PRICES");

            System.out.print("Choose an option: ");
            int option = o.nextInt();
            switch (option) {
                case 1:
                    System.out.println("*****TIMTABLE BY DAY*****");
                    byDay();
                    break;

                case 2:
                    System.out.println("*****TIMTABLE BY NAME*****");
                    byName();
                    break;
                case 3:
                    p.prices();
                    break;
                default:
                    System.out.println("wrong input!!!");

            }
        }

    }
    void byDay(){
        while(true) {
            System.out.println("1: SATURDAY");
            System.out.println("2: SUNDAY");
            System.out.println("3: SEE PRICES");
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
                default:
                    System.out.println("wrong input!!!");

            }
        }

    }
    void saturday(){
        System.out.println("* * * * * * SATURDAY LESSONS * * * * * *");

        for (int i=0; i<3; i++){
            System.out.println("EXERCISE "+(i+1)+"--> "+ execrcise[i]+" running in "+ timing[i]);
        }

        Scanner p= new Scanner(System.in);

        System.out.println("press y to book a lesson, and n to go to main menu: ");
        char opt = p.next().charAt(0);
        if (opt == 'y'){
            LessonBook b = new LessonBook();
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

        System.out.println("* * * * * * SUNDAY LESSONS * * * * * *");
        int a;
        for (int i=3; i<6; i++){
            a=i-3;
            System.out.println("EXERCISE "+(i+1)+"--> "+ execrcise[i]+" in "+ timing[a]);

        }
        Scanner p= new Scanner(System.in);

        System.out.println("press y to book a lesson, and n to go to main menu: ");
        char opt = p.next().charAt(0);
        if (opt == 'y'){
            LessonBook b = new LessonBook();
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
            System.out.println((i+1)+": "+ TimeTable.execrcise[i]);
        }
        Scanner o = new Scanner(System.in);
        System.out.print("enter number of lesson: ");
        int exercise_opt= o.nextInt();
        if(exercise_opt==1 || exercise_opt==2 || exercise_opt==3){
            System.out.println("Lessons on "+ TimeTable.execrcise[exercise_opt]+ " Every Saturday in "+timing[exercise_opt]);


        }

        if(exercise_opt==4 || exercise_opt==5 || exercise_opt==6){
            int a=exercise_opt-4;
            System.out.println("Lessons on "+ TimeTable.execrcise[exercise_opt]+ " Every Sunday in "+timing[a]);

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


public class Main {

    public static void main(String[] args) {
        // write your code here
        Index i = new Index();
        i.indexing();
        TimeTable t = new TimeTable();
        t.selectTimeTable();


    }
}
