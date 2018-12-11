import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a student's name: ");
        String name = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is " + (i + 1));
                isExist = true;
            }
        }
        if (!isExist)
            System.out.println("Not found student " + name + " in the list");
    }
}
