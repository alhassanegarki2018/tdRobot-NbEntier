//AlhassaneDialloDBE

public class SimulRobot {
    public static void main(String[] args) {
        // Création d'un robot avec nom "Robot1", position initiale (0,0), et vitesse 2
        Robot robot1 = new Robot("Robot 2.0");
        robot1.sePresenter();
        robot1.accelerer();
        robot1.accelerer();
        robot1.accelerer();  

        // Affichage de la position initiale du robot
        robot1.sePresenter();

        // Faire se promener le robot tant qu'il lui reste du combustible
        robot1.sePromener();

        // Affichage de la position finale du robot après la promenade
        robot1.stop();
    }
}

