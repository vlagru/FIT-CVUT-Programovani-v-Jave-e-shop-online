package alsa;

import alsa.entity.ImmutableNotebook;
import alsa.entity.MutableNotebook;
import alsa.entity.NotebookCategory;

public class ImmutableObjectExample {

    //promenou 'notebook' typu Notebook prvne vytvorim v parametrech nove metody, az pote pouzivam
    private static void printNotebook(ImmutableNotebook notebook) { //prejmenuji na immutable, importy
        // smazu settery
        // vystupem je nemenny objekt, 'black box'
        System.out.printf("%s %d + %s\n", notebook.getName(), notebook.getPrice(), notebook.getCategory());
    }

    public static void main(String[] args) {

        ImmutableNotebook lenovo = new ImmutableNotebook("Lenovo Yoga", 10_000, NotebookCategory.BASIC);
//        Notebook dell = new Notebook("Dell",25_000, NotebookCategory.PROFESSIONAL);

//        for (int i = 0; i < notebooks.length ; i++) {
//            System.out.printf("%s %d %s\n", notebooks[i].getName(), notebooks[i].getPrice(), notebooks[i].getCategory().toString());
//        }

        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
        printNotebook(lenovo);
//        printNotebook(dell);
    }
}
