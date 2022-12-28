import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl produits = new MetierProduitImpl();
        Scanner s=new Scanner(System.in);
        Scanner idScanner= new Scanner(System.in);
        int pid;
        int i=1;
         while (i>=1 && i<5){
             System.out.println("entrer votre choix ");
              i=Integer.parseInt(s.next());
             switch (i){
                 case 1 :
                     System.out.println(produits.getAll().toString());
                     break;
                 case 2 :
                     System.out.println("entrer l Id du produit");
                     pid = idScanner.nextInt();
                     System.out.println(produits.findById(pid));
                     break;
                 case 3 :
                     System.out.println("Ajouter un nouveau produit");
                     Produit p = new Produit();

                     System.out.print("produit id: ");
                     Scanner idSc= new Scanner(System.in);
                     p.setId(idSc.nextInt());

                     System.out.print("produit Nom: ");
                     Scanner nomSc= new Scanner(System.in);
                     p.setNom(nomSc.next());

                     System.out.print("produit Marque: ");
                     Scanner marqueSc= new Scanner(System.in);
                     p.setMarque(marqueSc.next());

                     System.out.print("produit Description:");
                     Scanner descSc= new Scanner(System.in);
                     p.setNom(descSc.next());

                     System.out.print("Produit Prix:");
                     Scanner prixSc= new Scanner(System.in);
                     p.setPrix(prixSc.nextInt());

                     System.out.print("Stock:");
                     Scanner nbStockSc= new Scanner(System.in);
                     p.setNbrStock(nbStockSc.nextInt());

                     produits.add(p);
                     break;
                 case 4 :
                     System.out.println("delete a product by Id:");
                     Scanner rIdSc = new Scanner(System.in);

                     produits.delete(rIdSc.nextInt());
                     break;
                 default:
                     System.out.println("good by");
                     i=5;
                     break;
             }

         }
    }
}
