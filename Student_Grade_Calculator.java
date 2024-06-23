import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter student name:");
    String name = scanner.nextLine();
    System.out.println("Enter marks:");
    String marks = scanner.nextLine();
    String[] gradesArr = marks.split(" ");
    int[] grades = new int[gradesArr.length];
    for (int i = 0; i < gradesArr.length; i++) {
      grades[i] = Integer.parseInt(gradesArr[i]);
    }
    int total = 0;
    for (int grade : grades) {
      total += grade;
    }
    double average = (double) total / grades.length;
    System.out.println("Student: " + name);
    System.out.println("Average grade: " + average);
    if (average >= 90) {
      System.out.println("Grade: A");
    } else if (average >= 80) {
      System.out.println("Grade: B");
    } else if (average >= 70) {
      System.out.println("Grade: C");
    } else if (average >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }
  }
}