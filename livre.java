public class livre{
    private static int id=0;
    private String titre;
    private String auteur;
    private double prix;

    public livre(String titre,String auteur,double prix){
        id ++;
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }
    public int getId(){
        return id;
    }
    public  void setId(int id){
        this.id=id;
    }
    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre=titre;
    }

    public String getAuteur(){
        return auteur;
    }
    public void setAuteur(String auteur){
        this.auteur=auteur;
    }

    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix){
        this.prix=prix;
}
public static void main (String [] args){
    livre l1=new livre(1287,alf lila lila ,nour,257);
    livre l2=new livre(1285,boukala ,jaheth,897);
    l1.toOString();
    l2.toOString();
    System.out.println("auteur est"+l1.getAuteur());
    l1.setAuteur("monji");
    System.out.println(" le nouveau auteur est"+l1.getAuteur());
}
public void toOString(){
    System.out.println(id+"/"+auteur+"/"+titre+"/"+prix);
}
}