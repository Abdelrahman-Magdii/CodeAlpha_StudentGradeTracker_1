import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> grades =new  ArrayList<>();

        System.out.println("Enter the students grades (Enter -1 to finish)");
        while(true){
            System.out.print("Enter students grade: ");
            double grade = -1.0;
            grade = scanner.nextDouble();
            if (grade == -1.0){
                break;
            }
            grades.add(grade);
        }

        //Compute Average
        double average=computeAverage(grades);
        System.out.println("Average grades: " + average);

        //Highest Score
        double highestScore= Collections.max(grades);
        System.out.println("Highest Score: " + highestScore);

        //Lowest Score
        double LowestScore =Collections.min(grades);
        System.out.println("Lowest Score: " + LowestScore);


    }
    public static double computeAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}