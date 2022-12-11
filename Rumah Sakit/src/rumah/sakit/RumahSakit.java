package rumah.sakit;
import java.util.Scanner;
public class RumahSakit {

    
    public static void main(String[] args) {
            
        String nama, kode;
        int inap, obat, infus, total_biaya;
        
        Scanner input = new Scanner (System.in);
        System.out.println("==========================================");
        System.out.println("Program Untuk Menghitung biaya Rumah Sakit");
        System.out.println("==========================================");
        
        System.out.print("Masukkan nama Pasien: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan kode Pasien: ");
        kode = input.nextLine();
        
        System.out.print("Masukkan jumlah hari rawat inap: ");
        inap = input.nextInt();
        
        System.out.print("Masukkan jumlah konsumsi obat: ");
        obat = input.nextInt();
        
        System.out.print("Masukkan jumlah Konsumsi Infus: ");
        infus = input.nextInt();
        
        total_biaya = 750000*inap + 1500000*obat + 50000*infus;
        
            System.out.println("==========================================");
            
         System.out.println("Total biaya rumah sakit atas nama " + nama + " Dengan kode pasien " + kode + " sejumlah Rp." + total_biaya + ",00");
            
    }
    
}
