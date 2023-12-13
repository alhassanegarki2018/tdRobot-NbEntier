//AlhassaneDialloDBE

public class Permutation {

    // Méthode statique pour permuter les valeurs de deux objets NbEntier
    public static void permute(NbEntier a, NbEntier b) {
        int temp = a.getValue();  // Stocke la valeur de l'objet 'a'
        a.setValue(b.getValue()); // Donne à 'a' la valeur de 'b'
        b.setValue(temp);         // Donne à 'b' la valeur temporairement stockée
    }

    public static void main(String[] args) {
        // Création de deux instances de NbEntier avec des valeurs différentes
        NbEntier n1 = new NbEntier(5);
        NbEntier n2 = new NbEntier(10);

        System.out.println("Avant permutation :");
        System.out.println("NbEntier 1 contient : " + n1); // Affiche la valeur de n1
        System.out.println("NbEntier 2 contient : " + n2); // Affiche la valeur de n2

        permute(n1, n2); // Appel de la méthode pour permuter les valeurs des objets

        System.out.println("\nAprès permutation :");
        System.out.println("NbEntier 1 contient : " + n1); // Affiche la valeur de n1 après permutation
        System.out.println("NbEntier 2 contient : " + n2); // Affiche la valeur de n2 après permutation
    }
}

