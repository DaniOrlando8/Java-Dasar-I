/*  ~ Variabel ~

    Kita akan belajar tentang variable. 
    Terdengar sulit, namun anggap saja itu sebagai sebuah kotak dimana Anda dapat menyimpan nilai. 
    Selain itu, kotak (variable) mempunyai nama yang dapat digunakan kapan saja untuk mengambil nilai dari Kotak (variable). 
    Variable adalah bagian yang penting dari pemrograman, jadi pastikan Anda memahaminya.
*/
public class Main {
    public static void main(String[] args) {
    int number;
    number = 1;
    System.out.println(number); 
//-------------------------------//
    String name;
    name = "Ucok";
    System.out.println(name);

    }
}
/*
    Anda terlebih dahulu harus mendeklarasikan variable sebelum menyimpan nilai di dalamnya. 
    Dengan mendeklarasikan variable, sebuah kotak akan dibuat dan akan dapat menyimpan nilai.
    Ada dua langkah untuk mendeklarasikan variable di dalam Java:
    1. Spesifikasikan tipe data nilai.
    2. Tentukan nama untuk variable.

    Setelah mendeklarasikan variable, Anda perlu menetapkan nilai. 
    Anda dapat melakukannya dengan format berikut:
    variableName = nilai. 
    Operator = di dalam Java bukan merupakan "sama dengan",
    Melainkan assignment operator yang artinya menetapkan nilai di kanan untuk variable di sebelah kiri.
    Perlu diingat bahwa nama variable tidak ditutup dengan tanda kutip dua.

    Nilai sebuah variable akan secara otomatis didapatkan kembali saat Anda menggunakannya. 
    Pada gambar di bawah, System.out.println(number) akan mencetak 10, nilai yang disimpan di dalam variable number.
*/