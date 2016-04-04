package tugasarraygia;
         import javax.swing.JOptionPane;
    public class TugasArrayGia {
    public static void main(String[] args) {
        String ulang;
        do {
            String menu = JOptionPane.showInputDialog(null, "Masukkan pilihan anda: \n 1. Nama Buah-buahan\n 2. Nama Kendaraan\n 3. Keluar");
            int option = Integer.parseInt(menu);
            if (option == 1) {
                 String [] b = new String [10];
        
        b[0]="Apel";
        b[1]="Jeruk";
        b[2]="Anggur";
        b[3]="Mangga";
        b[4]="Manggis";
        b[5]="Semangka";
        b[6]="Melon";
        b[7]="Pepaya";
        b[8]="Jambu";
        b[9]="Lemon";
         
    
        System.out.println("1. " + b[0]);
        System.out.println("2. " + b[1]);
        System.out.println("3. " + b[2]);
        System.out.println("4. " + b[3]);
        System.out.println("5. " + b[4]);
        System.out.println("6. " + b[5]);
        System.out.println("7. " + b[6]);
        System.out.println("8. " + b[7]);
        System.out.println("9. " + b[8]);
        System.out.println("10. " + b[9]);
        
            } else if (option == 2) {
                
        String [] c = {"Motor", "Mobil", "Becak", "Sepeda", "Kapal", "Pesawat", "Bis", "Kereta", "Angkot", "dll"};
        
        System.out.println("1. " +c [0]);
        System.out.println("2. " +c [1]);
        System.out.println("3. " +c [2]);
        System.out.println("4. " +c [3]);
        System.out.println("5. " +c [4]);
        System.out.println("6. " +c [5]);
        System.out.println("7. " +c [6]);
        System.out.println("8. " +c [7]);
        System.out.println("9. " +c [8]);
        System.out.println("10. " +c [9]);
        this.dispose(); 
            } else if (option == 3) {
                JOptionPane.showMessageDialog(null, "Terima Kasih atas kunjungan anda");
                System.exit(0);
            }
            ulang = JOptionPane.showInputDialog(null, "Apakah anda ingin mengulang\n 1. ya\n 2. tidak");
        } while ("1".equals(ulang));
        JOptionPane.showMessageDialog(null, "Terima kasih dan sampai jumpa lagi....!!!! :) :)");
    }
  }
    
