public class Service implements IEmploye{

    private int id;
    private String libelle;

    private static int nbreService;

    // Attribut de navigation
    //one---to---many : un service peut avoir plusieurs employés
    private Employe[] tabEmploye=new Employe[35];
    private int nbreEmploye;
    

    //Constructeur par défaut
    public Service(){
        nbreService++;
        id=nbreService;
    }


    public Service(String libelle){
        nbreService++;
        id=nbreService;
        setLibelle(libelle);
    }


    public int getId(){
        return id;
    }

    public String getLibelle(){
        return libelle;
    }
    public static int getNbreService(){
        return nbreService;
    }
    public Employe[] getTabEmploye(){
        return tabEmploye;
    }


    public void setId(int id){
        this.id=id;
    }
    public void setLibelle(String libelle){
        this.libelle=libelle;
    }
    public static void setNbreService(int nbreService){
        Service.nbreService=nbreService;
    }

    // le setter d'une relation one to many permet d'ajouter un element dans le tableau
    public void setTabEmploye(Employe employe){
        tabEmploye[nbreEmploye]=employe;
        nbreEmploye++;

        //Affecter un employé à un service
        employe.setService(this);

    }

    //Methode Métiers
    @Override
    public String affiche(){
        return "Id: "+id+"\n Libelle: "+libelle;
    }
    public void compare(){
        
    }
}
