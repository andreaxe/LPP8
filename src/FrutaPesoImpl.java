public class FrutaPesoImpl extends FrutaImpl implements Fruta {

    public double weight;

    /**
     *
     * @param name name of the fruit
     * @param weight weight value
     * @param price price by weight measure
     */
    public FrutaPesoImpl(String name, Double weight, Double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double valorPago(){

        this.valorPago = this.price * this.weight;
        return this.valorPago;
    }
}
