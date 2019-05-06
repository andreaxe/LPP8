import java.util.Objects;

public class FrutaVolumeImpl extends FrutaImpl {

    public double volume;
    /**
     *
     * @param name name of the fruit
     * @param volume volume in boxes for example
     * @param price price per volume or number of boxes
     */
    public FrutaVolumeImpl(String name, double volume, double price){
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public double valorPago(){
        this.valorPago = this.volume * this.price;
        return this.valorPago;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FrutaVolumeImpl)) return false;
        FrutaVolumeImpl that = (FrutaVolumeImpl) o;
        return Double.compare(that.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }
}
