public class UseCase{
    private final int TAILLE=35;
        private int nbreService;
        private Service[] tabService= new Service[TAILLE];
    
        private Employe[] tabEmploye= new Employe[TAILLE];
        private int nbreEmploye;
       
        //Créer Service
        public void ajouterService(Service s){
            if(nbreService<TAILLE){
                tabService[nbreService]=s;
                nbreService++;
            }else{
                System.out.println("Plus d'espace dans le tableau");
            }
        }
    
        //Lister services
        public void listerService(){
            for(Service serve:tabService){
                if(serve!=null)
                    System.out.println(serve.affiche());
            }
        }
    
        //Ajouter employé et l'affecter à un service
        public void ajouterEmploye(Employe e){
            if(nbreEmploye<TAILLE){
                tabEmploye[nbreEmploye]=e;
                nbreEmploye++;
            }else{
                System.out.println("Plus d'espace dans le tableau");
            }

            public Service affecterService(int id) {
                for (Service s : tabService) {
                    if (s == null) {
                        s.getId() = id;
                            return s;
                        }
                    }
                }
            }
        }
        public void afficherEmployeService(int id) {
            for (Service s : tabService) {
                if (s != null) {
                    if (s.getId() == id) {
                        for (Employe e : s.getTabEmploye()) {
                            if (e != null) {
                                System.out.println(e.afficher() + "\n  ");
                            }
                        }
                    }
                }
            }
        }

    }
}
