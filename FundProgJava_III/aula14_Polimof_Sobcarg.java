// Demonstração de como se utilizar Polimorfismo e Sobrecarga
// Prof. Lucas, 17/07/2023
public class aula14_Polimof_Sobcarg{
    public static void main (String[] args) {
        
        // Classes abstratas não podem ser instanciadas
        // Pai p = new Pai();
        
        /*
        / O tipo "Filha" não pode receber o tipo "Pai"
        / porque a filha possui o "DNA" do pai, 
        / mas o "Pai" não tem o DNA da "Filha"
        / Técnicamente, a classe Filha está abaixo da classe Pai. 
        */
        // Filha pai = new Pai();
        
        
        Filha f = new Filha();
        
        Pai fia = new Filha();
        
        
        f.assinatura();
        f.assinatura("Victor");
        
        fia.assinatura();
        fia.assinatura("Victor");
    }
}

// ------------------------------ //
/* CLASSE QUE FORNECERÁ UM MÉTODO */
// ------------------------------ //
abstract class Pai{
    abstract void assinatura();
}

// --------------------------- //
/* CLASSE QUE HERDARÁ O MÉTODO */
// --------------------------- //
class Filha extends Pai{
    int assinatura(String chequeDeUmBilhaoDeReais){
        System.out.println("Esse método exerce o conceito de Polimorfismo, "
                + "porque pegou um outro método e o alterou.");
    }
    
    void assinatura(){
        System.out.println("Enquanto esse aqui, exerce o de Sobrecarga, que é "
                + "ter mais de um método com o mesmo nome, porém com parâmetros"
                + "diferentes.");
    }
}
