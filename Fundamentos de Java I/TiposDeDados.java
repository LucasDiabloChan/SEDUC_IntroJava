/*
 * Descrição: exemplos de tipos de dados, constantes e variáveis;
 * Author: Prof. Lucas Mateus;
 * Created at: --/--/----
*/

/* Sumário:
>   1 - Explicação:
>       1.1 Tipos Abstratos de Dados (TAD);
>       1.2 Variáveis;
>       1.3 Constantes;
>
>   2 - Demonstração:
>       2.1 Declaração de variáveis;
>       2.2 Declaração de constantes;
*/

// - - - - - EXPLICAÇÃO - - - - - - //
/* 
    // ==> TIPOS ABSTRATOS DE DADOS (TAD) <== //
    /
    /   Os tipos de dados dizem ao computador que tipo de dado será alocado na memória,
    /   o que facilita o uso e a manipulação desses valores.
    /   
    /   Na linguagem Java, os tipos mais usado são:
    /   
    /   --> 'int' ('inteiro') : usado para armazenar valores inteiros;
    /   --> 'double' e 'float': usado para guardar valores decimais;
    /   --> 'char' (caractere): usado para salvar um único digito;
    /   --> 'String' (texto)  : usado para guardar uma sequência de digitos;
    /   --> 'boolean'         : usado para salvar valores lógicos (true/false ou 1/0).
    /
    // = = = = = = = = = = = = = = = = = = = = //
    
    // ==> DECLARAÇÃO DE VARIÁVEIS <== //
    /
    /   As variáveis, além de ser espaços alocados na memória RAM, armazenam valores de
    /   acordo com seu tipo, valores os quais podem ser sobrescritos diversas vezes du_
    /   rante a execução de um programa.
    /
    /   Na linguagem Java, para declarar uma variável, precisamos dizer qual tipo de dado
    /   será armazenado naquele espaço da memória RAM e qual nome usaremos para acessar 
    /   esse espaço.
    /
    /   String nomeParaAcessarVariavel = "Essa é uma String, pois seu conteúdo é textual.";
    /
    // = = = = = = = = = = = = = = = = = //
    
    // ==> DECLARAÇÃO DE CONSTANTES <== //
    /
    /   As constantes são valores alocados na memória RAM que não se alteram durante
    /   a execução de um programa. Se ela receber o valor '15', por exemplo, ela terá 
    /   esse valor até o programa ser encerrado.
    /
    /   Na linguagem Java, para dizer que um valor é constante, acrescentamos a palavra
    /   reservada "final" na frente de uma variável.
    /
    /   final String minhaConstante = "agora é uma constante";
    // = = = = = = = = = = = = = = = = = //
*/
    
public class TiposDeDados{
    public static void main (String[] args) {
        /* DEMONSTRAÇÃO */
        // VARIÁVEIS
            int     minhaVarInt    = 17;
            double  minhaVarDouble = 9.99;
            float   minhaVarFloat  = 19.99f; // Obrigátorio colocar o 'f'
            char    minhaVarChar   = '#'; // Obrigátorio usar aspas simples
            String  minhaVarString = "Lorem ipsum."; // Obrigátorio usar aspas duplas
            boolean minhaVarBool   = true;
        
        // CONSTANTES
            final int     minhaConstInt    = 1234444;
            final double  minhaConstDouble = .99; // será salvo como '0.99'
            final float   minhaConstFloat  = .37f; // será salvo como '0.37'
            final char    minhaConstChar   = 84; // podemos dizer a posição do caractere na tabela UNICODE
            final String  minhaConstString = "Lorem ipsum.";
            final boolean minhaConstBool   = true;
    }
}
