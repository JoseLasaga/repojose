package Pato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato mipato=new Pato(8);
		mipato.AndarHaciaAdelante(3);
		System.out.println("la posicion del pato es: "+ mipato.DimePosicion());
	}

}
