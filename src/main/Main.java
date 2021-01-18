package main;

public class Main {

    public static void main(String[] args) throws Exception {

        //-----------------Initialisation--------------------------------//
        int grillX =10; int grillY =10; // Dimension de la grille
        Aspirateur aspirateur = new Aspirateur(5,5,'N'); // Position initiale de l’aspirateur
        String directionSequence ="DADADADAA"; // Instructions
        //--------------------------------------------------------------//

        System.out.println("La grill avant le parcours d'instructions");
        System.out.println("aspirateur = " + aspirateur);
        printGrillWithPosition(grillX,grillY,aspirateur); // afficher la matrice avant le parcours d'instruction
        System.out.println("");
        System.out.println("La grill apres le parcours d'instructions "+directionSequence);
        aspirateur = aspirateurTravel(directionSequence, aspirateur,grillX,grillY); // appliquer les instruction sur l'aspirateur
    }

    // la finction qui applique les instructions sur l'objet aspirateur
    public static Aspirateur aspirateurTravel(String s, Aspirateur aspirateur, int grillX ,int grillY) throws Exception {

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == 'A'){
                moveAspirateur(aspirateur, grillX,grillY);  // si on trouve instruction A, on fait avancer l'aspirateur.
            }else{
                // Sinon change la direction en suivant l'instruction.
                aspirateur.setD(changeDirection(s.charAt(i), aspirateur.getD()));
            }
        }
        printGrillWithPosition(grillX,grillY,aspirateur);
        System.out.println("Aspirateur position = " + aspirateur);

        return aspirateur;
    }

    // fonction d'affichage de la grill
    public static void printGrillWithPosition(int grillX,int grillY, Aspirateur aspirateur){
        for (int i = grillY; i >= 0; i--) {
            for (int j = 0; j <= grillX; j++) {

                if (j ==0){
                    System.out.print(i + " ");
                }else {
                    if (i == 0){
                        System.out.print(j + " ");

                    }else {
                        if (j == aspirateur.getX()  && i == aspirateur.getY())
                            System.out.print("*" + " ");
                        else
                            System.out.print("." + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    // fonction de changement de la dériction de l'aspirateur en suivant les instructions.
    public static char changeDirection(char directionSequence, char elementDirection){
        if (elementDirection == 'N'){
            if (directionSequence == 'D') return 'E';
            if (directionSequence == 'G') return 'W';
        }
        if (elementDirection == 'S'){
            if (directionSequence == 'D') return 'W';
            if (directionSequence == 'G') return 'E';
        }
        if (elementDirection == 'E'){
            if (directionSequence == 'D') return 'S';
            if (directionSequence == 'G') return 'N';
        }
        if (elementDirection == 'W'){
            if (directionSequence == 'D') return 'N';
            if (directionSequence == 'G') return 'S';
        }
        return elementDirection;
    }


    // fonction qui fait avancer l'aspirateur.
    public static void moveAspirateur(Aspirateur aspirateur,int grillX ,int grillY) throws Exception {
        if (aspirateur.getD() == 'S'){ aspirateur.setY(aspirateur.getY()-1); }
        if (aspirateur.getD() == 'N'){ aspirateur.setY(aspirateur.getY()+1); }
        if (aspirateur.getD() == 'E'){ aspirateur.setX(aspirateur.getX()+1); }
        if (aspirateur.getD() == 'W'){ aspirateur.setX(aspirateur.getX()-1); }
        if (aspirateur.getX() > grillX || aspirateur.getX() < 0) throw new Exception("La position de l'aspirateur à dépasser la dimension de le grill");
        if (aspirateur.getY() > grillY || aspirateur.getY() < 0) throw new Exception("La position de l'aspirateur à dépasser la dimension de le grill");
    }
}
