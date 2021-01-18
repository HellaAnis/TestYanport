#Test Technique.

-> Vous trouverez tout le scénario dans la partie main où on doit mettre les valeurs d'initialisation 


Exemple :

Donc voici l'initialisation du test1 :

     //-----------------Initialisation--------------------------------//
        int grillX =10; int grillY =10; // Dimension de la grille
        Aspirateur aspirateur = new Aspirateur(5,5,'N'); // Position initiale de l’aspirateur
        String directionSequence ="DADADADAA"; // Instructions
    //--------------------------------------------------------------//
    
et on va avoir un résultat d'une matrice qui nous affiche la nouvelle position de l'aspirateur :

La grill apres le parcours d'instructions DADADADAA
//
10 . . . . . . . . . . 
9 . . . . . . . . . . 
8 . . . . . . . . . . 
7 . . . . . . . . . . 
6 . . . . * . . . . . 
5 . . . . . . . . . . 
4 . . . . . . . . . . 
3 . . . . . . . . . . 
2 . . . . . . . . . . 
1 . . . . . . . . . . 
0 1 2 3 4 5 6 7 8 9 10
//

Aspirateur position = Aspirateur{x=5, y=6, direction=N}
    
-> Un test unitaire pour fait pour tester d'autre cas.
