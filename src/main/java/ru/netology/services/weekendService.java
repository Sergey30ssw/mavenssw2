package ru.netology.services;

public class weekendService {

    public int calculate(int income, int expenses, int threshold) {

        int count = 0;
        int balans = 0;

        for (int month = 1; month <= 12; month++) {
            if (balans >= threshold) {

                balans -= expenses;
                balans /= 3;
                count++;

            } else {

                balans += income;
                balans -= expenses;

            }
        }
        return count;
    }
}