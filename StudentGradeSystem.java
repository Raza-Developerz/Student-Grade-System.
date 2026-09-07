import java.util.Scanner; // taking input
public class StudentGradeSystem 
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade System - 7 Subjects =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        int totalMarks = 0;
        int obtainedMarks = 0;

        int numSubjects = 7; // 7 subjects
        int marks[] = new int[numSubjects];
        String subjects[] = {"Math", "English", "Physics", "Chemistry", "Computer", "Urdu", "Islamiat"};

        // 7 subjects ke marks lena
        for(int i = 0; i < numSubjects; i++) {
            System.out.print("Enter Total Marks for " + subjects[i] + ": ");
            int total = sc.nextInt();
            totalMarks = totalMarks + total;

            System.out.print("Enter Obtained Marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            obtainedMarks = obtainedMarks + marks[i];
        }

        double percentage = (obtainedMarks * 100.0) / totalMarks; // % formula
        String grade;

        // Grade nikalna
        if(percentage >= 90) {
            grade = "A+";
        } else if(percentage >= 80) {
            grade = "A";
        } else if(percentage >= 70) {
            grade = "B";
        } else if(percentage >= 60) {
            grade = "C";
        } else if(percentage >= 50) {
            grade = "D";
        } else {
            grade = "F - Fail";
        }

        // Result print karna
        System.out.println("\n======== RESULT CARD ========");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("-----------------------------");
        for(int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Obtained Marks : " + obtainedMarks);
        System.out.printf("Percentage : %.2f%%\n", percentage); // 2 decimal tak
        System.out.println("Grade : " + grade);
        System.out.println("=============================");

        if(percentage >= 50) {
            System.out.println("Status: PASS ✅");
        } else {
            System.out.println("Status: FAIL ❌");
        }

        sc.close();
    }
}
