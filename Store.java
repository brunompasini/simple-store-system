import java.util.ArrayList;
import java.util.Scanner;
import produto.*;

public class Store {
    ArrayList<Product> stock;
    ArrayList<Product> sold;
    

    public Store() {
        stock = new ArrayList<Product>();
    }

    public void addProduct(String name, double price, int quantity) {
        stock.add(new Product(name, price, quantity));
    }
    public void sellProduct() {
        this.prnt();
        System.out.println("Type index of product to sell:");
        Scanner sc1 = new Scanner(System.in);
        int prod = sc1.nextInt();
        System.out.println("And now the quantity:");
        int qtd = sc1.nextInt();
        if (qtd <= stock.get(prod).getQuantity()) {
            stock.get(prod).setQuantity(stock.get(prod).getQuantity()-qtd);
        } else {
            System.out.println("\nERROR: Can't sell more than what's in stock");
        }
    }

    public void prnt() {
        // prints all products
        for (int i=0; i<stock.size();i++){
            System.out.print(i+") ");
            System.out.println(stock.get(i));
        }
    }

    public static void main(String[] args) {
        Store loja = new Store();
        int opt = 1;
        Scanner nsc = new Scanner(System.in);
        while (opt != 0) {
            System.out.println("What do you want to do ?");
            System.out.println("Type 1 to add stuff in stock");
            System.out.println("Type 2 to sell");
            System.out.println("Type 0 to exit");
            opt = nsc.nextInt();
            if (opt==1) {
                System.out.print("Name of product: ");
                String nm = nsc.next();
                nsc.nextLine();
                System.out.print("Price: ");
                String sprc = nsc.nextLine();
                double prc = Double.parseDouble(sprc);
                System.out.print("And quantity: ");
                int qntd = nsc.nextInt();
                loja.addProduct(nm, prc, qntd);
                loja.prnt();
                //nsc.close();
            } else if (opt == 2) {
                loja.sellProduct();
            } else if (opt!=0){
                System.out.println("Not a valid option");
            }
            System.out.println();
        }
        nsc.close();

    }


}