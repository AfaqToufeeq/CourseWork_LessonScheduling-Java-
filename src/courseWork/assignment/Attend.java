package courseWork.assignment;

import java.util.Scanner;

import static courseWork.assignment.Index.*;


public class Attend {
    static int mm=0,nn=0,rr=0;

    Scanner r=new Scanner(System.in);
    void attendLesson(){
        myBookedLessons();
    }

    void myBookedLessons() {
        int z=0;
       for (int i=0;i<1;i++)
       {
           for(int j=0;j<bookedLessons.length;j++)
           {
               if(j==0){
                   System.out.println("Lessons Booked by Mr."+bookedLessons[i][j]+" are:");
               }
               if(j!=0)
               {
                   z++;
                   System.out.println(z+": "+bookedLessons[i][j]);
               }
           }
       }
        System.out.println("Enter A Lesson Name TO ATTEND IT (BODY BLITZ):");

       String a=r.nextLine();
       attendLessons[Index.a][0]=bookedLessons[Index.a][0];
       attendLessons[Index.a][nn]=a;
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

         System.out.print("Rate the lesson out of 5: ");
         int rating = r.nextInt();
         ratingLessons[a][0]=attendLessons[Index.a][0];
         ratingLessons[Index.a][rr]= String.valueOf(rating);
         rr++;

         System.out.println("Rating and Reviews Completed");
         TimeTable t = new TimeTable();
         t.selectTimeTable();

     }

//    void selectToAttend()
//    {
//        while(true) {
//            System.out.println("1: DAY");
//            System.out.println("2: LESSON NAME");
//            System.out.println("3: SEE PRICES");
//            System.out.println("4: My TimeTable");
//            System.out.println("5: Exit");
//
//            System.out.print("Choose an option: ");
//            int option = o.nextInt();
//            switch (option) {
//                case 1:
//                    System.out.println("\n*****TIMETABLE BY DAY*****");
//                    byDay();
//                    break;
//
//                case 2:
//                    System.out.println("\n*****TIMETABLE BY NAME*****");
//                    byName();
//                    break;
//                case 3:
//                    p.prices();
//                    break;
//                case 4:
//                    myTimeTable();
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("wrong input!!!");
//
//            }
//        }
//    }

}
