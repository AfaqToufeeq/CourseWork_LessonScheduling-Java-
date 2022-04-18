package courseWork.assignment;

import java.util.Scanner;

public class Attend {
    void attendLesson(){
        System.out.println("LESSON ATTENDED...");
        System.out.println("write a short review on lesson that you attended.");
        Scanner r=new Scanner(System.in);
        String review = r.nextLine();
        System.out.print("Rate the lesson out of 5: ");
        int rating = r.nextInt();

    }
}
