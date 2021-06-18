import java.util.Scanner;
class Main{

    private static Scanner clavier=new Scanner(System.in);

    public static void main(String[] args){
        int choix;
        Service s=new Service();
        do {
            choix=menu();
            switch(choix){
               case 1:
                    System.out.println("Ajouter une classe : ");
                    System.out.println("Entrez le libelle de la classe à ajouter : ");
                    String libelle=clavier.nextLine();
                    Classe cl=new Classe();
                    cl.setLibelle(libelle);
                    s.ajouterClasse(cl);

                break;

               case 2:
                    s.listerClasse();

               break;

               case 3:
                    System.out.println("Ajouter un étudiant : ");
                    System.out.println("Entrez le nom de l'étudiant à ajouter : ");
                    String nomComplet=clavier.nextLine();
                    System.out.println("Entrez le tuteur de l'étudiant à ajouter : ");
                    String tuteur=clavier.nextLine();

                    Etudiant et = new Etudiant(nomComplet, tuteur);
                    s.ajouterEtudiant(et);

                break;
                case 4:
                    s.listerPersonne();

               break;

                case 5:
                    System.out.println("Ajouter un enseignant : ");
                    System.out.println("Entrez le nom de l'enseignant à ajouter : ");
                    nomComplet=clavier.nextLine();
                    System.out.println("Entrez le grade de l'enseignant à ajouter : ");
                    String grade=clavier.nextLine();

                    Enseignant ens = new Enseignant(nomComplet, grade);
                    s.ajouterEnseignant(ens);

                break;
                case 6:
                    s.listerPersonne();

               break;


            }
        }
        while(choix!=7);
    }

    public static int menu(){
        System.out.println("Veuillez faire un choix : "
                            +"\n1- Ajouter classe"
                            +"\n2- Lister classe"
                            +"\n3- Ajouter Enseignant"
                            +"\n4- Lister Enseignant"
                            +"\n5- Ajouter Etudiant"
                            +"\n6- Lister Etudiant"
                            +"\n7- Quitter!");
    }

    String choix;
    choix=scanner.nextLine();
    return Integer.parseInt(choix);
        
}
