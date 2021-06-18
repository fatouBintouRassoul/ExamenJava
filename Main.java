import java.util.Scanner;
public class Main{
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choix;
        UseCase uc=new UseCase();
        String choix;
        choix=scanner.nextLine();
        return Integer.parseInt(choix);
        do {
            choix=menu();
            switch (choix) {
                case 1:
                System.out.println("Veuillez entrer le libellé : ");
                String libelle=scanner.nextLine();
                Service serve=new Service();
                serve.setLibelle(libelle);
                uc.ajouterService(serve);
                    break;

                case 2:
                uc.listerService();
                    break;

                case 3:
                    System.out.println("Veuillez entrer le nom complet de l'employé : ");
                    String nomComplet=scanner.nextLine();
                    System.out.println("Veuillez entrer la date à laquelle l'employé a été embauché : ");
                    String dateEmbauche=scanner.nextLine();
                    Employe e=new Employe(nomComplet,dateEmbauche);
                    uc.ajouterEmploye(e);

                    System.out.println("Affecter l'employé à un service");
                    System.out.println("Veuillez saisir l'ID du Service");
                    System.out.println("Voici la liste des services\n ");
                    uc.listerService();

                    int idService = scanner.nextInt();
                    Service serve = uc.affecterService(idService);
                    Employe e = new Employe(nomComplet, dateEmbauche, serve);
                    serve.setTableEmploye(employe);
                    break;

                case 4:
                    System.out.println("Employés d'un Service\n");
                    System.out.println("Sélectionner l'id du service\n ");
                    uc.listerService();
                    int idService = scanner.nextInt();
                    uc.afficherEmployeService(idService);
                    break;
                    
                case 5:
                    System.out.println("Merci!");
                    break;
                   
                default:
                    System.out.println("Veuillez choisir une fonctionnalité existante");
                    break;
            }

        }
        while(choix!=5);
    }

        public static int menu(){
            System.out.println("1) Ajouter un service"
                                +"\n2) lister les services"
                                +"\n3) Ajouter un employé puis l'affecter à un service"
                                +"\n4) Afficher les employés d'un service"
                                +"\n5- Quitter");
            
        }
        
}
