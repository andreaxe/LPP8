import java.util.ArrayList;
import java.util.Scanner;

public class HelperMenu {

    public static void menu(){

        System.out.println("\n");
        System.out.println("MENU");
        System.out.println("=============================");
        System.out.println("1: Comprar fruta à unidade");
        System.out.println("2: Comprar fruta ao peso");
        System.out.println("3: Comprar fruta ao volume");
        System.out.println("4: Adicionar a fruta adquirida para o cesto");
        System.out.println("5: Calcular o preço da fruta no cesto");
        System.out.println("6: Calcular o preço da fruta por item do cesto");
        System.out.println("=============================");
        System.out.println("0: Sair");

        System.out.println("\n");
        System.out.println("Seleccione uma opção:");
    }

    public static void compras(ArrayList<IFruta> boughtItems){

        System.out.println("Lista de compras");
        System.out.println("=============================");

        if (boughtItems.size() > 0) {
            for (IFruta fruit : boughtItems) {
                System.out.println(fruit);
            }
        } else {
            System.out.println("As suas compras encontram-se vazias...");
        }

    }
    public static void cesto(Cabaz cabaz){
        cabaz.listCabaz();
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

    public static double fruitWeight(){
        System.out.println("Indique o peso:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static int fruitVolume(){
        System.out.println("Indique o número de caixas:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
