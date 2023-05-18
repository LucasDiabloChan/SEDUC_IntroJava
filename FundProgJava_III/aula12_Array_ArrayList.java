import java.util.ArrayList;

public class aula12_Array_ArrayList{
    public static void main(String[] args){

        try{

            // Cria um array constante com valores inteiros
                int[] inteiros = new int[] {5, 2, 7, 4, 1, 6, 3};
            // Exibe os valores
                for (int i : inteiros) {
                    System.out.println("Valor inteiro: " + i);
                }


            // Cria um array constante de caracteres
                char[] chars = {'1', 'H', ':', '#', '"', 196, 9999};
            
                for (char c : chars) {
                    System.out.println("Valor 'char': " + c);
                }


            // Cria um array com tamanho padrão
                double[] decimais = new double[3];
                    decimais[0] = 1.1111111111111111111111111;
                    decimais[1] = 2.2; 
                    decimais[2] = 3.3;

                for (double d : decimais) {
                    System.out.println("Valor decimal: " + d);
                }


            // Cria um ArrayList
                ArrayList<Integer> listInt = new ArrayList<>();
                    listInt.add(40); // Cria um índice e preenche-o
                    listInt.add(80);
                    listInt.add(161);
                    listInt.add(322);
                    listInt.add(644);
                    
                System.out.println("Removido: " + listInt.remove(2)); // Remove um índice e retorna-o
                
                for (Integer listINT : listInt) {
                    System.out.println("Lista: " + listINT);
                }


        } catch(Exception e){ 
            System.out.println("Houve algum erro... " + e);
        }
    }
}
