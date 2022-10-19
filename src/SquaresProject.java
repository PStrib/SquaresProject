import java.util.Scanner;

public class SquaresProject {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int maxNum= scan.nextInt();

        for (int i=0; i<=maxNum; i++){
            System.out.println(i*i);
        }
        System.out.println();

        int squared=0;
        int i=0;
        while (squared<=maxNum){
            squared=i*i;
            System.out.println(i +"("+squared+")");
            i++;
        }
    }
}