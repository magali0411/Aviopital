package GUI.ModelTemp;

public class PlaneTemp {

    private double volume;
    private double load;

    private double volumeTot;
    private double loadTot;


    public PlaneTemp(){
        this.load = 0.;
        this.volume = 0.;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
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
}
