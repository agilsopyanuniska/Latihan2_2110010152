
package universitas;

public class Mahasiswa {
    private String npm,nama,prodi;
    
    public String getDetail(){
        return nama + npm + prodi;
    }

    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
        System.out.println("NPM : " + npm );
        System.out.println("Nama : " + nama );
        System.out.println("prodi : " + prodi );
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
}
