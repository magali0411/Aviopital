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

	private int qty;


	private int currentVolume;
	private float currentLoad;

	private int volumeTot;
	private float LoadTot;

	private static final Logger logger = Logger.getLogger("Escrim");

	
	
	public Avion() { }
	
	public Avion(String name,
			String id,
			float maxLoad, 
			int dorrSizeH, int dorrSizeW, 
			int cargoHoldL, int cargoHoldW, int cargoHoldH,
			int volume, 
			int runwayReq, 
			int loadRange, 
			int ferryRange, 
			int cruiseSpeed,
			float fuelBrun, 
			String palletPos) {
		super(name, id);
		this.maxLoad = maxLoad; // poids maximal
		this.dorrSizeH = dorrSizeH; // door size
		this.dorrSizeW = dorrSizeW;
		this.cargoHoldL = cargoHoldL; // cargo hold = soute
		this.cargoHoldW = cargoHoldW;
		this.cargoHoldH = cargoHoldH;
		this.volume = volume;
		this.runwayReq = runwayReq;
		this.loadRange = loadRange;
		this.ferryRange = ferryRange;
		this.fuelBrun = fuelBrun;
		this.cruiseSpeed = cruiseSpeed;
		this.palletPos = palletPos;

		this.qty = 1;

		this.currentVolume = 0;
		this.currentLoad = 0;

		this.volumeTot = volume;
		this.LoadTot = maxLoad;
	}
	
	
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
		this.maxLoad = maxLoad; // poids maximal
		this.dorrSizeH = dorrSizeH; // door size
		this.dorrSizeW = dorrSizeW;
		this.cargoHoldL = cargoHoldL; // cargo hold = soute
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

	public void modifyLoadAndVolume(int qty){
		this.qty = qty;
		volumeTot = qty * volume;
		LoadTot = qty * maxLoad;
	}

	public float getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(float maxLoad) {
		this.maxLoad = maxLoad;
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

	public int getCargoHoldL() {
		return cargoHoldL;
	}

	public void setCargoHoldL(int cargoHoldL) {
		this.cargoHoldL = cargoHoldL;
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

	public int getCruiseSpeed() {
		return cruiseSpeed;
	}

	public void setCruiseSpeed(int cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}

	public String getPalletPos() {
		return palletPos;
	}

	public void setPalletPos(String palletPos) {
		this.palletPos = palletPos;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public float getCurrentLoad() {
		return currentLoad;
	}

	public void setCurrentLoad(float currentLoad) {
		this.currentLoad = currentLoad;
	}

	public int getVolumeTot() {
		return volumeTot;
	}

	public void setVolumeTot(int volumeTot) {
		this.volumeTot = volumeTot;
	}

	public float getLoadTot() {
		return LoadTot;
	}

	public void setLoadTot(float loadTot) {
		LoadTot = loadTot;
	}

	public static Logger getLogger() {
		return logger;
	}

	@Override
	public boolean Fit(Caisse caisse) {
		// TODO Auto-generated method stub
		return false;
	}


}
