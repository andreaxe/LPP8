import java.util.Objects;

public class FrutaVolumeImpl extends Fruta implements IFruta, Cloneable {

    private int volume;
    /**
     *
     * @param name name of the fruit
     * @param volume volume in boxes for example
     * @param price price per volume or number of boxes
     */
    public FrutaVolumeImpl(String name, int volume, double price){
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public double valorPago(){
        return this.volume * this.price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
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
    public String toString() {
        return "Adquiriu " + this.volume + " caixas de " + this.name + " pelo preço unitário de: " + this.price +
                "€ perfazendo o valor total de: " + this.valorPago() + "€";
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}
