import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] allNames = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ange ett namn: ");
            allNames[i] = sc.nextLine();
        }
        funktions.printNames(allNames);
        System.out.println(" Baklänges: ");
        funktions.printReversed(allNames);
    }





}