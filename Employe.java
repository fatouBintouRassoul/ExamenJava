public class Employe implements IEmploye{
    private int id;
    private String nomComplet;
    private String dateEmbauche;
    private final int FORMAT=35;

    private static int nbreEmploye;


    //many to one : Un employé ne peut être affecté qu'à un seul service
    private Service service;

    public Service getService(){
        return service;
    }
    public void setService(Service service){
        this.service=service;
    }

    public Employe(){
        nbreEmploye++;
        id=nbreEmploye;
    }

    public Employe(String nomComplet, String dateEmbauche){
        nbreEmploye++;
        id=nbreEmploye;
        setNomComplet(nomComplet);
        setDateEmbauche(dateEmbauche);
    }

    public int getId(){
        return id;
    }
    public String getNomComplet(){
        return nomComplet;
    }
    public String getDateEmbauche(){
        return dateEmbauche;
    }
    public static int getNbreEmploye(){
        return nbreEmploye;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet=nomComplet;
    }
    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche=dateEmbauche;
    }
    public static void setNbreEmploye(int nbreEmploye){
        Employe.nbreEmploye=nbreEmploye;
    }


    @Override
    public  String affiche(){
        return "Id: "+id+"\n Nom Complet: "+nomComplet+"\n Date d'embauche: "+dateEmbauche;
    }
    public void compare(){

    }

}
