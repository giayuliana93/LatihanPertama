package polymorphismunggas;

public class Main {
    public static void main(String[] args) {
     Polymorphism poly = new Polymorphism();
     poly.poly(new Angsa());
     poly.poly(new Merpati());
     poly.poly(new PolymorphismUnggas(){

         @Override
         void makan() {
             System.out.println("Unggas Makan");   
         }

         @Override
         void lari() {
             System.out.println("Unggas Lari");
         }

         @Override
         void berbulu() {
             System.out.println("Unggas Berbulu");
         }

         @Override
         void bertelur() {
             System.out.println("Unggas Bertelur");
         }
       
    
     }); 
   }   
}
