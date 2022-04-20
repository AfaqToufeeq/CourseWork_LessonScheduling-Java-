package courseWork.assignment;

import java.sql.Time;
import java.util.Scanner;

import static courseWork.assignment.Index.*;
import static courseWork.assignment.Index.attendLessons;

public class LessonBook {


    TimeTable t = new TimeTable();
    void booking()
    {

        Scanner o = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO BOOK RESPECTIVE LESSON: ");
        int bookLesson = o.nextInt();
        for(int i=0;i< bookedLessons.length;i++)
        {
            for(int j=0;j<bookedLessons[i].length;j++)
            {
                if(bookedLessons[i][j].equals("YOGA"))
                {
                    sYoga++;
                }
                if(bookedLessons[i][j].equals("RUNNING"))
                {
                    sRunning++;
                }
                if(bookedLessons[i][j].equals("BODY FIT"))
                {
                    sBodyFit++;
                }
                if(bookedLessons[i][j].equals("BODY BLITZ"))
                {
                    sBodyBlitz++;
                }
                if(bookedLessons[i][j].equals("AQUACISE"))
                {
                    sAquacise++;
                }
                if(bookedLessons[i][j].equals("ZUMBA"))
                {
                    sZumba++;
                }

            }
        }

        if(TimeTable.selectDay==1)
        {
            if (bookLesson==1)
            {
                if (Index.sYoga<4){
                    if(Index.students[a][2].equals("Yoga"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else{
                        Index.sYoga++;
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]+"\n");
                        Index.students[a][2]="Yoga";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][1]="Yoga";
                    }


                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }

            }
            else if (bookLesson==2){
                if (Index.sRunning<4){
                    if(Index.students[a][3].equals("RUNNING"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sRunning++;
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][3]="RUNNING";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][2]="RUNNING";
                    }

                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();

                }

            }
            else if (bookLesson==3){
                if (Index.sBodyFit<4){
                    if(Index.students[a][4].equals("BODY FIT"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sBodyFit++;
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][4]="BODY FIT";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][3]="BODY FIT";
                    }

                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }

            }

        }

        else if(TimeTable.selectDay ==2)
        {
            if (bookLesson==4){
                if (Index.sBodyBlitz<4){
                    if(Index.students[a][5].equals("BODY BLITZ"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sBodyBlitz++;
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][5]="BODY BLITZ";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][4]="BODY BLITZ";
                    }

                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();

                }

            }
            else if (bookLesson==5){
                if (Index.sAquacise<4){
                    if(Index.students[a][6].equals("AQUACISE"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                   else {
                        Index.sAquacise++;
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][6]="AQUACISE";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][5]="AQUACISE";
                    }
                }
                else{
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }

            }
            else if (bookLesson==6){
                if (Index.sZumba<4){
                    if(Index.students[a][7].equals("ZUMBA"))
                    {
                        System.out.println("Error-> You have already Booked it\n");
                        t.selectTimeTable();
                    }
                    else
                    {
                        Index.sZumba++;
                        System.out.println("Status: Booked");
                        System.out.println("lesson Booked by "+Index.students[a][1]);
                        Index.students[a][7]="ZUMBA";
                        bookedLessons[a][0]=Index.students[a][1];
                        bookedLessons[a][6]="ZUMBA";
                    }
                }
                else
                {
                    System.out.println("SEATS FULL...");
                    sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                    t.selectTimeTable();
                }
            }
        }
        else
        {
            System.out.println("WRONG INPUT!!!");
        }

        System.out.println("1: TO CHANGE BOOKING ");
        System.out.println("2: TO BOOK LESSON ");
        System.out.println("3: TO ATTEND LESSON ");
        System.out.println("4: Monthly Lesson Report ");
        System.out.println("5: Monthly Champion Exercise Report ");
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
        else if(c==4){
            monthlyReport mR= new monthlyReport();
            mR.WeeksReport();
        }
        else if(c==5){
            monthlyReport mR2= new monthlyReport();
            mR2.championExerciseReport();
        }
        else{
            System.out.println("Wrong INPUT!!!");

        }
    }
}
