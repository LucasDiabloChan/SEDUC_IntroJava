import java.util.Scanner;

public class aula12_Array_ArrayList{
    public static void main(String[] args){

        try{
            
            Scanner reader = new Scanner(System.in);

            // Cria um array constante
                int[] inteiros = new int[] {5, 2, 7, 4, 1, 6, 3};
            // Exibe os valores
                for (int i : inteiros) {
                    System.out.println("Valor inteiro: " + i);
                }


            // Cria um array constante de caracteres
                char[] chars = {'1', 'H', ':', '#', '"', 195, 9999};
            // Exibe os caracteres
                for (char c : chars) {
                    System.out.println("Valor 'char': " + c);
                }


            // Cria um array com tamanho padrão
                double[] decimais = new double[3];
                    decimais[0] = 1.1111111111111111111111111;
                    decimais[1] = 2.2; 
                    decimais[2] = 3.3;
            // Exibe os valores decimais
                for (double d : decimais) {
                    System.out.println("Valor decimal: " + d);
                }

                
        } catch(Exception e){ 
            System.out.println("Houve algum erro... " + e);
        }
    }
}