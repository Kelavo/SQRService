package ru.netology.sqr;

public class SQRService {
    public int countSquares(int from, int before) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= from & x <= before) {
                count++;
            }

        }
        return count;

    }

}



