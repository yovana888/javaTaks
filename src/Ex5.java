import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int numberRandom = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);

        int n = -1;
        int attempts = 1;

        while (n != numberRandom) {  // Usa != en lugar de !==
            System.out.println("Ingresa el número:");
            n = sc.nextInt();

            if (n < numberRandom) {
                System.out.println("Número demasiado bajo, intenta nuevamente");
            } else if (n > numberRandom) {
                System.out.println("Número demasiado alto, intenta nuevamente");
            }

            attempts++;
        }

        System.out.println("¡Felicidades! ¡Has adivinado el número! El número es " + numberRandom + " y lo adivinaste en " + attempts + " intento(s)");
    }
}
