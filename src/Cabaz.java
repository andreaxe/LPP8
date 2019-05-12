import java.util.ArrayList;
import java.util.HashMap;

public class Cabaz {

    ArrayList<IFruta> frutas = new ArrayList<>();

    public Cabaz(){
    }

    public void addFruta(IFruta fruta){
        this.frutas.add(fruta);
    }

    public double totalPrice(){

        double total = 0.0;

        for (IFruta fruta: frutas){
            total += fruta.valorPago();
        }

        return total;
    }

    public boolean isEmpty(){
        return this.frutas.isEmpty();
    }

    public HashMap priceByFruit(){

        HashMap<String, Double> priceByFruit = new HashMap<>();
        for (IFruta fruta : frutas) {
            priceByFruit.put(fruta.getName(), fruta.valorPago());
        }
        return priceByFruit;
    }


    public void listCabaz(){
        System.out.println("\nLista do cabaz");
        System.out.println("=============================");
        for (IFruta fruit: frutas){
            System.out.println(fruit.getName() + "-" + fruit.valorPago() + "€");
        }

    }


}
