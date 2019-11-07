/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan52;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen d = new Dosen();
        d.setNip("41227829930");
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        d.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : "+d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        System.out.println();
        Mahasiswa m = new Mahasiswa();
        m.setNim("10110269");
        m.setNama("Nindi");
        m.setUmur(17);
        m.setKelas("PBO2");
        System.out.println("NIM MAHASISWA : "+m.getNim());
        m.siapaKamu();
        m.kelasApa();
    }

}
