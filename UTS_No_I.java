package uts_no_i;

import java.util.Scanner;

public class UTS_No_I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ip;
        int lulus, tdklulus, valid = 0, jumlah, bil = 0, rata, NilaiMin = 1000;
        
        UTS_No_I range = new UTS_No_I();

        System.err.println(range.isWithinRange(2, 0, 4));
        ip = input.nextFloat();
        while (ip != -999) {
            ip = input.nextFloat();
            if (isWithinRange(ip, 0, 4) == 1) {
                valid++;
            }
            if (ip == -999) {
                System.out.println("Masukan jumlah mahasiswa !");
                jumlah = input.nextInt();
                System.out.println("Jumlah Mahasiswa : " + jumlah);

                System.out.println("Masukkan jumlah mahasiswa yang lulus !");
                lulus = input.nextInt();
                System.out.println("Jumlah Mahasiswa lulus : " + lulus);
                
                System.out.println("Masukkan jumlah mahasiswa yang tidak lulus !");
                lulus = input.nextInt();
                System.out.println("Jumlah Mahasiswa tidak lulus : " + lulus);
            }
        }
    }

    public static int isWithinRange(float x, float min, float max) {
        if (x <= max && x >= min) {
            return 1;
        } else {
            return 0;
        }

    }
}

