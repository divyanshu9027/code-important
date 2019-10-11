import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT");
        float principle=scanner.nextInt();
        System.out.println("ENTER THE RATE OF INTEREST");
        float rate=scanner.nextInt();
        System.out.println("ENTER THE TIME IN YEARS");
        int time=scanner.nextInt();
        float simpleinterest=principle*rate*time/100;
        System.out.println(simpleinterest);

    }
}