import java.util.Objects;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FrutaPesoImpl{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", valorPago=" + valorPago +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FrutaPesoImpl)) return false;
        FrutaPesoImpl frutaPeso = (FrutaPesoImpl) o;
        return Double.compare(frutaPeso.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
