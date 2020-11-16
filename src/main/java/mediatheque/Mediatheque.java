package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private List<Item> items = new LinkedList<Item>();
        
	public static void main(String[] args) {
		Mediatheque mediatheque = new Mediatheque();
		
		mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
		mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
		mediatheque.addItem( new CD(12, "Sergeant Peppers"));
		mediatheque.printCatalog();
		mediatheque.printOnlyBooks();
		mediatheque.printOnlyCDs();		
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			System.out.println(i);      
	}
	
	VisitorBook vbook = new VisitorBook();
	public void printOnlyBooks() {
            //throw new UnsupportedOperationException("Unsupported.");
            items.forEach((i) -> {
                i.accept(vbook);
            }); /*
            //avec instanceof
            for (Item i : items)
            if (i instanceof Book)
            System.out.println(i);
             */
	}
        VisitorCD vcd = new VisitorCD();
	public void printOnlyCDs() {
		items.forEach((i) -> {
                i.accept(vcd);
            }); 
	}

}
