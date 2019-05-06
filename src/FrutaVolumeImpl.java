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
        this.valorPago = this.volume * price;
        return this.valorPago;
    }

}
