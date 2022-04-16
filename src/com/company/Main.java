package com.company;

import java.util.Scanner;


class Index {

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
            System.out.println("2: EXERCISE NAME");
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
        System.out.println("* * * * * * SATURDAY EXERCISES * * * * * *");

        for (int i=0; i<3; i++){
            System.out.println("EXERCISE "+(i+1)+"--> "+ execrcise[i]+" running in "+ timing[i]);

        }
    }
    void sunday(){

        System.out.println("* * * * * * SUNDAY EXERCISES * * * * * *");
        for (int i=3; i<6; i++){
            System.out.print("EXERCISE "+(i+1)+"--> "+ execrcise[i]+" in "+ timing[i]);

        }
    }

    void byName(){
        Price p= new Price();
        Scanner op=new Scanner(System.in);
        System.out.print("enter y to see prices: ");
        String in= o.next();
        if (in=="y"){
            p.prices();
        }
        for (int i=0; i<6; i++){
            System.out.println((i+1)+": "+ TimeTable.execrcise[i]);
        }
        Scanner o = new Scanner(System.in);
        System.out.print("enter number of exercise: ");
        int exercise_opt= o.nextInt();
        if(exercise_opt==1 || exercise_opt==2 || exercise_opt==3){
            System.out.println("Lessons on "+ TimeTable.execrcise[exercise_opt]+ " Every Saturday in "+timing[exercise_opt]);


        }

        if(exercise_opt==4 || exercise_opt==5 || exercise_opt==6){
            int a=exercise_opt-4;
            System.out.println("Lessons on "+ TimeTable.execrcise[exercise_opt]+ " Every Sunday in "+timing[a]);

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
