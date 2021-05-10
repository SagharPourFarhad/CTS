package ro.ase.cts.singletone;

public class AsigurareMedicala {

    private int id;
    private String numeAsigurati;
    private float contributie;

    private static AsigurareMedicala asigurareMedicala= new AsigurareMedicala(1, "Rares", 200.5f);


    private AsigurareMedicala(int id, String numeAsigurati, float contributie) {
        this.id = id;
        this.numeAsigurati = numeAsigurati;
        this.contributie = contributie;
    }

    public static AsigurareMedicala getInstance(){
        return asigurareMedicala;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeAsigurati(String numeAsigurati) {
        this.numeAsigurati = numeAsigurati;
    }

    public void setContributie(float contributie) {
        this.contributie = contributie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AsigurareMedicala{");
        sb.append("id=").append(id);
        sb.append(", numeAsigurati='").append(numeAsigurati).append('\'');
        sb.append(", contributie=").append(contributie);
        sb.append('}');
        return sb.toString();
    }



}
