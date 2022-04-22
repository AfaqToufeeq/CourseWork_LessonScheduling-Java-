package courseWork.assignment;

import java.util.Scanner;

import static courseWork.assignment.Index.*;


public class Attend {
    static int mm=1,nn=1,rr=1;

    Scanner r=new Scanner(System.in);
    void attendLesson(){
        myBookedLessons();
    }

    void myBookedLessons() {
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
       }

        System.out.println("Enter A Lesson Name TO ATTEND IT (BODY BLITZ):");

       String a=r.nextLine();
       attendLessons[Index.a][0]=bookedLessons[Index.a][0];
       attendLessons[Index.a][nn]=a.toUpperCase();
       nn++;
       System.out.println("Status: Attended");
       myReviews();

    }

     void myReviews() {

         System.out.println("write a short review on lesson that you attended.");
         String review = r.nextLine();
         reviewsLessons[a][0]=attendLessons[Index.a][0];
         reviewsLessons[Index.a][mm]=review;
         mm++;

         System.out.print("Rate the lesson out of 5: \n");
//         System.out.println("1: DAY");
            System.out.println("1: very dissatisfied");
            System.out.println("2: dissatisfied");
            System.out.println("3: Ok");
            System.out.println("4: satisfied");
            System.out.println("5: very satisfied");
            while (true)
            {
                int rating = r.nextInt();
                if(rating>0 && rating<6)
                {
                    ratingLessons[a][0]=attendLessons[Index.a][0];
                    ratingLessons[Index.a][rr]= String.valueOf(rating);
                    rr++;

                    System.out.println("Rating and Reviews Completed");
                    LessonBook lessonBook = new LessonBook();
                    lessonBook.mainMenuAttend();

                }
                else {
                    System.out.println("Try Again -> You can only rate out 5");
                }
            }

     }
}
