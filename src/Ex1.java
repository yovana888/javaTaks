import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        boolean isPrime=true;
        if(n>1){
            for (int i = 2; i < n; i++) {
                if(n%i == 0){
                    isPrime=false;
                    break;
                }
            }
        }else{
            isPrime=false;
        }

        System.out.println(isPrime ? "Primo": "No primo");
    }
}