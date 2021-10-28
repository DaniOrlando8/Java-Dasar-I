/* ~ Penggabungan Variabel ~

    Sama halnya dengan penggabungan string, Anda juga dapat menggabungkan variable String.
    Perlu diingat untuk tidak memakai tanda kutip dua untuk variable.
    Jika Anda melakukannya, maka Anda akan mencetak nama variable, bukan nilai yang disimpan.
*/
public class Main {
    public static void main(String[] args) throws Exception {
        String nama = "Hallo";
        System.out.println(nama +" Santoso");
        String namaDepan = " Budi";
        System.out.println(nama + namaDepan);
    }
}