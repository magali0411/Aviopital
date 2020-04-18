package app.transport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

import app.colis.Caisse;

public class Avion extends Transport implements Serializable{


	private float maxLoad;
	private int dorrSizeH;
	private int dorrSizeW;
	private int cargoHoldL;
	private int cargoHoldW;
	private int cargoHoldH;
	private int volume;
	private int runwayReq;
	private int loadRange;
	private int ferryRange;
	private float fuelBrun;
	private int cruiseSpeed;
	private String palletPos;
	
	private static final Logger logger = Logger.getLogger("Escrim");

	
	
	public Avion() { }
	
	
	public Avion(float maxLoad, 
			int dorrSizeH, int dorrSizeW, 
			int cargoHoldL, int cargoHoldW, int cargoHoldH,
			int volume, 
			int runwayReq, 
			int loadRange, 
			int ferryRange, 
			int cruiseSpeed,
			float fuelBrun, 
			String palletPos) {
		super();
		this.maxLoad = maxLoad;
		this.dorrSizeH = dorrSizeH;
		this.dorrSizeW = dorrSizeW;
		this.cargoHoldL = cargoHoldL;
		this.cargoHoldW = cargoHoldW;
		this.cargoHoldH = cargoHoldH;
		this.volume = volume;
		this.runwayReq = runwayReq;
		this.loadRange = loadRange;
		this.ferryRange = ferryRange;
		this.fuelBrun = fuelBrun;
		this.cruiseSpeed = cruiseSpeed;
		this.palletPos = palletPos;
	}
	
	public Avion (String name, ArrayList<Caisse> listCaisses) {
		super(name, listCaisses);
	}

	
	public boolean fit ( Caisse caisse ) {
		
		int volTotal = 0 ;
		
		for(Caisse c : super.listCaisses) {
			volTotal += c.getVolume();
		}
		
		if (volTotal + caisse.getVolume() > this.volume ||
				caisse.getHauteur() > this.getCargoHoldH() ||
				caisse.getHauteur() > this.getDorrSizeH() ||
				caisse.getLargeur() > this.getCargoHoldW() ||
				caisse.getLargeur() > this.getDorrSizeW() ||
				caisse.getLongueur() > this.getCargoHoldL()) {
			return false;
		}
		
		return true;
		
	}
	

	public float getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(float maxLoad) {
		this.maxLoad = maxLoad;
	}


	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getRunwayReq() {
		return runwayReq;
	}

	public void setRunwayReq(int runwayReq) {
		this.runwayReq = runwayReq;
	}

	public int getLoadRange() {
		return loadRange;
	}

	public void setLoadRange(int loadRange) {
		this.loadRange = loadRange;
	}

	public int getFerryRange() {
		return ferryRange;
	}

	public void setFerryRange(int ferryRange) {
		this.ferryRange = ferryRange;
	}

	public float getFuelBrun() {
		return fuelBrun;
	}

	public void setFuelBrun(float fuelBrun) {
		this.fuelBrun = fuelBrun;
	}

	public String getPalletPos() {
		return palletPos;
	}

	public void setPalletPos(String palletPos) {
		this.palletPos = palletPos;
	}

	public int getDorrSizeH() {
		return dorrSizeH;
	}

	public void setDorrSizeH(int dorrSizeH) {
		this.dorrSizeH = dorrSizeH;
	}

	public int getDorrSizeW() {
		return dorrSizeW;
	}

	public void setDorrSizeW(int dorrSizeW) {
		this.dorrSizeW = dorrSizeW;
	}

	public int getCargoHoldW() {
		return cargoHoldW;
	}

	public void setCargoHoldW(int cargoHoldW) {
		this.cargoHoldW = cargoHoldW;
	}

	public int getCargoHoldH() {
		return cargoHoldH;
	}

	public void setCargoHoldH(int cargoHoldH) {
		this.cargoHoldH = cargoHoldH;
	}

	public int getCruiseSpeed() {
		return cruiseSpeed;
	}

	public void setCruiseSpeed(int cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}

	public int getCargoHoldL() {
		return cargoHoldL;
	}

	public void setCargoHoldL(int cargoHoldL) {
		this.cargoHoldL = cargoHoldL;
	}


	@Override
	public boolean Fit(Caisse caisse) {
		// TODO Auto-generated method stub
		return false;
	}


}
