import java.util.ArrayList;
import java.util.HashMap;

public class Cabaz {

    ArrayList<FrutaImpl> frutas = new ArrayList<>();

    public Cabaz(){
    }

    public void addFruta(FrutaImpl fruta){
        this.frutas.add(fruta);
    }

    public double totalPrice(){

        double total = 0.0;

        for (FrutaImpl fruta: frutas){
            total += fruta.valorPago();
        }

        return total;
    }

    public HashMap priceByFruit(){

        HashMap<String, Double> priceByFruit = new HashMap<>();
        for (FrutaImpl fruta : frutas) {
            priceByFruit.put(fruta.getName(), fruta.valorPago());
        }
        return priceByFruit;
    }


    public void listCabaz(){
        System.out.println("Lista do cabaz");
        for (FrutaImpl fruit: frutas){
            System.out.println(fruit.getName());
        }
        System.out.println("=============================");

    }


}
