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
       if(a.equalsIgnoreCase(TimeTable.exercise[0])){
           attendLessons[Index.a][0]=bookedLessons[Index.a][0];
           attendLessons[Index.a][nn]=a.toUpperCase();
           nn++;
           System.out.println("Status: Attended");
           myReviews();
       }
       else if(a.equalsIgnoreCase(TimeTable.exercise[1]))
       {
           attendLessons[Index.a][0]=bookedLessons[Index.a][0];
           attendLessons[Index.a][nn]=a.toUpperCase();
           nn++;
           System.out.println("Status: Attended");
           myReviews();
       }
       else if(a.equalsIgnoreCase(TimeTable.exercise[2]))
       {
           attendLessons[Index.a][0]=bookedLessons[Index.a][0];
           attendLessons[Index.a][nn]=a.toUpperCase();
           nn++;
           System.out.println("Status: Attended");
           myReviews();
       }
       else if(a.equalsIgnoreCase(TimeTable.exercise[3]))
       {
           attendLessons[Index.a][0]=bookedLessons[Index.a][0];
           attendLessons[Index.a][nn]=a.toUpperCase();
           nn++;
           System.out.println("Status: Attended");
           myReviews();
       }
       else if(a.equalsIgnoreCase(TimeTable.exercise[4]))
       {
           attendLessons[Index.a][0]=bookedLessons[Index.a][0];
           attendLessons[Index.a][nn]=a.toUpperCase();
           nn++;
           System.out.println("Status: Attended");
           myReviews();
       }
       else if(a.equalsIgnoreCase(TimeTable.exercise[5]))
       {
           attendLessons[Index.a][0]=bookedLessons[Index.a][0];
           attendLessons[Index.a][nn]=a.toUpperCase();
           nn++;
           System.out.println("Status: Attended");
           myReviews();
       }
       else
       {
           System.out.println("Sorry, This lesson doesn't teach here");
          LessonBook lessonBook=new LessonBook();
          lessonBook.mainMenuAttend();
       }


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
                    System.out.println("\n********Select Options********");
                    while (true)
                    {
                        System.out.println("1: ALL Students Data ");
                        System.out.println("2: Back to SubMenu Attend ");
                        System.out.println("3: Exit");

                        System.out.print("Choose an option: ");
                        int option = r.nextInt();
                        switch (option) {
                            case 1:
                                allStudentData();
                                break;

                            case 2:
                                LessonBook lessonBook = new LessonBook();
                                lessonBook.mainMenuAttend();
                                break;
                            case 3:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("wrong input!!!");

                        }
                    }


                }
                else {
                    System.out.println("Try Again -> You can only rate out 5");
                }
            }

     }

    static void allStudentData() {
         System.out.println("\n********All Students Info********");

         for (int i = 0; i < students.length; i++) {
             for (int j = 0; j < students[i].length; j++) {

                 if (j == 0) {

                     System.out.print("Name: \t");
                 }
                 if (!students[i][j].equals("null")) {
                     System.out.println(students[i][j]);
                 }
                 if (j == 1) {
                     System.out.println("---> Lessons Booked <---");
                 }

             }
         }
         System.out.println();

         System.out.println("********Attended Lessons And Reviews********");
         for (int i = 0; i < attendLessons.length; i++) {
             for (int j = 0; j < attendLessons[i].length; j++) {

                 if (j == 0) {

                     System.out.println("Name:  Reviews:   Rating");
                 }
                 if (!attendLessons[i][j].equals("null")) {
                     System.out.println(attendLessons[i][j]+"  :  "+reviewsLessons[i][j]+"  :  "+ratingLessons[i][j]);
                 }

             }
         }
         System.out.println();

     }
}
