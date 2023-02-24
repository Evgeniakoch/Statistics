package ru.netology;

public class StatsService {

    public int saleAmount(int[] sales) {
        int sum = 0;
        for(int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public float averageMonthSale(int[] sales) {
        float average = 0;
        average = saleAmount(sales) / sales.length;

        return average;
    }
    public int getMaxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }
    public int getMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int monthAmountLowerAverage(int[] sales) {
        int amountLower = 0;
        float average = averageMonthSale(sales);
        for(int sale : sales) {
            if(sale < average) {
                amountLower = amountLower + 1;
            }
        }

        return amountLower;
    }
    public int monthAmountUnderAverage(int[] sales) {
        int amountUnder = 0;
        float average = averageMonthSale(sales);
        for (int sale : sales) {
            if (sale > average) {
                amountUnder = amountUnder + 1;
            }
        }

        return amountUnder;
    }
}
