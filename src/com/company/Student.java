package com.company;

public class Student {

    public static void main(String[] args) {

        HighSchoolClass arr [] = new HighSchoolClass[1000];
        for (int c = 0; c < 50; c++) {
            arr[c] = new HighSchoolClass(4.1, true);
        }

        arr.arrayConversion();

    }
}
