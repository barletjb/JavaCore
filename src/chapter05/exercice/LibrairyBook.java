package chapter05.exercice;

public class LibrairyBook {

    String isbn;
    String title;
    String author;
    String yearOfPublication;

    boolean isAvailable;


    public String getBookInfo(String isbn){
       return "Titre : " + title + " | Auteur : " + author + " | Année de publication : " + yearOfPublication;
    }

    public void displayAvailability(String isbn) {

        if (isAvailable){
            System.out.println(getBookInfo(isbn) + "  : est disponible.");
            isAvailable = false;
        }
        else {
            System.out.println(getBookInfo(isbn) + " : n'est pas disponbile.");
        }

    }


    public static void main(String[] args) {

        LibrairyBook book1 = new LibrairyBook();

        book1.isbn = "ISBN-1";
        book1.title = "Les mains du miracle";
        book1.author = "Joseph KESSEL";
        book1.yearOfPublication = "1960";
        book1.isAvailable = true;

        book1.displayAvailability(book1.isbn);
        System.out.println(book1.isAvailable);

        book1.displayAvailability("ISBN-1");


    }

}
