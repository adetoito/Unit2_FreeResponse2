package com.company;

public class HighSchoolClass {

    public HighSchoolClass (double g, boolean h) {
        GPA = g;
        honors = h;
    }

    public void arrayConversion (HighSchoolClass arr[]) {

        students = arr;

    }

    private Student [] students;
    public double GPA;
    public boolean honors;

    public Student getValedictorian() {

        double startGPA = 0.0;
        int index = 0;
        for (int counter = 0; counter < students.length; counter++) {
            if (GPA > startGPA) {
                startGPA = GPA;
                index = counter;
            }
        }
        return students[index];

    }

    public double getHonorsPercentage() {

        int inHonors = 0;
        for (int counter = 0; counter < students.length; counter++) {
            boolean yesOrNo = honors;
            if (yesOrNo) {
                inHonors += 1;
            }
        }
        double percent = inHonors / students.length;
        return percent;

    }

    public double getGPA() {

        return GPA;

    }

    public boolean isHonors() {

        if (honors) {
            return true;
        } else {
            return false;
        }

    }

}
