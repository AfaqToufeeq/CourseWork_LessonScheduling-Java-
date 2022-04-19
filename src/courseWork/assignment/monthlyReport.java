package courseWork.assignment;

import static courseWork.assignment.Index.attendLessons;
import static courseWork.assignment.Index.ratingLessons;

public class monthlyReport {
    void fourWeeksReport()
    {
        System.out.println("******Four Weeks Report******");
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<attendLessons.length;j++)
            {

                if(attendLessons.length==0)
                {
                    System.out.println("Empty");
                }
                if(attendLessons[i][j]!=null)
                {
                    System.out.println("Lesson : "+attendLessons[i][j]+"  -> Rating: "+ratingLessons[i][j]);
                }

            }
        }
        System.out.println();
    }
}
