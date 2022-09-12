/**<h2>Deafio Dio - Banco Terminal</h2>
 * Solicita ao usuário as informações sobre sua conta e as imprime.
 * @author Telmo Lenz
 * @version 1.01
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * Este método é utilizado para obter e exibir as informações:
     * agencia: número da agência com dígito
     * conta: número da conta sem o dígito
     * nome: nome do cliente
     * saldo: saldo informado da conta
     */
    public static void main(String[] args){
        //Cria o objeto entrada no padrão americano ( . para separar decimais)
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        //Solicita e armazena o número da agência
        System.out.println("Informe a agência com dígito:");
        String agencia = entrada.next();

        //Solicita e armazena o número da conta
        System.out.println("Informe o número de sua conta:");
        int conta = entrada.nextInt();

        //Solicita e armazena o nome do cliente
        System.out.println("Informe o seu nome:");
        String nome = entrada.next();

        //Solicita e armazena o saldo da conta
        System.out.println("Informe o saldo de sua conta:");
        double saldo = entrada.nextDouble();

        //Exibe mensagem com as informações armazenadas
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta nº " + conta + " e seu saldo, no valor de R$ " + saldo + " já está " +
                "disponível para saque.");
    }
}
