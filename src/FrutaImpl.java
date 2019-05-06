public class FrutaImpl implements Fruta {

    public String name;
    public Double price;
    public double valorPago = 0.0; // By default is 0

    public FrutaImpl() {

    }

    public FrutaImpl(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public double valorPago() {
        return this.valorPago;
    }
}
