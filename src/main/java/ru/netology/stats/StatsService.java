package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int salesAmount = 0;

        for(int i=0; i<sales.length;i++){
            salesAmount += sales[i];
        }
        return salesAmount;
    }

    public int averageSale (int[] sales) {

        int averageSale = salesAmount(sales) / sales.length;
        return averageSale;
    }

    public int peakSales (int[] sales) {
        int maxMonth = 0; // месяц с максимальными продажами
        int month = 0; // номер месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
    public int minSales (int[] sales){
        int minMonth = 0; // месяц с минимальными продажами
        int month = 0; // номер месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int countOfMonthsOfMinAverageSale (int[] sales){
         int countOfMonthsOfMinAverageSale = 0;
         for (int i=0; i<sales.length; i++){
             if (sales[i]<averageSale(sales)){
                 countOfMonthsOfMinAverageSale += 1;
             }
         }
         return countOfMonthsOfMinAverageSale;
    }
    public int countOfMonthsOfMaxAverageSale (int[] sales) {
        int countOfMonthsOfMaxAverageSale = 0;
        for (int i=0; i>sales.length; i++){
            if (sales[i]<averageSale(sales)) {
                countOfMonthsOfMaxAverageSale += 1;
            }
        }
        return countOfMonthsOfMaxAverageSale;
    }
}
