import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //membuat objek list
        ArrayList<String> nama = new ArrayList<String>();

        //menambahkan data
        nama.add("n");
        nama.add("a");
        nama.add("d");
        nama.add("a");

        //menampilkan array data
        System.out.println("\nData pada Array : " +nama);

        //Method dalam arraylist
        System.out.println("\n1.  =====  Method isEmpty()   =====");
        System.out.println("Data array dalam keadaan kosong   : " +nama.isEmpty());
       

        System.out.println("\n2.  =====  Method Size()   =====");
        System.out.println("Banyaknya Array didalam data : " +nama.size());

        System.out.println("\n3.  =====  Method get()   ====="); 
        //Statement try catch untuk menampilkan eksekusi yang error
        //membuat program ttp berjalan
        try {
        System.out.println("Ambil data ke 1 : " +nama.get(0));
        System.out.println("Ambil data ke 3 : " +nama.get(2));
        System.out.println("Ambil data      : " +nama.get(-3));
        }
        catch (IndexOutOfBoundsException exception){
            System.out.println("Data tidak ada/ diluar array");
        }

        System.out.println("\n4.  =====  Method indexOf()   =====");
        System.out.println("Index of a  :" +nama.indexOf("a"));
        System.out.println("Index of c  :" +nama.indexOf("c"));
        System.out.println("Index of q  :" +nama.indexOf("q"));

        System.out.println("\n5.  =====  Method remove()   =====");
        try {
        System.out.println("Hapus data ke 1 : " +nama.remove(0));
        System.out.println("Hapus data ke 4 : " +nama.remove(3));
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
        System.out.println("Hapus data ke 3 : " +nama.remove(2));
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("\n6.  =====  Method add()   =====");
        try{
        System.out.println("Tambahkan data ke 1, e "); nama.add(0,"e");
        System.out.println("Tambahkan data ke 3, f "); nama.add(2,"f");
        System.out.println("Tambahkan data ke 4, g "); nama.add(3,"g");
        System.out.println("Tambahkan data ke 5, h"); nama.add(4,"h");
        System.out.println("Tambahkan data ke 7, h : "); nama.add(6,"h");
        System.out.println("Tambahkan data indek -3, j   : "); nama.add(-3,"j");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("\nHasil data setelah ditambahkan   : " +nama);
        }
}
