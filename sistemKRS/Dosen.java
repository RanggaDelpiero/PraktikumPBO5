package sistemKRS;

public class Dosen extends CivitasAkademik{

    private String nidn;

    //Constructor
    Dosen() {}

    public Dosen(String nidn, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nidn = nidn;
    }

    //Getter and Setter
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
}
