import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }

    }
}