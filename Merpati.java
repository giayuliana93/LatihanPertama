package polymorphismunggas;
public class Merpati extends PolymorphismUnggas {
    
   @Override
        void makan() {
        System.out.println("Merpati Makan");
   }
 
   @Override
        void lari() {
        System.out.println("Merpati Lari");
   } 

   @Override
        void berbulu() {
        System.out.println("Merpati Berbulu");
   } 

   @Override
        void bertelur() {
        System.out.println("Merpati Bertelur");
   } 
    public void terbang(){
         System.out.println("Merpati Terbang");
   
   }
}
