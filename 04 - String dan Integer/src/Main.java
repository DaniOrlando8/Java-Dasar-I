/* ~ String dan Integer ~

    String dan integer diinterpretasikan secara berbeda dalam pemrograman. 
    Contohnya, 2 + 3 akan mencetak 5, hasil dari penjumlahannya. 
    Akan tetapi, jika Anda memberikan tanda kutip dua " seperti "2 + 3", 
    maka Anda akan membuatnya menjadi string dan hasilnya akan menjadi: 2 + 3
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 3 "+" = 5"); //Line ini menggunakan pengggabungan String.
        System.out.println(2 + 3); //Line ini menggunakan penggabungan integer. 
        System.out.println("Umur Saya " + 23 + " tahun"); //Line ini menggunakan penggabungan String dan integer.
    }
}