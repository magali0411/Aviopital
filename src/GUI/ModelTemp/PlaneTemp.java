package GUI.ModelTemp;

public class PlaneTemp {

    private double volume;
    private double maxLoad;

    private double currentVolume = 0.;
    private double currentLoad = 0.;

    private double volumeTot;
    private double loadTot;

    private int qty;


    public PlaneTemp(){
        this.qty = 1;
        this.volume = 90.;
        this.maxLoad = 18.;
        this.volumeTot = this.volume;
        this.loadTot = maxLoad;
    }

    public void modifyLoadAndVolume(int qty){
        this.qty = qty;
        volumeTot = qty * volume;
        loadTot = qty * maxLoad;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public double getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(double currentLoad) {
        this.currentLoad = currentLoad;
    }

    public double getVolumeTot() {
        return volumeTot;
    }

    public void setVolumeTot(double volumeTot) {
        this.volumeTot = volumeTot;
    }

    public double getLoadTot() {
        return loadTot;
    }

    public void setLoadTot(double loadTot) {
        this.loadTot = loadTot;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
