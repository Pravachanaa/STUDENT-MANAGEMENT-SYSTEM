import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Student  2. View Students  3. Exit");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                
                students.add(new Student(id, name, age));
                System.out.println("Student Added!");
                
            } else if (choice == 2) {
                for (Student s : students) {
                    System.out.println(s.id + " " + s.name + " " + s.age);
                }
                
            } else break;
        }
        sc.close();
    }
}
