//AlhassaneDialloDBE

import java.awt.Point;

public class Robot {
    private String nom;
    private Point position;
    private int vitesse;
    private int niveau; // Niveau de combustible
    
    
    // Constructeur par defaut 
    public Robot(String nom) {
        this.nom ="monRobot";
        this.position = new Point(0, 0);
        this.vitesse = 0;
        this.niveau = 100; // Initialise le niveau de combustible à 100
    }

    // Constructeur prenant le nom, la position initiale et la vitesse du robot
    public Robot(String nom, int x, int y, int vitesse) {
        this.nom = nom;
        this.position = new Point(x, y);
        this.vitesse = vitesse;
        this.niveau = 100; // Initialise le niveau de combustible à 100
    }

    // Méthode pour déplacer le robot vers l'est de sa vitesse
    public void allerALEst() {
        position.translate(vitesse, 0);
        niveau--; // Décrémente le niveau de combustible après chaque déplacement
    }

    // Méthodes pour déplacer le robot dans différentes directions (ouest, nord, sud)
    // Les autres méthodes sont similaires à allerALEst() mais pour différentes directions

    public void allerALOuest() {
        position.translate(-vitesse, 0);
        niveau--;
    }

    public void allerAuNord() {
        position.translate(0, vitesse);
        niveau--;
    }

    public void allerAuSud() {
        position.translate(0, -vitesse);
        niveau--;
    }

    // Méthode pour accélérer le robot (vitesse max limitée à 10)
    public void accelerer() {
        if (vitesse < 10) {
            vitesse++;
        }
    }

    // Méthode pour décélérer le robot (vitesse min limitée à 0)
    public void decelerer() {
        if (vitesse > 0) {
            vitesse--;
        }
    }

    // Méthode pour arrêter le robot et afficher sa position
    public void stop() {
        vitesse = 0;
        System.out.println("Le robot " + nom + " est à la position : " + position);
    }

    // Méthode pour récupérer la position courante du robot
    public Point getPosition() {
        return position;
    }

    // Méthode pour afficher le nom et la position du robot
    public void sePresenter() {
        System.out.println("Je suis " + nom + " et je suis à la position : " + position);
    }

    // Méthode pour récupérer le niveau de combustible
    public int getNiveau() {
        return niveau;
    }

    // Méthode pour refaire le plein de carburant
    public void setNiveau(int n) {
        if (niveau + n <= 100) {
            niveau += n;
        } else {
            niveau = 100;
        }
    }

    // Méthode pour effectuer un mouvement aléatoire en utilisant le niveau de combustible
    public void sePromener() {
        while (niveau > 0) {
            double random = Math.random();
            

            // Sélection d'une direction aléatoire en fonction du résultat de Math.random()
            switch ((int) (random * 4)) {
                case 0:
                    allerALEst();
                    break;
                case 1:
                    allerALOuest();
                    break;
                case 2:
                    allerAuNord();
                    break;
                case 3:
                    allerAuSud();
                    break;
            }
        }
    }
}

