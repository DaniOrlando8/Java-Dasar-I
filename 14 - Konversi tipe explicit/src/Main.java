/* ~ Konversi Tipe Explicit ~

    Konversi tipe eksplisit, disebut juga casting, akan menyelesaikan masalah kita. 
    Anda dapat mengonversikan sebuah integer ke double dengan casting, seperti pada contoh dibawah.
    Anda hanya perlu untuk cast salah satu integer ke double.
*/
public class Main {
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 2;
        System.out.println(number1 / number2);
        
        // Cast number1 menjadi double.
        System.out.println((double)number1 / number2);
        
      }
}
