import java.util.Scanner;

public class SortNumber {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
double temp;
if (num1 < num2) {
    temp = num1;
    num1 = num2;
    num2 = temp;
}
else {
    if (num2 < num3) {
        temp = num2;
        num2 = num3;
        num3 = temp;
    }
    System.out.print("Sorted number: " + num1 + "\t" + num2 + "\t" + num3);
}
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter number 1: ");
double num1 = input.nextDouble();
System.out.print("\nEnter number 2: ");
double num2 = input.nextDouble();
System.out.print("\nEnter number 3: ");
double num3 = input.nextDouble();
displaySortedNumbers(num1, num2, num3);
    }
}
