package com.company;

import java.util.Scanner;

public class LessonBook {
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
