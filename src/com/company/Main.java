package com.company;

import java.util.Scanner;


class Price {

    static int[] price = new int[]{50, 10, 20, 40, 25, 30};

    void prices()
    {
        for (int i=0; i<6; i++)
        {
            System.out.println("PRICE OF "+ TimeTable.execrcise[i] + " is: "+ price[i]+"$");
        }

    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Index i = new Index();
        i.indexing();
        TimeTable t = new TimeTable();
        t.selectTimeTable();

    }
}
