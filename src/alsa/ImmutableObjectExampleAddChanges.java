package alsa;

import alsa.entity.ImmutableNotebook;
import alsa.entity.NotebookCategory;

public class ImmutableObjectExampleAddChanges {

    public static void printNotebook(ImmutableNotebook notebook) {
        ImmutableNotebook notebookCopy = new ImmutableNotebook(notebook.getName() + " +",notebook.getPrice(),notebook.getCategory());

        System.out.printf("%s %d %s\n", notebookCopy.getName(), notebookCopy.getPrice(), notebookCopy.getCategory());
    }


   public static void main (String[] args) {
       ImmutableNotebook lenovo = new ImmutableNotebook("Lenovo 12",30_000,NotebookCategory.PROFESSIONAL);

       printNotebook(lenovo);
       printNotebook(lenovo);
    }
}
