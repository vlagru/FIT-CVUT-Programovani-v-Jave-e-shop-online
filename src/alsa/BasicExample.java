package alsa;

import alsa.entity.Notebook;
import alsa.entity.NotebookCategory;

public class BasicExample {

    public static void main(String[] args) {
        Notebook lenovo = new Notebook("Lenovo Yoga", 10_000, NotebookCategory.BASIC);
        Notebook dell = new Notebook("Dell Inspiron", 20_000, NotebookCategory.WORK);
        Notebook mcbook = new Notebook("McBook Air", 40_000, NotebookCategory.PROFESSIONAL);
        Notebook msi = new Notebook("MSI", 30_000, NotebookCategory.GAMING);

        Notebook[] notebooks = new Notebook[] {lenovo, dell, mcbook, msi};

        for (Notebook notebook : notebooks) {
            System.out.printf("%s %d %s\n", notebook.getName(), notebook.getPrice(), notebook.getCategory().toString());
        }

//        for (int i = 0; i < notebooks.length ; i++) {
//            System.out.printf("%s %d %s\n", notebooks[i].getName(), notebooks[i].getPrice(), notebooks[i].getCategory().toString());
//        }

    }
}
