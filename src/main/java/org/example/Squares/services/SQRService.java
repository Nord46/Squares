package org.example.Squares.services;

public class SQRService {

    public int Squares(int q, int w) {
        int check = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= q && square <= w) {
                check++;
            }
        }
        return check;
    }

}
