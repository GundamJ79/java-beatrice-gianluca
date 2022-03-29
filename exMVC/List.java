package exMVC;

import java.util.ArrayList;
import java.util.List;
public class List {
    private java.util.List<String> prodotti;

    public Lista() {
        prodotti = new ArrayList<>();
    }

    public java.util.List<String> getProdotti() {
        return prodotti;
    }

    public boolean addProdotto(String nome){
        if (prodotti.contains(nome))
            return false;
        else{
            prodotti.add(nome);
            return true;
        }
    }

    public boolean removeProdotto(String nome){
        if (prodotti.contains(nome)){
            prodotti.remove(nome);
            return true;
        }else{
            return false;
        }
    }
}
