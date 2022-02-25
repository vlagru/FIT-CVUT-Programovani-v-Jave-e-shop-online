package alsa.entity;

public class ImmutableNotebook {

    //abych udelal immutable, pouziju klicove slovo final + ((primitivni) datovy typ - tam se jen prirazuje)/objekty musi byt 'prone to', aby byl immutable
    //--- coz vsechny tyto tri typy jsou
    private final String name;
    private final int price;
    private final NotebookCategory category; //enum ro vycet prvku

    //konstruktor, s velkym pocatecnim pismenem podle tridy, jmeno musi byt stejne

    public ImmutableNotebook(String name, int price, NotebookCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //getter a setter pro atribut name a price

    //aby byl objekt plne immutable, musim samozrejme smayat settery
    public String getName() {
        return name;
    }

    public int getPrice () {
        return price;
    }

    public NotebookCategory getCategory() {
        return category;
    }

}
