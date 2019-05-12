import java.util.Objects;

public class FrutaUnidadeImpl extends Fruta implements IFruta, Cloneable {

    private int quantity;

    public FrutaUnidadeImpl(String name, int quantity, Double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double valorPago(){
        return this.quantity * this.price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FrutaUnidadeImpl)) return false;
        FrutaUnidadeImpl that = (FrutaUnidadeImpl) o;
        return Double.compare(that.quantity, quantity) == 0 && Double.compare(that.price, price) == 0 &&
                (that.name.equals(name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }

    @Override
    public String toString() {
        return "Adquiriu " + this.quantity + " unidades de " + this.name + " pelo preço unitário de: " + this.price +
                "€ perfazendo o valor total de: " + this.valorPago() + "€";
    }

    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}
