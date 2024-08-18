import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número:");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua agência:");
        String agencyNumber = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String name = scanner.next();

        System.out.println("Por favor, digite seu saldo:");
        double balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque.");
    }
}
