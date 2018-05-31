package ihm;

import java.util.Observable;

public class ModelSousVueRechercher extends Observable{
	Object[][] data;
	
	public ModelSousVueRechercher(Object[][] data) {
		this.data = data;
	}

}