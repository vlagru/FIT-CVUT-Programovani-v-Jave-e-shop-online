package alsa;

import alsa.entity.Notebook;

import static alsa.entity.NotebookCategory.*;

public class BasicExample {

    public static void main(String[] args) {
        Notebook lenovo = new Notebook("Lenovo Yoga", 10_000, BASIC, category);
        Notebook dell = new Notebook("Dell Inspiron", 20_000, WORK, category);
        Notebook mcbook = new Notebook("McBook Air", 40_000, PROFESSIONAL, category);
        Notebook msi = new Notebook("MSI", 30_000, GAMING, category);

        Notebook[] notebooks = new Notebook[] {lenovo, dell, mcbook, msi};

        for (Notebook notebook : notebooks) {
            System.out.printf("%s %f %s\n", notebook.getName(), notebook.getPrice(), notebook.getCategory().toString());
        }

//        for (int i = 0; i < notebooks.length ; i++) {
//            System.out.printf("%s %d %s\n", notebooks[i].getName(), notebooks[i].getPrice(), notebooks[i].getCategory().toString());
//        }

    }
}
