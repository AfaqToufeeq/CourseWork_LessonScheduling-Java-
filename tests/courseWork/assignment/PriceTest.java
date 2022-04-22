package courseWork.assignment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceTest {

    @Test
    public void exercisePriceList() throws Exception{
        Price.prices();

    }

    @Test
    public void maxIncomeList() throws Exception{
        int max=monthlyReport.maxIncome();
        Assert.assertEquals(200,max);

    }


}