package courseWork.assignment;

import java.util.Scanner;

public class Index {

    //ALL DATAHOLDERS THAT WOULD USE IN PROJECT
    static int a;
    static String[][] lessons= {
            {"1", "2", "3","4","5","6"},
            {"YOGA", "RUNNING", "BODY FIT", "BODY BLITZ", "AQUACISE", "ZUMBA"},
            {"30", "10", "20", "15", "25", "30"}
    };

    static String[][] students = {
            {"Student 1","Rehan","YOGA", "RUNNING","null","null","null","null"},
            {"Student 2","Alex" ,"null","RUNNING", "BODY FIT","null","null","ZUMBA"},
            {"Student 3","Jerry" ,"YOGA","null","null","BODY BLITZ", "AQUACISE","null"},
            {"Student 4", "Malik","YOGA","RUNNING", "null","null","AQUACISE", "null"},
            {"Student 5","Peter","null","null","BODY FIT", "BODY BLITZ","null","null"},
            {"Student 6","Sheikh","YOGA","null","null","BODY BLITZ", "null","ZUMBA"},
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
        {"Sheikh","YOGA","null","null","BODY BLITZ", "null","ZUMBA"},
        {"Andrew","null","null","BODY FIT", "null","AQUACISE","null"},
        {"Katty","null","null","null","BODY BLITZ","null","ZUMBA"},
        {"Sarah","null","null","null","null", "AQUACISE","null"},
        {"Yama","null","RUNNING","null","null","null","null"},
        {"null","null","null","null","null","null","null","null"}
    };
    static String[][] attendLessons=  {
            {"Rehan","YOGA", "RUNNING","YOGA"},
            {"Alex" ,"RUNNING", "BODY FIT","ZUMBA"},
            {"Jerry" ,"YOGA","BODY BLITZ", "AQUACISE","AQUACISE","YOGA","BODY BLITZ"},
            {"Malik","YOGA","BODY BLITZ","YOGA"},
            {"Peter","BODY FIT", "BODY BLITZ","BODY BLITZ"},
            {"Sheikh","YOGA","ZUMBA"},
            {"Andrew","BODY FIT","AQUACISE"},
            {"Katty","BODY BLITZ","ZUMBA"},
            {"Sarah","BODY FIT","AQUACISE"},
            {"Yama","RUNNING"},
            {"null","null","null","null","null","null","null","null"}
    };

    static String[][] attendLessonsEight=  {
            {"Rehan","YOGA", "RUNNING","YOGA","YOGA", "RUNNING","YOGA"},
            {"Alex" ,"RUNNING", "BODY FIT","ZUMBA"},
            {"Jerry" ,"YOGA","BODY BLITZ", "AQUACISE","AQUACISE","YOGA","BODY BLITZ","YOGA","BODY BLITZ", "AQUACISE","AQUACISE","YOGA","BODY BLITZ"},
            {"Malik","YOGA","BODY BLITZ","YOGA"},
            {"Peter","BODY FIT", "BODY BLITZ","BODY BLITZ"},
            {"Sheikh","YOGA","ZUMBA"},
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
            {"Sheikh","3","3"},
            {"Andrew","3","1"},
            {"Katty","5","5"},
            {"Sarah","5","3"},
            {"Yama","4"},
            {"null","null","null","null","null","null","null","null"}
    };
    static String[][] ratingLessonseight=  {
            {"Rehan","5", "4","5","5", "4","5"},
            {"Alex" ,"3", "2","1"},
            {"Jerry" ,"3","5", "2","5","4","2","3","5", "2","5","4","2"},
            {"Malik","1","4","3"},
            {"Peter","2", "5","3"},
            {"Sheikh","3","3"},
            {"Andrew","3","1"},
            {"Katty","5","5"},
            {"Sarah","5","3"},
            {"Yama","4"},
            {"null","null","null","null","null","null","null","null"}
    };

    static int sYoga=0, sRunning=0, sBodyFit=0, sBodyBlitz=0, sAquacise=0, sZumba=0;

    public Index() {

    }

    void indexing(){

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
