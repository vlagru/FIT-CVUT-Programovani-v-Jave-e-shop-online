package alsa.entity;

public class Notebook {

    private String name;
    private int price;
    private NotebookCategory category; //enum ro vycet prvku

    //konstruktor, s velkym pocatecnim pismenem podle tridy, jmeno musi byt stejne

    public Notebook(String name, int price, NotebookCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
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

    public void setName(String name) {
        this.name = name;
    }

    public NotebookCategory getCategory() {
        return category;
    }

    public void setCategory(NotebookCategory category) {
        this.category = category;
    }
}
