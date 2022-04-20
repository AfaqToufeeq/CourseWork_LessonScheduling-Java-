package courseWork.assignment;

import java.util.ArrayList;
import java.util.Collections;

import static courseWork.assignment.Index.*;
import static courseWork.assignment.Price.price;

public class monthlyReport {
    static int YogaNo=0, RunningNo=0, BodyFitNo=0, BodyBlitzNo=0, AquaciseNo=0, ZumbaNo=0;
    static int sumYogaNo=0, sumRunningNo=0, sumBodyFitNo=0, sumBodyBlitzNo=0, sumAquaciseNo=0, sumZumbaNo=0;
    static int hiYogaNo=0, hiRunningNo=0, hiBodyFitNo=0, hiBodyBlitzNo=0, hiAquaciseNo=0, hiZumbaNo=0;

    void fourWeeksReport()
    {
//        System.out.println("******Four Weeks Report******");
//        for(int i=0;i<attendLessons.length;i++)
//        {
//            for(int j=0;j<attendLessons[i].length;j++)
//            {
//                if(j==0)
//                {
//                    System.out.println("Name: "+attendLessons[i][j]);
//                }
//
//                if(attendLessons.length==0)
//                {
//                    System.out.println("Empty");
//                }
//                if(attendLessons[i][j]!="null" && j==1)
//                {
//                    System.out.println("Lesson : "+attendLessons[i][j]+"  -> Rating: "+ratingLessons[i][j]);
//                }
//
//            }
//        }
//        System.out.println();


        System.out.println("******Four Weeks Report******");
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
        System.out.println();
        System.out.println("******Four Weeks Report 1 (No.of Students/AverageRating)******");
       System.out.println("Total NO. of students in YOGA: "+YogaNo+"     \t--> Average Rating: "+sumYogaNo/YogaNo);
       System.out.println("Total NO. of students in RUNNING: "+RunningNo+" \t--> Average Rating: "+sumRunningNo/RunningNo);
       System.out.println("Total NO. of students in BODY FIT: "+BodyFitNo+" \t--> Average Rating: "+sumBodyFitNo/BodyFitNo);
       System.out.println("Total NO. of students in BODY BLITZ: "+BodyBlitzNo+" \t--> Average Rating: "+sumBodyBlitzNo/BodyBlitzNo);
       System.out.println("Total NO. of students in AQUACISE: "+AquaciseNo+" \t--> Average Rating: "+sumAquaciseNo/AquaciseNo);
       System.out.println("Total NO. of students in ZUMBA: "+ZumbaNo+"   \t--> Average Rating: "+sumZumbaNo/ZumbaNo);
        System.out.println();

        System.out.println();
        hiYogaNo=price[0]*YogaNo;
        hiRunningNo=price[1]*RunningNo;
        hiBodyFitNo=price[2]*BodyFitNo;
        hiBodyBlitzNo=price[3]*BodyBlitzNo;
        hiAquaciseNo=price[4]*AquaciseNo;
        hiZumbaNo=price[5]*ZumbaNo;
        //Array List
        ArrayList<Integer> income = new ArrayList<Integer>();
        income.add(hiYogaNo);
        income.add(hiRunningNo);
        income.add(hiBodyFitNo);
        income.add(hiBodyBlitzNo);
        income.add(hiAquaciseNo);
        income.add(hiZumbaNo);
        Integer max = Collections.max(income);

        System.out.println("******Four Weeks Report 2 (Highest Income)******");
        System.out.println("Yoga Total Income Generated: "+hiYogaNo+"$");
        System.out.println("Yoga Total Income Generated: "+hiRunningNo+"$");
        System.out.println("Yoga Total Income Generated: "+hiBodyFitNo+"$");
        System.out.println("Yoga Total Income Generated: "+hiBodyBlitzNo+"$");
        System.out.println("Yoga Total Income Generated: "+hiAquaciseNo+"$");
        System.out.println("Yoga Total Income Generated: "+hiZumbaNo+"$");
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
