package courseWork.assignment;

import java.util.Scanner;

public class Index {

    //ALL DATAHOLDERS THAT WOULD USE IN PROJECT
    static int a;
    static String[][] students = {
            {"Student 1","Rehan","YOGA", "RUNNING","null","null","null","null"},
            {"Student 2","Alex" ,"null","null", "BODY FIT","null","null","ZUMBA"},
            {"Student 3","Jerry" ,"YOGA","null","null","BODY BLITZ", "AQUACISE","null"},
            {"Student 4", "Malik","YOGA","RUNNING", "null","null","AQUACISE", "null"},
            {"Student 5","Peter","null","null","BODY FIT", "BODY BLITZ","null","null"},
            {"Student 6","Sheikh","YOGA","null","null","BODY BLITZ", "null","null"},
            {"Student 7","Andrew","null","null","BODY FIT", "null","AQUACISE","null"},
            {"Student 8","Katty","null","null","null","BODY BLITZ","null","ZUMBA"},
            {"Student 9","Sarah","null","null","BODY FIT","null", "AQUACISE","null"},
            {"Student 10","Yama","null","RUNNING","null","null","null","null"},
            {"null","null","null","null","null","null","null","null","null"}
    };
//    static String[][] students= new String[20][20];
    static String[][] bookedLessons= {
        {"Rehan","YOGA", "RUNNING","null","null","null","null"},
        {"Alex" ,"null","null", "BODY FIT","null","null","ZUMBA"},
        {"Jerry" ,"YOGA","null","null","BODY BLITZ", "AQUACISE","null"},
        {"Malik","YOGA","RUNNING", "null","null","null", "null"},
        {"Peter","null","null","BODY FIT", "BODY BLITZ","null","null"},
        {"Sheikh","YOGA","null","null","BODY BLITZ", "null","null"},
        {"Andrew","null","null","BODY FIT", "null","AQUACISE","null"},
        {"Katty","null","null","null","BODY BLITZ","null","ZUMBA"},
        {"Sarah","null","null","null","null", "AQUACISE","null"},
        {"Yama","null","RUNNING","null","null","null","null"},
        {"null","null","null","null","null","null","null","null"}
    };

    static String [][] bookedLessonsID={
            {"Rehan","5465", "4522","null","null","null","null"},
            {"Alex" ,"null","null", "5555","null","null","8462"},
            {"Jerry" ,"9322","null","null","4544", "8709","null"},
            {"Malik","8988","8984", "null","null","null", "null"},
            {"Peter","null","null","3699", "2544","null","null"},
            {"Sheikh","1322","null","null","7945", "null","null"},
            {"Andrew","null","null","8794", "null","4845","null"},
            {"Katty","null","null","null","3694","null","6456"},
            {"Sarah","null","null","null","null", "5454","null"},
            {"Yama","null","2130","null","null","null","null"},
            {"null","null","null","null","null","null","null","null"}
    };


    static String[][] attendLessons=  {
            {"Rehan","YOGA", "RUNNING","YOGA"},
            {"Alex" ,"RUNNING", "BODY FIT","ZUMBA"},
            {"Jerry" ,"YOGA","BODY BLITZ", "AQUACISE","AQUACISE","YOGA","BODY BLITZ"},
            {"Malik","YOGA","BODY BLITZ","YOGA"},
            {"Peter","BODY FIT", "BODY BLITZ","BODY BLITZ"},
            {"Sheikh","YOGA"},
            {"Andrew","BODY FIT","AQUACISE"},
            {"Katty","BODY BLITZ","ZUMBA"},
            {"Sarah","BODY FIT","AQUACISE"},
            {"Yama","RUNNING"},
            {"null","null","null","null","null","null","null","null"}
    };

    static String[][] reviewsLessons= new String[40][40];

    static String[][] ratingLessons=  {
            {"Rehan","5", "4","5"},
            {"Alex" ,"3", "2","1"},
            {"Jerry" ,"3","5", "2","5","4","2"},
            {"Malik","1","4","3"},
            {"Peter","2", "5","3"},
            {"Sheikh","3"},
            {"Andrew","3","1"},
            {"Katty","5","5"},
            {"Sarah","5","3"},
            {"Yama","4"},
            {"null","null","null","null","null","null","null","null"}
    };

    static int sYoga=0, sRunning=0, sBodyFit=0, sBodyBlitz=0, sAquacise=0, sZumba=0;

    public Index() {

    }

    static void indexing(){

       a= Main.studentI+=1;
       int z=a+1;

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        students[a][0]="Student "+z;
        students[a][1]=s.nextLine();

        System.out.println(students[a][0]+" : "+students[a][1]);
        System.out.println();
    }
}
