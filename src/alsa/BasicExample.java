package alsa;

import alsa.entity.MutableNotebook;
import alsa.entity.NotebookCategory;

public class BasicExample {

    public static void main(String[] args) {
        MutableNotebook lenovo = new MutableNotebook("Lenovo Yoga", 10_000, NotebookCategory.BASIC);
        MutableNotebook dell = new MutableNotebook("Dell Inspiron", 20_000, NotebookCategory.WORK);
        MutableNotebook mcbook = new MutableNotebook("McBook Air", 40_000, NotebookCategory.PROFESSIONAL);
        MutableNotebook msi = new MutableNotebook("MSI", 30_000, NotebookCategory.GAMING);

        MutableNotebook[] notebooks = new MutableNotebook[] {lenovo, dell, mcbook, msi};

        for (MutableNotebook notebook : notebooks) {
            System.out.printf("%s %d %s\n", notebook.getName(), notebook.getPrice(), notebook.getCategory().toString());
        }

//        for (int i = 0; i < notebooks.length ; i++) {
//            System.out.printf("%s %d %s\n", notebooks[i].getName(), notebooks[i].getPrice(), notebooks[i].getCategory().toString());
//        }

    }
}
