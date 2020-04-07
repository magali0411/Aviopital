package app;

import java.io.Serializable;
import java.util.ArrayList;

public class Avion extends transport implements Serializable{

	
	private double maxLoad;
	private String dorrSize;
	private String cargoHold;
	private double volume;
	private int runwayReq;
	private int loadRange;
	private int ferryRange;
	private int fuelBrun;
	private String palletPos;
	
	
	public Avion() { }
	
	public Avion (String name, ArrayList<caisses> listCaisses) {
		super(name, listCaisses);
	}

}
