package courseWork.assignment;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static courseWork.assignment.Index.*;
import static courseWork.assignment.Price.price;

public class monthlyReport {

    Scanner o = new Scanner(System.in);

    void WeeksReport() {

        while (true) {
            System.out.println("1: Four Weeks Report");
            System.out.println("2: Main Menu");
            System.out.println("3: Exit");

            System.out.print("Choose an option: ");
            int option = o.nextInt();
            switch (option)
            {
                case 1:
                    fourWeeksReport();
                    break;
                case 2:
                    TimeTable t = new TimeTable();
                    t.selectTimeTable();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input!!!");

            }

        }
    }

   static void fourWeeksReport()
    {
         int YogaNo=0, RunningNo=0, BodyFitNo=0, BodyBlitzNo=0, AquaciseNo=0, ZumbaNo=0;
      int bookYogaNo=0, bookRunningNo=0, bookBodyFitNo=0, bookBodyBlitzNo=0, bookAquaciseNo=0, bookZumbaNo=0;
        int sumYogaNo=0, sumRunningNo=0, sumBodyFitNo=0, sumBodyBlitzNo=0, sumAquaciseNo=0, sumZumbaNo=0;
        int hiYogaNo=0, hiRunningNo=0, hiBodyFitNo=0, hiBodyBlitzNo=0, hiAquaciseNo=0, hiZumbaNo=0;
        System.out.println("******Four Weekends Report******");
        for(int i=0;i<attendLessons.length;i++)
        {
            for(int j=0;j<attendLessons[i].length;j++)
            {
                if(attendLessons[i][j].equals("YOGA"))
                {
                    sumYogaNo+=Integer.parseInt(ratingLessons[i][j]);
                    YogaNo++;
                }
                if(attendLessons[i][j].equals("RUNNING"))
                {
                    sumRunningNo+=Integer.parseInt(ratingLessons[i][j]);
                    RunningNo++;
                }
                if(attendLessons[i][j].equals("BODY FIT"))
                {
                    sumBodyFitNo+=Integer.parseInt(ratingLessons[i][j]);
                    BodyFitNo++;
                }
                if(attendLessons[i][j].equals("BODY BLITZ"))
                {
                    sumBodyBlitzNo+=Integer.parseInt(ratingLessons[i][j]);
                    BodyBlitzNo++;
                }
                if(attendLessons[i][j].equals("AQUACISE"))
                {
                    sumAquaciseNo+=Integer.parseInt(ratingLessons[i][j]);
                    AquaciseNo++;
                }
                if(attendLessons[i][j].equals("ZUMBA"))
                {
                    sumZumbaNo+=Integer.parseInt(ratingLessons[i][j]);
                    ZumbaNo++;
                }

            }
        }

        for(int i=0;i< bookedLessons.length;i++)
        {
            for(int j=0;j<bookedLessons[i].length;j++)
            {
                if(bookedLessons[i][j].equals("YOGA"))
                {
                    bookYogaNo++;
                }
                if(bookedLessons[i][j].equals("RUNNING"))
                {
                    bookRunningNo++;
                }
                if(bookedLessons[i][j].equals("BODY FIT"))
                {
                    bookBodyFitNo++;
                }
                if(bookedLessons[i][j].equals("BODY BLITZ"))
                {
                    bookBodyBlitzNo++;
                }
                if(bookedLessons[i][j].equals("AQUACISE"))
                {
                    bookAquaciseNo++;
                }
                if(bookedLessons[i][j].equals("ZUMBA"))
                {
                    bookZumbaNo++;
                }

            }
        }
        System.out.println();
        System.out.println("******Monthly Report 1 (No.of Students/AverageRating)******");
       System.out.println("Total NO. of students in YOGA: "+bookYogaNo+"        \t--> Attend Lessons: "+YogaNo+"     \t--> Average Rating: "+sumYogaNo/YogaNo);
       System.out.println("Total NO. of students in RUNNING: "+bookRunningNo+"     \t--> Attend Lessons: "+RunningNo+"   \t--> Average Rating: "+sumRunningNo/RunningNo);
       System.out.println("Total NO. of students in BODY FIT: "+bookBodyFitNo+"     \t--> Attend Lessons: "+BodyFitNo+"   \t--> Average Rating: "+sumBodyFitNo/BodyFitNo);
       System.out.println("Total NO. of students in BODY BLITZ: "+bookBodyBlitzNo+"     \t--> Attend Lessons: "+BodyBlitzNo+"   \t--> Average Rating: "+sumBodyBlitzNo/BodyBlitzNo);
       System.out.println("Total NO. of students in AQUACISE: "+bookAquaciseNo+"     \t--> Attend Lessons: "+AquaciseNo+"   \t--> Average Rating: "+sumAquaciseNo/AquaciseNo);
       System.out.println("Total NO. of students in ZUMBA: "+bookZumbaNo+"       \t--> Attend Lessons: "+ZumbaNo+"   \t--> Average Rating: "+sumZumbaNo/ZumbaNo);

        System.out.println();
        System.out.println();

    }

