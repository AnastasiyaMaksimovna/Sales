import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void correctnessOfCalculations() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.salesAmount(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }
    @Test
    public void correctnessCalculationAverageSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 15;
        int actualSales = service.averageSale(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void numberMonthWithHighSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 8;
        int actualSales = service.peakSales(sales);

        Assertions.assertEquals(expectedSales,actualSales);

    }

    @Test
    public void numberMonthWithLowSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 9;
        int actualSales = service.minSales(sales);

        Assertions.assertEquals(expectedSales,actualSales);
    }

    @Test
    public void countingOfMonthsWithLowSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.countOfMonthsOfMinAverageSale(sales);

        Assertions.assertEquals(expectedSales, actualSales);

    }

    @Test
    public void countingOfMonthsWithHighSales(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.countOfMonthsOfMaxAverageSale(sales);
    }

}
