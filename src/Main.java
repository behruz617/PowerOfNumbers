import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n number :");
        int n=sc.nextInt();

        System.out.print("Enter the k number ");

        int k=sc.nextInt();
        for (int i = 1; i <k ; i*=n) {
            System.out.println(i);
        }
    }
}
