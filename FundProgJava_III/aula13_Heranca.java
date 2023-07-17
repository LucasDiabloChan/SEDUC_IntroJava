// Demonstração de como utilzar herança de classes em Java
// Prof Lucas, 17/07

public class Heranca{
	public static void main(String[] args) {
	    
		// -------------------------------- //
	    // Instancia as classes pai e filha //
		// -------------------------------- //
		ClassePai cp = new ClassePai();
        ClasseFilha cf = new ClasseFilha();
        
		// ---------------------------------- //
		// Chama os componentes da classe pai //
		// ---------------------------------- //
		cp.metodoDaClassePai();
		System.out.println(cp.idadeDaClassePai = 10);
		
		// ------------------------------------ //
		// Chama os componentes da classe filha //
		// ------------------------------------ //
		cf.metodoDaClassePai();
		cf.metodoDaClasseFilha();
		// Não mostra '10' porque este é um atributo da 'ClasseFilha', que
		// não recebeu nenhum valor ainda
		System.out.println(cf.idadeDaClassePai); 
		System.out.println(cf.idadeDaClasseFilha = 2);
	}
}

// ----------------------- //
// CLASSE PARA SER HERDADA //
// ----------------------- //
class ClassePai{
    int idadeDaClassePai;

    public void metodoDaClassePai(){
        System.out.println("Método da classe pai.");
    }
}

// ------------------------ //
// CLASSE QUE HERDARÁ OUTRA //
// ------------------------ //
class ClasseFilha extends ClassePai{

    int idadeDaClasseFilha;

    public void metodoDaClasseFilha(){
        System.out.println("Método da classe filha.");
    }
}




