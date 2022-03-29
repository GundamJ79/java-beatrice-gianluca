package exMVC;
import exMVC.ShoppingListController;
import java.util.List;
import  java.util.Scanner;


public class Main {
    private static ShoppingListController controller;

    public static void main(String[] args) {
        controller = new ShoppingListController();
        System.out.println("*** Welcome to the Shopping List Program***");
        boolean finish = false;
        Scanner keyboard = new Scanner(System.in);
        while(!finish){
            System.out.println("*** Which operation you want to do? ***\n" +
                    "1)\t Show lists names\n" +
                    "2)\t Add a list\n" +
                    "3)\t Remove a list\n" +
                    "4)\t Read a list content\n" +
                    "5)\t Add an item to a list\n" +
                    "6)\t Remove an item from a list\n"
            );
            String response = keyboard.nextLine();
            switch (response){
                case "1":
                    listName();
                    break;
                case "2":
                    addList(keyboard);
                    break;
                case "3":
                    delList(keyboard);
                    break;
                case "4":
                    showList(keyboard);
                    break;
                case "5":
                    addListIt(keyboard);
                    break;
                case "6":
                    delListIt(keyboard);
                default:
                    System.out.println("***OPERATION NOT ALLOWED, PLEASE CHOOSE ONE FROM THE LIST TYPING A NUMBER***");
            }
        }
    }

    private static void delListIt(Scanner keyboard) {
        System.out.println("Insert a list name:");
        String list = keyboard.nextLine();
        System.out.println("Insert item name:");
        String item = keyboard.nextLine();
        if (controller..addElemInLista(lista,elemento))
        System.out.println("OK");
        else
        System.out.println("Errore");
    }

    private static void leggiLista(Scanner tastiera) {
        System.out.println("Inserisci il nome della lista da leggere");
        String risposta = tastiera.nextLine();
        List<String> elementi = controller.getElemByNome(risposta);
        for (String elem: elementi) {
            System.out.println(elem);
        }
    }

    private static void cancellaLista(Scanner tastiera) {
        System.out.println("Inserisci il nome della lista da cancellare");
        String risposta = tastiera.nextLine();
        if (controller.rimuoviLista(risposta))
            System.out.println("OK");
        else
            System.out.println("Lista non esistente");
    }

    private static void aggiungiLista(Scanner tastiera) {
        System.out.println("Inserisci il nome della lista");
        String risposta = tastiera.nextLine();
        if (controller.aggiungiLista(risposta))
            System.out.println("OK");
        else
            System.out.println("Lista già esistente");

    }

    private static void nomiListe() {
        System.out.println("Liste: ");
        for (String nome : controller.getNomiListe()) {
            System.out.println(nome);
        }
        System.out.println("\n\n");
    })
    }



















}
