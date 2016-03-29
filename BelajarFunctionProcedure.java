package belajarfunctionprocedure;

public class BelajarFunctionProcedure {

    public static void main(String[] args) {
            BelajarFunctionProcedure belajar = new BelajarFunctionProcedure(); {
            belajar.penjumlahan(10, 5);
            belajar.pengurangan(10, 3);
            belajar.pembagian(10, 2);
            belajar.perkalian(2, 5);
            belajar.kuadrat(5);
}
        }
    private void penjumlahan (int a, int b) {
            int hasil;
            hasil = a + b;
            System.out.println(hasil);
    }
    private void pengurangan (int a, int b) {
            int hasil;
            hasil = a - b;
            System.out.println(hasil);
    }
    private void pembagian (int a, int b) {
            int hasil;
            hasil = a / b;
            System.out.println(hasil);
    }
   private void perkalian (int a, int b) {
            int hasil;
            hasil = a * b;
            System.out.println(hasil);
   }
   private void kuadrat (int a) {
            int hasil;
            hasil = a * a ;
            System.out.println(hasil);
   }
   
}
