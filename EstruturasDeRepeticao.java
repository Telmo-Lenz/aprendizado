/*
 * Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, 
 * são comandos que permitem iteração de código, ou seja, que comandos presentes no 
 * bloco sejam repetidos diversas vezes. 
 */
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
 public class EstruturasDeRepeticao {
    public static void main(String[] args) 
    {

        /*estrutura do controle de fluxo for

            for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
            {
                comando que será executado até que a 
                expressão de validação torne-se falsa 
            } 
        */
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) 
        {
		    System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        //Também pode ser escrito desta forma
        //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }
        
        //For utilizado com arrays e coleções
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        
        //Forma abreviada (FOR EACH)
	    for(String aluno : alunos) {
            System.out.println(aluno);
        }

        //O comando break interrompe o laço, já o continue interrompe somente a iteração atual.
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;      //Imprime 1 2 e para
            
            System.out.println(numero);
        }
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;   // Imprime 1 2 4 5
            
            System.out.println(numero);
        }

        /*O laço while, testa a condição antes de executar o código, logo, 
        caso a condição seja inválida no primeiro teste o bloco nem será executado.
        
        Estrutura do controle de fluxo while
        while (expressão booleana de validação)
        {
            comando que será executado até que a 
            expressão de validação torne-se falsa 
        } 
        */
        double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();    //objeto valorAleatoria criado abaixo
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        /*do / while testa a condição após executar o código, sendo assim, mesmo que a condição 
        *seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.
        * estrutura do controle de fluxo do while
        do
        {
            comando que será executado até que a 
            expressão de validação torne-se falsa 
        }
        while (expressão booleana de validação);
        */
        System.out.println("Discando...");
        do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        
        }while(tocando());
        
        System.out.println("Alô !!!");
    }
    
    //Cria objeto valorAleatorio
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    // Gera um randômico booleano para atendeu
    private static boolean tocando() 
    {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
