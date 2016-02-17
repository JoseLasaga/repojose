package JLciervo;

import pkgClaseAbstracta.Animal;

public class Ciervo extends Animal {
	private int npuntas;  //numero de puntas en las cuernas

	public Ciervo(String genero, String especie, String nombreVulgar, int tiempoMedioVida,int npuntas) {
		super(genero, especie, nombreVulgar, tiempoMedioVida);
		this.setNpuntas(npuntas);
		// TODO Auto-generated constructor stub
	}

	public int getNpuntas() {
		return npuntas;
	}

	public void setNpuntas(int npunta) {
		this.npuntas = npunta;
	}

	@Override
	public void SeDesplaza() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SeAlimenta() {
		// TODO Auto-generated method stub

	}

}
