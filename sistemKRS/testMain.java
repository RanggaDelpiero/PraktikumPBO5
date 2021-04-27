package sistemKRS;

public class testMain {

    public static void main (String[] args) {
        Dosen d1 = new Dosen("123", "Aji Sulastri", "TIF", "FILKOM");
        Dosen d2 = new Dosen("124", "Suratno", "TIF", "FILKOM");
        KRS krsKel = new KRS();
        MataKuliah m1 = new MataKuliah("UBR001", "PKN", 5, d1);
        MataKuliah m2 = new MataKuliah("CIE006", "PEMDAS", 4, d1);
        MataKuliah m3 = new MataKuliah("CIE021", "JARKOM", 5, d2);
        MataKuliah m4 = new MataKuliah("CIE005", "PEMWEB", 5, d2);
        MataKuliah m5 = new MataKuliah("CIE005", "Pancasila", 5, d1);
        MataKuliah m6 = new MataKuliah("CIE005", "STATISTIKA", 5, d1);
        krsKel.setMahasiswa(new Mahasiswa("205150200111008", "Rangga", "TIF", "FILKOM"));
        krsKel.tambahMatkul(m1);
        krsKel.tambahMatkul(m2);
        krsKel.tambahMatkul(m3);
        krsKel.tambahMatkul(m4);
        krsKel.tambahMatkul(m5);
        krsKel.tambahMatkul(m6);
        krsKel.tampilKRS();

    }
}
