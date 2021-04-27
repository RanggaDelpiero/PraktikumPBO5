package sistemKRS;

public class Mahasiswa extends CivitasAkademik{

    private String nim;
    private static int sksMhs = 0;

    //Constructor
    public Mahasiswa() {}

    public Mahasiswa(String nim, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nim = nim;
    }

    //Getter and Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public static int getSksMhs() {
        return sksMhs;
    }

    public static void setSksMhs(int sksMhs) {
        Mahasiswa.sksMhs = sksMhs;
    }
}
