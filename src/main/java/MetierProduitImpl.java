import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> produits = new ArrayList<>();

    @Override
    public void add(Produit o) {
        this.produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return this.produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit p: produits) {
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        for (Produit p: produits) {
            if(p.getId()==id){
                produits.remove(p);
            }
        }
    }
    
}
