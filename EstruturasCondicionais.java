/**
*<h2>Estruturas condicionais</h2>
*Exemplos de condicionais simples, compostas, encadeadas, ternárias e de estruturas switch
*@author Telmo-Lenz
*/
public class EstruturasCondicionais
{

    public static void main (String[] args){
        //Condicional simples
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        //Condicional composta
        int nota = 6;
       
        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");
//  Vale ressaltar que no Java, em uma condição if/else às vezes necessitamos
//  adicionar um bloco de { },se a lógica conter mais de uma linha.

        //Condicional encadeada    
        if (nota >= 7)
		    System.out.println("Aprovado");
	    else if (nota >= 5 && nota < 7)
		    System.out.println("Recuperação");
	    else
		    System.out.println("Reprovado");

        //Condição ternária 1
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        //Condição ternária 2
        String resultado2 = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);

        //A estrutura switch case, compara o valor de cada caso, com o da variável sequencialmente e 
        //sempre que encontra um valor correspondente, executa o código associado ao caso.
        String sigla = "M";

		switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
		}
		
        //Sem o break executará todas as linhas após a correspondência
        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
		
	}
}