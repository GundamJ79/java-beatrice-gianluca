package exMVC;

import java.util.List;
public class ShoppingListController {
    private SpesaRepository spesaRepository;

    public ListaSpesaController(){
        spesaRepository = ArrayListSpesaRepository.getInstance();
    }

    public List<String> getNomiListe(){
        return spesaRepository.getListe();
    }

    public boolean aggiungiLista(String risposta) {
        return spesaRepository.addLista(risposta);
    }

    public boolean rimuoviLista(String risposta) {
        return spesaRepository.removeListaByNome(risposta);
    }

    public List<String> getElemByNome(String risposta) {
        return spesaRepository.findListaByNome(risposta);
    }

    public boolean addElemInLista(String lista, String elemento) {
        return spesaRepository.addElemToLista(lista,elemento);
    }

    public boolean removeElemToLista(String lista, String elemento) {
        return spesaRepository.removeElemToLista(lista, elemento);
    }
}
