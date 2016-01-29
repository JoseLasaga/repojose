package Pato;

public class Pato {
	private int posicion;

//CONSTRUCTOR
	public Pato(int pos){
		this.posicion=pos;
	}
	
	public int AndarHaciaAdelante(int pasos){
		return this.posicion+=pasos;
	}
	public int AndarHaciaAtras(int pasos){
		return this.posicion-=pasos;
	}
	public int DimePosicion(){
		return this.posicion;
	}
}
