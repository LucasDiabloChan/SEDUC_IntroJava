public class Heranca {
    public static void main(String[] args) {
        
        Animal pombo = new Cachorro(9, "DogDoBalacoBaco", 30, "Cinza", 2);
        
        pombo.emitirSom();

        pombo.irAoBanheiro();

        System.out.println(" = = = = = = = = = = = = ");

        Cachorro caramelo = new Cachorro(5, "DogWow", 20, "Caramelo", 1);

        caramelo.correr();
        caramelo.latir();
        caramelo.irAoBanheiro();
        System.out.println(caramelo.comprimentoDaCauda);
    }
}


abstract class Animal{

    protected double peso;
    protected String nome;
    public String corDoPelo;

    public void emitirSom(){
        System.out.println("som de animal");
    }

    protected void irAoBanheiro(){
        System.out.println("Preferimos não ver");
    }

}

class Cachorro extends Animal{

    protected int idade;
    public int comprimentoDaCauda;

    public Cachorro(int id, String nome, int peso, String corPelo, int tamCauda){
        this.idade = id;
        this.nome = nome;
        this.peso = peso;
        this.corDoPelo = corPelo;
        this.comprimentoDaCauda = tamCauda;
    }

    public void latir(){
        System.out.println("Au au");
    }

    public void correr(){
        System.out.println("correndo");
    }
}
