import java.util.Objects;

public class FrutaPesoImpl extends Fruta implements IFruta, Cloneable {

    private double weight;
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

        return this.price * this.weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Adquiriu " + this.name + " com o peso de " + weight + "kg" + " com o valor por kg de: " + this.price +
                "€ por:" + this.valorPago() + "€";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FrutaPesoImpl)) return false;
        FrutaPesoImpl frutaPeso = (FrutaPesoImpl) o;
        return Double.compare(frutaPeso.weight, weight) == 0 && Double.compare(frutaPeso.price, price) == 0 &&
                (frutaPeso.name.equals(name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }


}
