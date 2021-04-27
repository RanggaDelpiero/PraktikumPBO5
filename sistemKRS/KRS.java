package sistemKRS;

public class KRS extends Mahasiswa{

    private Mahasiswa mahasiswa;
    private MataKuliah[] matkul;
    private static int jumlahMatkul = 0;

    //Constructor
    public KRS(){ }

    //Getter and Setter
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }


    public void tambahMatkul(MataKuliah matkul) {

        int i = 0;
        if (mahasiswa.getSksMhs() < 24) {
            i++;
            mahasiswa.setSksMhs(getSksMhs() + matkul.getSks());
            this.matkul[i] = matkul;
            System.out.printf("Info %s  :Matkul Berhasil Ditambahkan\n", mahasiswa.getNim());
        } else {
            System.out.printf("Info %s  :Anda Mencapai Batas SKS\n", mahasiswa.getNim());
        }
    }

    public void tampilKRS(){
        System.out.printf("NIM          :%s\n", mahasiswa.getNim());
        System.out.printf("NAMA         :%s\n", mahasiswa.getNama());
        System.out.printf("PRODI        :%s\n", mahasiswa.getProdi());
        System.out.printf("FAKULTAS     :%s\n", mahasiswa.getFakultas());
        System.out.printf("MATA KULIAH  :\n");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf(" * " + matkul[i].getKodeMatkul() + "-" +
                    matkul[i].getNamaMatkul() + "-" +
                    matkul[i].getSks() + "sks-" +
                    matkul[i].getDosen().getNama()+"\n");
        }

    }
}

