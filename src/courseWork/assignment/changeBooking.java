package courseWork.assignment;

import java.util.Scanner;

import static courseWork.assignment.Index.*;
import static courseWork.assignment.Index.attendLessons;

public class changeBooking {

    Scanner scan = new Scanner(System.in);
   void changeBookingLesson()
   {
       while(true) {
           System.out.println("1: To Change Booking");
           System.out.println("2: To See ID of all lessons");
           System.out.println("3: To Cancel Booking Change");

           System.out.print("Choose an option: ");
           int option = scan.nextInt();
           switch (option) {
               case 1:
                   bookingChange();
                   break;

               case 2:
                   toSeeLessonID();
                   break;
               case 3:
                   System.out.println("Booking Change is Cancelled");
                   LessonBook lessonBook= new LessonBook();
                   lessonBook.mainMenuAttend();
                   break;

               default:
                   System.out.println("wrong input!!!");

           }
       }

    }

     void toSeeLessonID() {
       System.out.println("******Lessons ID******");
           for(int j=0;j<lessons[0].length;j++)
           {
               System.out.println(lessons[0][j]+" : "+lessons[1][j]);
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
                }
                if(j!=0)
                {
                    if(bookedLessons[i][j]!="null")
                    {
                        z++;
                        System.out.println(z+": "+bookedLessons[i][j]);
                    }


                }
            }

       System.out.print("Enter Booking Lesson Name you wanna change(BODY BLITZ): ");

        String at=scan.next();
        System.out.println();
        for(int k=Index.a;k<=Index.a;k++)
        {
            for (int j=0;j<bookedLessons[k].length;j++)
            {
                if(bookedLessons[Index.a][j].equalsIgnoreCase(at))
                {
                    bookedLessons[Index.a][j]=at;
                    System.out.println("Status: Changed");
                }
            }
        }
            System.out.println();
        }
    }
}
