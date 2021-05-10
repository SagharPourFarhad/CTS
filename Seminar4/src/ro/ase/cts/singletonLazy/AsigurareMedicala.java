package ro.ase.cts.singletonLazy;

public class AsigurareMedicala {

    private int id;
    private String numeAsigurati;
    private float contributie;
//1.instanta noastra
    private static AsigurareMedicala asigurareMedicala = null;
//2.private constructor
    private AsigurareMedicala(int id, String numeAsigurati, float contributie) {
        this.id = id;
        this.numeAsigurati = numeAsigurati;
        this.contributie = contributie;
    }
//3. getInstance
    public static AsigurareMedicala getInstance(int id, String numeAsigurati, float contributie ){
        if (asigurareMedicala==null){
            asigurareMedicala=new AsigurareMedicala(id, numeAsigurati,contributie);
        }
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
