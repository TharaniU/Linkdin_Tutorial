import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectattendence = true;

        String studentFirstName = "Tharani";
        String studentLastName = "Udugampola";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectattendence);

        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);





    }
}