    static void championExerciseReport()
    {

        int bookYogaNo=0, bookRunningNo=0, bookBodyFitNo=0, bookBodyBlitzNo=0, bookAquaciseNo=0, bookZumbaNo=0;
        int hiYogaNo=0, hiRunningNo=0, hiBodyFitNo=0, hiBodyBlitzNo=0, hiAquaciseNo=0, hiZumbaNo=0;

        for(int i=0;i< bookedLessons.length;i++)
        {
            for(int j=0;j<bookedLessons[i].length;j++)
            {
                if(bookedLessons[i][j].equals("YOGA"))
                {
                    bookYogaNo++;
                }
                if(bookedLessons[i][j].equals("RUNNING"))
                {
                    bookRunningNo++;
                }
                if(bookedLessons[i][j].equals("BODY FIT"))
                {
                    bookBodyFitNo++;
                }
                if(bookedLessons[i][j].equals("BODY BLITZ"))
                {
                    bookBodyBlitzNo++;
                }
                if(bookedLessons[i][j].equals("AQUACISE"))
                {
                    bookAquaciseNo++;
                }
                if(bookedLessons[i][j].equals("ZUMBA"))
                {
                    bookZumbaNo++;
                }

            }
        }
        hiYogaNo=price[0]*bookYogaNo;
        hiRunningNo=price[1]*bookRunningNo;
        hiBodyFitNo=price[2]*bookBodyFitNo;
        hiBodyBlitzNo=price[3]*bookBodyBlitzNo;
        hiAquaciseNo=price[4]*bookAquaciseNo;
        hiZumbaNo=price[5]*bookZumbaNo;
        //Array List
        ArrayList<Integer> income = new ArrayList<Integer>();
        income.add(hiYogaNo);
        income.add(hiRunningNo);
        income.add(hiBodyFitNo);
        income.add(hiBodyBlitzNo);
        income.add(hiAquaciseNo);
        income.add(hiZumbaNo);
        Integer max = Collections.max(income);

        System.out.println("******Monthly Champion Exercise Report (Highest Income)******");
        System.out.println("Yoga Total Income Generated: "+hiYogaNo+"$");
        System.out.println("RUNNING Total Income Generated: "+hiRunningNo+"$");
        System.out.println("BODY FIT Total Income Generated: "+hiBodyFitNo+"$");
        System.out.println("BODY BLITZ Total Income Generated: "+hiBodyBlitzNo+"$");
        System.out.println("AQUACISE Total Income Generated: "+hiAquaciseNo+"$");
        System.out.println("ZUMBA Total Income Generated: "+hiZumbaNo+"$");
        System.out.println();
        System.out.println("******The Highest Income******");
        if(max==hiYogaNo)
        {
            System.out.println("-->> Yoga Lessons Generated the highest Income, almost "+hiYogaNo+"$");
        }
        else if(max==hiRunningNo)
        {
            System.out.println("-->> RUNNING Lessons Generated the highest Income, almost "+hiRunningNo+"$");
        }
        else if(max==hiBodyFitNo)
        {
            System.out.println("-->> BODY FIT Lessons Generated the highest Income, almost "+hiBodyFitNo+"$");
        }
        else if(max==hiBodyBlitzNo)
        {
            System.out.println("-->> BODY BLITZ Lessons Generated the highest Income, almost "+hiBodyBlitzNo+"$");
        }
        else if(max==hiAquaciseNo)
        {
            System.out.println("-->> AQUACISE Lessons Generated the highest Income, almost "+hiAquaciseNo+"$");
        }
        else if(max==hiZumbaNo)
        {
            System.out.println("-->> ZUMBA Lessons Generated the highest Income, almost "+hiZumbaNo+"$");
        }
        System.out.println();


    }
}

