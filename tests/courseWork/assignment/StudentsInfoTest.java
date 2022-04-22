package courseWork.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsInfoTest {
    @Test
    public void StudentsReviewsLessons(){
        TimeTable.myReviewsLessons();
    }

    @Test
    public void StudentsRatingsLessons(){
        TimeTable.myRatingsLessons();
    }

}