package chapter05.exercice;

public class LibrairyBook {

    String isbn;
    String title;
    String author;
    String yearOfPublication;

    boolean isAvailable;


    public String getBookInfo(){
       return "ISBN : " + this.isbn + " | Titre : " + this.title + " | Auteur : " + this.author
               + " | Année de publication : " + this.yearOfPublication;
    }

    public void displayAvailability() {
        if (this.isAvailable) {
            System.out.println(this.getBookInfo() + " | Disponibilité : en stock.");
        } else {
            System.out.println(this.getBookInfo() + " | Disponibilité : n'est plus disponible.");
        }
    }

    public boolean makeReservation() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("La réservation est effectuée.");
            return true;
        } else {
            System.out.println("La réservation a échoué : livre non disponible.");
            return false;
        }
    }

    public static void main(String[] args) {

        LibrairyBook book1 = new LibrairyBook();

        book1.isbn = "ISBN-1";
        book1.title = "Les mains du miracle";
        book1.author = "Joseph KESSEL";
        book1.yearOfPublication = "1960";
        book1.isAvailable = true;

        book1.makeReservation();
        book1.displayAvailability();




    }

}
