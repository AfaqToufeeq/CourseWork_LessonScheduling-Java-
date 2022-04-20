package courseWork.assignment;

import static courseWork.assignment.Index.*;

public class monthlyReport {
    static int YogaNo=0, RunningNo=0, BodyFitNo=0, BodyBlitzNo=0, AquaciseNo=0, ZumbaNo=0;
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
                    YogaNo++;
                }
                if(attendLessons[i][j].equals("RUNNING"))
                {
                    RunningNo++;
                }
                if(attendLessons[i][j].equals("BODY FIT"))
                {
                    BodyFitNo++;
                }
                if(attendLessons[i][j].equals("BODY BLITZ"))
                {
                    BodyBlitzNo++;
                }
                if(attendLessons[i][j].equals("AQUACISE"))
                {
                    AquaciseNo++;
                }
                if(attendLessons[i][j].equals("ZUMBA"))
                {
                    ZumbaNo++;
                }

            }
        }
        System.out.println();

       System.out.println("Total NO. of students in YOGA: "+YogaNo);
       System.out.println("Total NO. of students in RUNNING: "+RunningNo);
       System.out.println("Total NO. of students in BODY FIT: "+BodyFitNo);
       System.out.println("Total NO. of students in BODY BLITZ: "+BodyBlitzNo);
       System.out.println("Total NO. of students in AQUACISE: "+AquaciseNo);
       System.out.println("Total NO. of students in ZUMBA: "+ZumbaNo);






    }
}
