package ru.netology;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        System.out.println(service.averageMonthSale(sales));


    }
}