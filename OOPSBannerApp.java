import java.util.Scanner;
 
class StudentResultIndicator {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // get student score from the user
        System.out.println("Enter grade");
        int studentGrade = input.nextInt();
 
        // if studentGrade is 50 or above
        if (studentGrade >= 50) {
            System.out.println("Congratulations!");
            System.out.println("You passed the examination.");
        } else {
            // Student_grade is less than 50
            System.out.println("Sorry.\nYou failed the examination.");
        }
        input.close();
    }
}
