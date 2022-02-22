package alsa.entity;

public class Notebook {

    private String name;
    private int price;

    //konstruktor, s velkym pocatecnim pismenem podle tridy, jmeno musi byt stejne
    public Notebook(String name,int price) {
        this.name = name;
        this.price = price;
    }

    //getter a setter pro atribut name a price

    public String getName() {
        return name;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
