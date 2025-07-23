import java.util.*;
public class SGC{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******************Student grade Calculator*******************");
        System.out.print("Enter the number of subjects : ");

        // Here s is the number of subjects
        int s = sc.nextInt();
        int total = 0;
        System.out.println("Enter the marks obtained in " +s+ " subjects respectively : ");
        for(int i=0;i<s;i++) {
            System.out.print("Subjects " + (i+1) + ": " );
            int marks = sc.nextInt();

            if(marks < 0 || marks > 100) {
                System.out.println(" Invalid input! Marks should be between 0 and 100. Assuming 0 for this subject.");
                marks = 0;
            }
            total += marks;
        }

        //AP IS Average percentage
        double AP = (double)total/s;
        String grade;
        if (AP>=90){
            grade="A+";
        }
        else if(AP>=80){
            grade="A";
        }
        else if(AP>=70){
            grade="B";
        }
        else if(AP>=60){
            grade="C";
        }
        else if(AP>=50){
            grade="D";
        }
        else if(AP>=40){
            grade="E";
        }
        else{
            grade="Fail(F)";
        }
        System.out.println("Total Marks = "+total);
        System.out.println("Average Percentage = "+AP+" %");
        System.out.println("Grade is = "+grade);
        sc.close();
    }
}