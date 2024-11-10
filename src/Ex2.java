import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el total de litros:");
        int totalLT= sc.nextInt();
        double totalPay=10;

        if(totalLT >= 0) {
            if(totalLT >50 && totalLT<=200){
                totalPay=totalLT*0.5;
            }

            if(totalLT > 200){
                totalPay=totalLT*1.5;
            }

            System.out.println("$"+totalPay);
        }else{
            System.out.println("El total no puede ser negativo");
        }
    }
}