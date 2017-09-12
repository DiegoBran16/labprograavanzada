package ejrcicio.monstruos;

public interface FabricaRanger {
	
	  public boolean apilar(Monstruo monstruo);
	    public boolean desapilar(Monstruo monstruo);
	    public boolean encolar(Monstruo monstruo);
	    public boolean desencolar(Monstruo monstruo);
	    public Monstruo fabricar(String elemento);
	}


