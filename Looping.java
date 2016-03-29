package looping;

public class Looping {

    static void Tampil(int a){
        System.out.println("Nilai ke "+a);
    }
    public static void main(String[] args) {
        int n;
        for (n=0; n<10; n++){
            Tampil(n);
        }
        System.out.println("Nilai terakhirnya adalah : "+n);
    }
    
}
