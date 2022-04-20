package courseWork.assignment;

import static courseWork.assignment.Index.*;

public class monthlyReport {
    void fourWeeksReport()
    {
        System.out.println("******Four Weeks Report******");
        for(int i=a;i<a+1;i++)
        {
            for(int j=0;j<attendLessons[i].length;j++)
            {
                if(j==0)
                {


                    System.out.println("Name: "+attendLessons[i][j]);
                }

                if(attendLessons.length==0)
                {
                    System.out.println("Empty");
                }
                if(attendLessons[i][j]!="null" && j==1)
                {
                    System.out.println("Lesson : "+attendLessons[i][j]+"  -> Rating: "+ratingLessons[i][j]);
                }

            }
        }
        System.out.println();
    }
}
