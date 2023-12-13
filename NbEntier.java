//AlhassaneDialloDBE

public class NbEntier {
    private int val; // Attribut privé représentant la valeur entière

    // Constructeur par défaut initialisant l'objet NbEntier avec la valeur 0
    public NbEntier() {
        this.val = 0;
    }

    // Constructeur initialisant l'objet NbEntier avec une valeur spécifiée
    public NbEntier(int val) {
        this.val = val;
    }

    // Méthode pour définir une nouvelle valeur et retourner l'ancienne valeur
    public int setValue(int newVal) {
        int oldVal = this.val; // Stocke l'ancienne valeur
        this.val = newVal;     // Définit la nouvelle valeur
        return oldVal;         // Retourne l'ancienne valeur
    }

    // Méthode pour récupérer la valeur actuelle de l'objet NbEntier
    public int getValue() {
        return this.val;
    }

    // Méthode toString pour obtenir une représentation sous forme de chaîne de caractères
    public String toString() {
        return " (" + this.val + ") "; // Retourne une chaîne représentant la valeur
    }
}


/*L'objectif principal de cet exercice est de comprendre et d'illustrer les concepts d'encapsulation en Java, où l'accès aux attributs est contrôlé par des méthodes d'accès (set et get), et l'utilisation de la méthode toString() pour obtenir une représentation sous forme de chaîne de caractères d'un objet. L'encapsulation permet de cacher les détails d'implémentation et de contrôler l'accès aux attributs, renforçant ainsi la sécurité et la cohérence du programme.*/
