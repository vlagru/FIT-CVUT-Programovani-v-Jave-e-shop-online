package alsa.entity;

import alsa.entity.part.ComputerPart;

public class Notebook extends Product { // extends : dedi z rodice

    private final NotebookCategory category;
    private final ComputerPart[] computerParts;

    public Notebook(String name, double price, int count, NotebookCategory category, ComputerPart[] computerParts) {
        super(name, price, count); // super : odkaz na rodice
        this.category = category; // pridam si category do konstruktory predka Product
        this.computerParts = computerParts;
    }

    public NotebookCategory getCategory() {
        return category;
    }

    public ComputerPart[] getComputerParts() {
        return computerParts;
    }

//    //abych udelal immutable, pouziju klicove slovo final + ((primitivni) datovy typ - tam se jen prirazuje)/objekty musi byt 'prone to', aby byl immutable
//    //--- coz vsechny tyto tri typy jsou
//    private final String name;
//    private final double price;
//    private final NotebookCategory category; //enum ro vycet prvku
//
//    //konstruktor, s velkym pocatecnim pismenem podle tridy, jmeno musi byt stejne
//
//    public Notebook(String name, int price, NotebookCategory category) {
//        this.name = name;
//        this.price = price;
//        this.category = category;
//    }
//
//    //getter a setter pro atribut name a price
//
//    //aby byl objekt plne immutable, musim samozrejme smayat settery
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice () {
//        return price;
//    }
//
//    public NotebookCategory getCategory() {
//        return category;
//    }

}
