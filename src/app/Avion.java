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

	public double getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}

	public String getDorrSize() {
		return dorrSize;
	}

	public void setDorrSize(String dorrSize) {
		this.dorrSize = dorrSize;
	}

	public String getCargoHold() {
		return cargoHold;
	}

	public void setCargoHold(String cargoHold) {
		this.cargoHold = cargoHold;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
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

	public int getFuelBrun() {
		return fuelBrun;
	}

	public void setFuelBrun(int fuelBrun) {
		this.fuelBrun = fuelBrun;
	}

	public String getPalletPos() {
		return palletPos;
	}

	public void setPalletPos(String palletPos) {
		this.palletPos = palletPos;
	}

}
