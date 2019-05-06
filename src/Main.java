import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void menu(){

        System.out.println("\n");
        System.out.println("MENU");
        System.out.println("=============================");
        System.out.println("1: Comprar fruta à unidade");
        System.out.println("2: Comprar fruta ao peso");
        System.out.println("3: Comprar fruta ao volume");
        System.out.println("4: Adicionar a fruta adquirida para o cesto");
        System.out.println("5: Calcular o preço da fruta");
        System.out.println("6: Calcular o preço da fruta no cesto");
        System.out.println("7: Calcular o preço da fruta por item do cesto");
        System.out.println("8: Listar o cabaz");
        System.out.println("=============================");
        System.out.println("0: Sair");

        System.out.println("\n");
        System.out.println("Seleccione uma opção:");
    }

    public static String fruitName(){
        System.out.println("Seleccione o nome da fruta:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Double fruitPrice(){
        System.out.println("Indique o preço:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static int fruitQuantity(){
        System.out.println("Indique a quantidade:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void valorCompra(FrutaImpl fruit){
        System.out.println("O valor da sua compra é: " + fruit.valorPago() + '€');
    }
    public static double fruitWeight(){
        System.out.println("Indique o peso:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double fruitVolume(){
        System.out.println("Indique o volume:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        ArrayList<FrutaImpl> boughtItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Cabaz cabaz = new Cabaz();

        do {
            menu();
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    FrutaUnidadeImpl FrutaUnit = new FrutaUnidadeImpl(Main.fruitName(), fruitQuantity(), fruitPrice());
                    boughtItems.add(FrutaUnit);
                    valorCompra(FrutaUnit);
                    break;
                case 2:
                    FrutaPesoImpl FrutaWeight = new FrutaPesoImpl(fruitName(), fruitWeight(), fruitPrice());
                    boughtItems.add(FrutaWeight);
                    valorCompra(FrutaWeight);
                    break;
                case 3:
                    FrutaVolumeImpl FrutaVolume = new FrutaVolumeImpl(fruitName(), fruitVolume(), fruitPrice());
                    boughtItems.add(FrutaVolume);
                    valorCompra(FrutaVolume);
                    break;
                case 4:
                    if (boughtItems.size() > 0) {
                        for (FrutaImpl fruit : boughtItems) {
                            cabaz.addFruta(fruit);
                        }
                        boughtItems.clear();
                        System.out.println("A fruta adquirida foi adicionada com êxito ao cabaz");
                    } else {
                        System.out.println("ERRO: não adquiriu nenhuma fruta!");
                    }
                    break;
                case 5:
                    double amount = 0.0;
                    if (boughtItems.size() > 0) {
                        for (FrutaImpl fruit : boughtItems) {
                            amount += fruit.valorPago();
                        }
                        System.out.println("O valor a pagar é de: " + amount + '€');
                    } else {
                        System.out.println("ERRO: não adquiriu nenhuma fruta!");
                    }
                    break;
                case 6:
                    System.out.println(cabaz.totalPrice());
                    break;
                case 7:
                    System.out.println(cabaz.priceByFruit());
                case 8:
                    cabaz.listCabaz();
                default:
                    System.out.println("ERRO: a opção inserida não é válida!");
            }
        }
        while (choice != 0);
    }
}