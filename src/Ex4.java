import java.util.Scanner;

public class Ex4{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n=sc.nextInt();
        int totalFac=1;

        if(n >= 0) {
            for (int i = 1; i <= n; i++) {
                totalFac=totalFac*i;
            }
            System.out.println("Factorial es: "+totalFac);
        }

    }
}