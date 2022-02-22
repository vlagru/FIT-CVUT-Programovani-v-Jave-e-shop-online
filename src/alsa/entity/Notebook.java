package alsa.entity;

public class Notebook {

    private String name;
    private int price;

    //konstruktor, s velkym pocatecnim pismenem podle tridy, jmeno musi byt stejne
    public Notebook(String name,int price) {
        this.name = name;
        this.price = price;
    }
}
