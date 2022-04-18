package courseWork.assignment;


class Price {

    static int[] price = new int[]{50, 10, 20, 40, 25, 30};

    void prices()
    {
        for (int i=0; i<6; i++)
        {
            System.out.println("PRICE OF "+ TimeTable.exercise[i] + " : "+ price[i]+"$");
        }
    }
}

public class Main {
    static int studentI=-1;

    public static void main(String[] args) {
        // write your code here
        Index i = new Index();
        i.indexing();
        TimeTable t = new TimeTable();
        t.selectTimeTable();

    }
}
