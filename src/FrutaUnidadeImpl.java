public class FrutaUnidadeImpl extends FrutaImpl implements Fruta{

    public int quantity;

    public FrutaUnidadeImpl(String name, int quantity, Double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double valorPago(){
        this.valorPago = this.quantity * this.price;
        return this.valorPago;
    }
}
