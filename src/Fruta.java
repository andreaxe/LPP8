public class Fruta {

    public String name;
    public Double price;

//    public double valorPago = 0.0; // Por defeito o valor é 0. As subclasses deverão efectuar o override ao método
    // valorPago, de outra forma assume-se que é gratuita a fruta.

    public Fruta(){}

    public Fruta(String name, Double price) {
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

    @Override
    public String toString() {
        return "Fruta{" +
                "name='" + name + '\'' +
                ", price=" + price;
    }
}
