package OOPKunalKushwaha.Properties.Inheritence;

import OOP.Inheritence.BOX.BoxWeight;

public class BoxWeigth extends Box{
   double weight;

   public BoxWeigth(double l, double w, double h, double weight){
       super(l,w,h);
       this.weight=weight;
   }

    public static void main(String[] args) {
        BoxWeigth box1 = new BoxWeigth(23,43,53,53);
        System.out.println(BoxWeigth.l);
    }
}
