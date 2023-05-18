import java.util.Scanner;

public class Lista{
    public static void main(String[] args){

        // Tenta executar um algoritmo
        try{
            // Manifesta a classe Scanner
                Scanner leitor = new Scanner(System.in);

            // Pega um número inteiro
                System.out.println("Insira um número: ");
                int num = leitor.nextInt();

            // Gera uma exceção se um nº estiver fora do intervalo
                if(num > 0 && num < 100)
                    System.out.println("Voce digitou: " + num + ", que está no intervalo.");
                else
                    // Cria uma nova exceção
                    throw new Exception("Ê bixo, faz tua parte certa ai bixo."); 
        
            // Caso dê algum erro...
        } catch(Exception e){ // Pega o erro e exibe-o
            System.out.println("Ó o erro aqui: " + e);
        }
    }
}
