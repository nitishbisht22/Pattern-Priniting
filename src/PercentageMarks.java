import java.util.Scanner;

public class PercentageMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = scn.nextLine();
        System.out.print("enter the total marks of a subject : ");
        int total_marks_subject = scn.nextInt();
        System.out.print("enter the 1st Subject marks : ");
        double subject1 = scn.nextDouble();
        System.out.print("enter the 2nd Subject marks : ");
        double subject2 = scn.nextDouble();
        System.out.print("enter the 3rd Subject marks : ");
        double subject3 = scn.nextDouble();
        System.out.print("enter the 4th Subject marks : ");
        double subject4 = scn.nextDouble();
        System.out.print("enter the 5th Subject marks : ");
        double subject5 = scn.nextDouble();
        double marks;
        double total_marks;
        total_marks = total_marks_subject * 5;
        marks = ((subject1 + subject2 + subject3 + subject4 + subject5) / total_marks ) * 100;
        System.out.println(name + ", your percentage is " + marks + "%");



    }
}
