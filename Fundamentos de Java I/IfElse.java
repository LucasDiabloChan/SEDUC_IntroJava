/*
 * Descrição: controle de fluxo com If/Else;
 * Author: Prof. Lucas Mateus;
 * Created at: --/--/----
*/

/* Sumário:
>   1 - Explicação:
>       1.1 Condições;
>       1.2 Operadores;
>           1.2.1 Aritmeticos;
>           1.2.2 Lógicos;
>           1.2.3 Relacionais;
>
>   2 - Demonstração:
>       2.1 if;
>       2.2 if...else;
>       2.3 if...else if... else;
*/

// - - - - - EXPLICAÇÃO - - - - - - //
/* 
    // ==> CONDIÇÕES BOOLEANAS <== //
    /
    /   Em programação, uma condição boolena é uma expressão que retorna 'true' ou 'false', para 
    /   expressões verdadeiras ou falsas, respectivamentes. Não existe outro valor retornado, como
    /   'maybe' (talvez), apenas 'true' ou 'false'.
    /
    /   Na linguagem Java, uma expressão pode conter operadores:
    /   
    /   --> Matemáticos;
    /   --> De comparação;
    /   --> Lógicos;
    /
    // = = = = = = = = = = = = = = = = = = = = //
    
    // ==> OPERADORES <== //
    /
    /   Assim como na matemática, podemos usar operadores para compor uma expressão, que
    /   retorna um único valor (true/false). Como exemplo, podemos perguntar se a soma de
    /   dois termos (variáveis) é maior que outro valor ou se um termo multiplicado por 2
    /   é igual a ele somado a ele mesmo. 
    /   
    /   Ficaria algo como: (10 + 15 > 1482) OU (10 * 2 = 10 + 10)
    /   
    /   Nesse caso, usamos três tipos de operadores, aritmético ('+', '*'), relacional ('>')
    /   e lógico ('OU').
    /
    /   // ==> OPERADORES - Matemáticos <== //
    /   |   
    /   |   Servem para fazer cálculos. Retornam o produto de uma expressão.
    /   |   
    /   |   Em Java, são representados por:
    /   |   
    /   |   --> Soma: '+';
    /   |   --> Subtração: '-';
    /   |   --> Divisão: '/';
    /   |   --> Multiplicão: '*';
    /   |   --> Módulo: '%';
    /   || - - - - - - - - - - - - - - - - -||
    /
    /   // ==> OPERADORES - Relacionais <== //
    /   |
    /   |   Servem para comparar valores e retornam um valor 'boolean'.
    /   |
    /   |   Em Java, os principais são:
    /   |
    /   |   --> Igual a: '==';
    /   |   --> Diferente de: '!=';
    /   |   --> Maior que: '>';
    /   |   --> Menor que: '<';
    /   |   --> Maior ou igual a: '>=';
    /   |   --> Menor ou igual a: '<=';
    /   |
    /   || - - - - - - - - - - - - - - - - -||
    /
    /   // ==> OPERADORES - Lógicos <== //
    /   |
    /   |   Servem para tecer/concatenar expressões compostas.
    /   |
    /   |   Em Java, existem vários, porém os principais são:
    /   |
    /   |   --> E: '&&';
    /   |   --> OU: '||';
    /   |   --> NEGAÇÃO: '!';
    /   |   
    /   || - - - - - - - - - - - - - - - - -||
    // = = = = = = = = = = = = = = = = = //
*/
    

public class IfElse{
    public static void main (String[] args) {
        /* DEMONSTRAÇÃO */
        
        // If pode ser isolado
        if(true){
            System.out.println("Essa condição retornou 'true'.");
        }
        
        
        // Podemos usar variáveis nas condições
        boolean minhaCondicao = 10 + 1 == 11
        String temperatura = "Frio";
        
        if(minhaCondicao && "Calor" == temperatura){
            System.out.println("Essa condição retornou 'true'.");
        }else{
            System.out.println("Essa condição retornou 'false'.");
        }
        
        
        //Podemos colocar diversos testes numa estrutura
        int meuNumeroDaSorte = 777;
        
        if(meuNumeroDaSorte < 10) // Caso haja somente um comando, as "{ }" são dispensáveis
            System.out.println("Que número pequeno!"); 
        else if(meuNumeroDaSorte == 10000000000000){
            System.out.println("É um bom número...");
            System.out.println("Mas ele é muito grande!");
        }else
            System.out.println("Catapimbas...");
    }
}
