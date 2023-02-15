# Série 1

## Exercice 1
1- Ecrire une fonction qui demande à l’utilisateur de saisir un nombre entier et de lui afficher que le nombre est pair ou impair selon la valeur tapée.

2- Ecrire une fonction qui demande à l'utilisateur de saisir un nombre entier et qui affiche la somme des nombres entiers impairs qui lui sont inférieurs.

3- Construire une fonction permettant d’afficher les infos concernant les intervalles de vie d’une personne. Cette fonction ne prend pas de paramètre mais demande à l’utilisateur d’entrer son âge puis d’afficher dont quelle catégorie d’âge il se trouve:

    - enfance si age < 15
    - adolescence si 15 ≤ age < 25
    - maturité si 25 ≤ age < 50
    - vieillesse sinon

## Exercice 2
1- Donner une fonction qui permet de retourner le nombre de caractères constituant la chaine mot donné comme paramètre à la fonction et de les afficher en les séparant par la chaine :: tout en gérant les problèmes qui peuvent survenir.

2- Donner une fonction qui permet de retourner une partie de la chaine mot, a partir d’une position et se terminant a une position fixe, attention aux arguments de la fonction

3- Donner une fonction qui permet de retourner la forme minuscule de la chaine mot

4- Donner une fonction qui permet de retourner la forme majuscule de la chaine mot

5- Une fonction qui permet de concaténer la chaine mot et un deuxième objet de type string. Cette fonction retourne un nouvel objet.

6- Tester ses fonctions dans la fonction main ( ), en demandant la saisie d’une chaine de caractère et de la stocker dans un objet référencié par mot ;

## Exercice 3

Utiliser la classe StringBuffer ou StringBuilder pour écrire la fonction suivante:

    public String getChaineDesNombresDe1aN(String n){...}


Exemple d’affichage pour le teste de la fonction:

    System.out.println(getChaineDesNombresDe1aN("5"));
        affiche : 12345.
    System.out.println(getChaineDesNombresDe1aN("A"));
        affiche : Nombre invalide.

## Exercice 4

1- Écrire une fonction à qui on donne une chaîne de caractères, et on lui demande de construire une nouvelle chaîne contenant les mêmes caractères en ordre inverse. On peut écrire le programme à l'aide d'objets de la classe String ;

2- Donner une autre version avec un StringBuffer.

## Exercice 5

1- Écrire une fonction : void echanger ( StringBuilder chaine_1, StringBuilder chaine_2) qui échange les valeurs de deux chaînes de caractères passées en argument.

2- Pour traduire en Javanais, il suffit d'ajouter les lettres 'av' devant toute voyelle non précédée d'une voyelle « avant elle on n’a pas de voyelle ». Il faudra écrire une méthode estVoyelle( ) qui retourne un booléen true si on lui passe une voyelle, false sinon. Écrire une fonction qui permet de traduire une chaine de caractère, donnée comme paramètre, en
Javanais.

## Exercice 6
Le but de cet exercice est l’écriture d’un programme qui permet à l’utilisateur de deviner un nombre entier choisi au hasard par l’ordinateur. Les instructions qui permettent le tirage aléatoire d’un entier appartenant à l’intervalle [0, n [ sont dans le package « java.util ». Ces instructions sont les suivantes :

	Random objRan = new Random( ) ;
	int valAleatoire = objRan.nextInt(n) ;

Écrire une méthode qui permet :
- Le tirage aléatoire d’un entier appartenant à l’intervalle [0, n [, sachant que n est déjà donnée.

- Permet à l’utilisateur de faire des propositions pour deviner ce nombre; à chaque proposition le joueur sera informé que le nombre qu’il a donné est « trop grand » ou « trop petit ».

- À la fin du jeu, si le joueur trouve le nombre mystérieux, le nombre d’essais nécessaires est affiché.

- Le nombre max d’essais autorisés est 10 propositions. Dans le cas où le joueur ne découvre pas le nombre mystérieux au bout des 10 essais, la solution lui sera donnée