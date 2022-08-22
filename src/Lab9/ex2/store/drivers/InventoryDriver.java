package Lab9.ex2.store.drivers;

import java.util.Date;

import Lab9.ex2.store.Artist;
import Lab9.ex2.store.Book;
import Lab9.ex2.store.CD;
import Lab9.ex2.store.ClassicalCD;
import Lab9.ex2.store.Inventory;
import Lab9.ex2.store.Item;

public class InventoryDriver {
    public static void main(String[] args) {
        Item[] myInventory = new Item[50];

        //Books
        myInventory[0] = new Book("Clean Code", 100.00, 3, "Uncle Bob", "Pearson", "Development");
        myInventory[1] = new Book("Estrutura de dados", 900, 1, "Fulano", "PUC", "Development");
        myInventory[2] = new Book("Java orientada", 300, 4, "Bruno", "Sei lá", "Programação");
        myInventory[3] = new Book("Java SE", 300, 4, "Ciclano", "Casa do código", "Programação");
        myInventory[4] = new Book("Linguagem C", 200, 2, "Robert", "Alo alo", "Linguagens legado");
    
        //CDs
        Artist a1 = new Artist("Ed Sheeran");
        myInventory[5] = new CD("X", 39.99, 200, a1, new Date("04/08/2014"));

        //Classical CDs
        String[] perf = {"Bethoven", "Mozart"};
        myInventory[6] = new ClassicalCD("Bethoveen 6", 1000, 1, "Bethoveen", perf, "England", new Date("01/01/1600"));

        Inventory.produceReport(myInventory);

    }
}
