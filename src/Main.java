import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {

        ArrayList<IFruta> boughtItems = new ArrayList<>(); // Para armazenar a fruta que se vai comprando
        Cabaz cabaz = new Cabaz(); // Armazenar a fruta num cesto

        int choice;

        do {
            // Definição do menu
            HelperMenu.compras(boughtItems);
            HelperMenu.cesto(cabaz);
            HelperMenu.menu();

            choice = new Scanner(System.in).nextInt();

            switch (choice) {

                case 1:
                    FrutaUnidadeImpl FrutaUnit = new FrutaUnidadeImpl(HelperMenu.fruitName(),
                            HelperMenu.fruitQuantity(), HelperMenu.fruitPrice());
                    boughtItems.add(FrutaUnit);
                    break;
                case 2:
                    FrutaPesoImpl FrutaWeight = new FrutaPesoImpl(HelperMenu.fruitName(), HelperMenu.fruitWeight(),
                            HelperMenu.fruitPrice());
                    boughtItems.add(FrutaWeight);
                    break;
                case 3:
                    FrutaVolumeImpl FrutaVolume = new FrutaVolumeImpl(HelperMenu.fruitName(), HelperMenu.fruitVolume(),
                            HelperMenu.fruitPrice());
                    boughtItems.add(FrutaVolume);
                    break;
                case 4:
                    if (boughtItems.size() > 0) {
                        for (IFruta fruit : boughtItems) {
                            cabaz.addFruta(fruit);
                        }
                        boughtItems.clear(); // reset ao array depois de adicionada a fruta adquirida ao cesto
                        System.out.println("A fruta adquirida foi adicionada com êxito ao cabaz");
                    } else {
                        System.out.println("ERRO: não adquiriu nenhuma fruta!");
                    }
                    break;
                case 5:
                    System.out.println(cabaz.totalPrice());
                    break;
                case 6:
                    if(cabaz.isEmpty()){
                        System.out.println("O cabaz encontra-se vazio!");
                    }
                    else {
                        System.out.println(cabaz.priceByFruit());
                    }
                    break;
                case 8:
                    List<IFruta> fruitPayments = new ArrayList<>();
                    FrutaUnidadeImpl unit = new FrutaUnidadeImpl("andre", 10,10.0);
                    fruitPayments.add(unit);

                    for(IFruta payment:fruitPayments) {
                        System.out.println(payment.valorPago());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERRO: a opção inserida não é válida!");
            }
        }
        while (choice != 0);
    }
}