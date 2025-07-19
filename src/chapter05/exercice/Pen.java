package chapter05.exercice;

public class Pen {

    String name;
    String color;
    String company;

    double price;
    double stock;
    double weight;

    public void displayInformation() {

        System.out.println("Nom : " + this.name + " | Couleur : " + this.color +
                " | Prix : " + this.price + " | Quantité : " + this.stock
                + " | Fabricant : " + this.company + " | Poids : " + this.weight + "g");

    }

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.name = "stylo";
        pen1.color = "Bleu";
        pen1.company = "BIC";
        pen1.price = 2.50;
        pen1.stock = 10;
        pen1.weight = 15;

        pen1.displayInformation();


    }

}
