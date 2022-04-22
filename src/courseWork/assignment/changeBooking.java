package courseWork.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static courseWork.assignment.Index.*;
import static courseWork.assignment.Index.attendLessons;
import static courseWork.assignment.TimeTable.timing;

public class changeBooking {

    Scanner scan = new Scanner(System.in);
    String at;
   void changeBookingLesson()
   {
       while(true) {
           System.out.println("1: To Change Booking");
           System.out.println("2: To Cancel Booking Change");

           System.out.print("Choose an option: ");
           int option = scan.nextInt();
           switch (option) {
               case 1:
                   bookingChange();
                   break;

               case 2:
                   System.out.println("Booking Change is Cancelled");
                   LessonBook lessonBook= new LessonBook();
                   lessonBook.mainMenuAttend();
                   break;

               default:
                   System.out.println("wrong input!!!");

           }
       }

    }

    void bookingChange() {
        int z=0;
        for (int i=a;i<a+1;i++)
        {
            for(int j=0;j<bookedLessons[i].length;j++)
            {
                if(j==0){
                    System.out.println("Lessons Booked by Mr."+bookedLessons[i][j]+" are:");
                    System.out.println("\nBooking ID : Booked Lessons");
                }
                if(j!=0)
                {
                    if(bookedLessons[i][j]!="null")
                    {
                        z++;
                        System.out.println(z+": "+bookedLessonsID[i][j]+" : "+bookedLessons[i][j]);
                    }

                }
            }
        }
int p=0;
       System.out.print("Enter Booking ID of lesson you wanna change: ");
       at=scan.next();

            for (int k=a;k<a+1;k++)
            {
                for (int j=0;j<bookedLessons[k].length;j++)
                {
                    if(bookedLessonsID[k][j].equals(at))
                    {p=1;
                        lessonsMenu();
                    }

                }
            }
            if(p==0)
            {
                System.out.println("This Booking ID doesn't exist");
                changeBookingLesson();
            }
            System.out.println();

    }

