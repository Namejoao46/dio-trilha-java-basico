
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("óla, Digite seu numero de usuario");
        int usuario = scanner.nextInt();

        System.out.println("Digite a sua agencia");
        String agencia = scanner.next();

        System.out.println("Qual o seu nome?");
        String nome = scanner.next();
        
        System.out.println("Qual seu saldo?");
        Float saldo = scanner.nextFloat();


        System.out.println("Meu numero de usuario é ; " + usuario);
        System.out.println("O numero da minha agencia é ; " + agencia);
        System.out.println("Meu nome é ; " + nome);
        System.out.println("Meu saldo e de ; " + saldo);

        System.out.println ("Olá," + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + usuario + " e seu saldo " + saldo + "já está disponível para saque");



    }
  
}