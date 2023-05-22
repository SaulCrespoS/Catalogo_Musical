package clasesqueordenan;

import java.util.Comparator;

import entidades.Medio;

public class Orden_Nombre implements Comparator<Medio> {

	@Override
	public int compare(Medio o1, Medio o2) {
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