     void lessonsMenu() {

         for (int i=0; i<6; i++){
             System.out.println((i+1)+": "+ TimeTable.exercise[i]);
         }
         Scanner o = new Scanner(System.in);
         System.out.print("enter number of lesson to book: ");
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
           checkNewLesson();
         }
         else if(opt == 'n'){
             changeBookingLesson();
         }
         else{
             System.out.println("WRONG INPUT");
             changeBookingLesson();
         }
    }

   void checkNewLesson() {
       System.out.println("ENTER A NUMBER TO BOOK RESPECTIVE LESSON: ");
       int bookLesson = scan.nextInt();

       if (bookLesson==1)
       {
           if (Index.sYoga<4){
               if(Index.students[a][2].equals("Yoga"))
               {
                   System.out.println("Error-> You have already Booked it\n");
                   changeBookingLesson();
               }
               else
               {
                   Index.sYoga++;
                   System.out.println("Status: Changed");
                   for (int k=a;k<a+1;k++)
                   {
                       for (int j=0;j<bookedLessons[k].length;j++)
                       {
                           if(bookedLessonsID[k][j].equals(at))
                           {
                               bookedLessons[k][j]="null";
                               bookedLessonsID[k][j]="null";
                               Index.students[k][j+1]="null";
                           }

                       }
                   }
                   System.out.println("lesson Booked by "+Index.students[a][1]+"\n");
                   Index.students[a][2]="Yoga";
                   bookedLessons[a][0]=Index.students[a][1];
                   bookedLessons[a][1]="Yoga";
                   bookedLessonsID[a][0]= students[a][1];
                   bookedLessonsID[a][1]=at;
                   LessonBook lessonBook = new LessonBook();
                   lessonBook.mainMenuAttend();

               }
           }
           else{
               System.out.println("SEATS FULL...");
               sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
               changeBookingLesson();
           }

       }
       else if (bookLesson==2){
           if (Index.sRunning<4){
               if(Index.students[a][3].equals("RUNNING"))
               {
                   System.out.println("Error-> You have already Booked it\n");
                   changeBookingLesson();
               }
               else
               {
                   Index.sRunning++;
                   System.out.println("Status: Changed");
                   for (int k=a;k<a+1;k++)
                   {
                       for (int j=0;j<bookedLessons[k].length;j++)
                       {
                           if(bookedLessonsID[k][j].equals(at))
                           {
                               bookedLessons[k][j]="null";
                               bookedLessonsID[k][j]="null";
                               Index.students[k][j+1]="null";
                           }

                       }
                   }
                   System.out.println("lesson Booked by "+Index.students[a][1]);
                   Index.students[a][3]="RUNNING";
                   bookedLessons[a][0]=Index.students[a][1];
                   bookedLessons[a][2]="RUNNING";
                   bookedLessonsID[a][0]= students[a][1];
                   bookedLessonsID[a][2]=at;
                   LessonBook lessonBook = new LessonBook();
                   lessonBook.mainMenuAttend();

               }

           }
           else{
               System.out.println("SEATS FULL...");
               sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
               changeBookingLesson();

           }

       }
       else if (bookLesson==3){
           if (Index.sBodyFit<4){
               if(Index.students[a][4].equals("BODY FIT"))
               {
                   System.out.println("Error-> You have already Booked it\n");
                   changeBookingLesson();
               }
               else
               {
                   Index.sBodyFit++;
                   System.out.println("Status: Changed");
                   for (int k=a;k<a+1;k++)
                   {
                       for (int j=0;j<bookedLessons[k].length;j++)
                       {
                           if(bookedLessonsID[k][j].equals(at))
                           {
                               bookedLessons[k][j]="null";
                               bookedLessonsID[k][j]="null";
                               Index.students[k][j+1]="null";
                           }

                       }
                   }
                   System.out.println("lesson Booked by "+Index.students[a][1]);
                   Index.students[a][4]="BODY FIT";
                   bookedLessons[a][0]=Index.students[a][1];
                   bookedLessons[a][3]="BODY FIT";
                   bookedLessonsID[a][0]= students[a][1];
                   bookedLessonsID[a][3]=at;
                   LessonBook lessonBook = new LessonBook();
                   lessonBook.mainMenuAttend();


               }

           }
           else{
               System.out.println("SEATS FULL...");
               sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
                changeBookingLesson();
           }

       }


       if (bookLesson==4){
           if (Index.sBodyBlitz<4){
               if(Index.students[a][5].equals("BODY BLITZ"))
               {
                   System.out.println("Error-> You have already Booked it\n");
                   changeBookingLesson();
               }
               else
               {
                   Index.sBodyBlitz++;

                   System.out.println("Status: Changed");
                   for (int k=a;k<a+1;k++)
                   {
                       for (int j=0;j<bookedLessons[k].length;j++)
                       {
                           if(bookedLessonsID[k][j].equals(at))
                           {
                               bookedLessons[k][j]="null";
                               bookedLessonsID[k][j]="null";
                               Index.students[k][j+1]="null";
                           }

                       }
                   }
                   System.out.println("lesson Booked by "+Index.students[a][1]);
                   Index.students[a][5]="BODY BLITZ";
                   bookedLessons[a][0]=Index.students[a][1];
                   bookedLessons[a][4]="BODY BLITZ";
                   bookedLessonsID[a][0]= students[a][1];
                   bookedLessonsID[a][4]=at;
                   LessonBook lessonBook = new LessonBook();
                   lessonBook.mainMenuAttend();

               }

           }
           else{
               System.out.println("SEATS FULL...");
               sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
              changeBookingLesson();

           }

       }
       else if (bookLesson==5){
           if (Index.sAquacise<4){
               if(Index.students[a][6].equals("AQUACISE"))
               {
                   System.out.println("Error-> You have already Booked it\n");
                 changeBookingLesson();
               }
               else {
                   Index.sAquacise++;

                   System.out.println("Status: Changed");
                   for (int k=a;k<a+1;k++)
                   {
                       for (int j=0;j<bookedLessons[k].length;j++)
                       {
                           if(bookedLessonsID[k][j].equals(at))
                           {
                               bookedLessons[k][j]="null";
                               bookedLessonsID[k][j]="null";
                               Index.students[k][j+1]="null";
                           }

                       }
                   }
                   System.out.println("lesson Booked by "+Index.students[a][1]);
                   Index.students[a][6]="AQUACISE";
                   bookedLessons[a][0]=Index.students[a][1];
                   bookedLessons[a][5]="AQUACISE";
                   bookedLessonsID[a][0]= students[a][1];
                   bookedLessonsID[a][5]=at;
                   LessonBook lessonBook = new LessonBook();
                   lessonBook.mainMenuAttend();

               }
           }
           else{
               System.out.println("SEATS FULL...");
               sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
               changeBookingLesson();
           }

       }
       else if (bookLesson==6){
           if (Index.sZumba<4){
               if(Index.students[a][7].equals("ZUMBA"))
               {
                   System.out.println("Error-> You have already Booked it\n");
                  changeBookingLesson();
               }
               else
               {
                   Index.sZumba++;
                   System.out.println("Status: Changed");
                   for (int k=a;k<a+1;k++)
                   {
                       for (int j=0;j<bookedLessons[k].length;j++)
                       {
                           if(bookedLessonsID[k][j].equals(at))
                           {
                               bookedLessons[k][j]="null";
                               bookedLessonsID[k][j]="null";
                               Index.students[k][j+1]="null";
                           }

                       }
                   }
                   System.out.println("lesson Booked by "+Index.students[a][1]);
                   Index.students[a][7]="ZUMBA";
                   bookedLessons[a][0]=Index.students[a][1];
                   bookedLessons[a][6]="ZUMBA";
                   bookedLessonsID[a][0]= students[a][1];
                   bookedLessonsID[a][6]=at;
                   LessonBook lessonBook = new LessonBook();
                   lessonBook.mainMenuAttend();

               }
           }
           else
           {
               System.out.println("SEATS FULL...");
               sYoga=0;sRunning=0;sBodyFit=0;sBodyBlitz=0; sAquacise=0; sZumba=0;
               changeBookingLesson();
           }
       }

    }

}
