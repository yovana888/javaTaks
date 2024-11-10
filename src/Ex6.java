import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mensaje: ");
        String message = sc.nextLine();

        StringBuilder message1 = new StringBuilder();
        StringBuilder message2 = new StringBuilder();
        int index = -1;

        for (int i = 0; i < message.length(); i++) {
            message1.append(message.charAt(i));
            message2.setLength(0);  // Limpiar message2 para reiniciar su contenido en cada iteración
            for (int j = 0; j <= i; j++) {
                message2.append(message.charAt(message.length() - i + j - 1));  // Tomamos caracteres desde el final de la cadena
            }

            // Comparar si message1 y message2 son iguales
            if (message1.toString().equals(message2.toString())) {
                index = i;
                break;
            }
        }

        // Verificamos si encontramos un solapamiento
        if (index != -1) {
            System.out.println("Mensaje original: " + message1);
            System.out.println(index + 1 == message.length() - 1 ? "Solapamiento completo" : "Solapamiento parcial");
        } else {
            System.out.println("No hay solapamiento");
        }
    }

}
