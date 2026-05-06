import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 sll = new SingleLinkedList15();
        Scanner sc = new Scanner(System.in);

        Mahasiswa15 mhs1 = new Mahasiswa15("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa15 mhs2 = new Mahasiswa15("22212202", "Cintia", "3C", 3.5);
        Mahasiswa15 mhs3 = new Mahasiswa15("23212201", "Bimon", "2B", 3.8);
        Mahasiswa15 mhs4 = new Mahasiswa15("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAt(1, mhs2);
        sll.insertAfter("Cintia", mhs3);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        System.out.println("Tambah data dari keyboard:");
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas, ipk);
        sll.addLast(mhs);
        sll.print();

        sc.close();
    }
}