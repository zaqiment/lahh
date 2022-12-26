/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;
import fish1.java;
/**
 *
 * @author zaqig
 */
public class RectangleDemo {
  public static void main(String[] args) {
      Rectangle rect1 = new Rectangle(7,5);
      Rectangle rect2 = new Rectangle(5,4);
      System.out.println("Luas bidang1: "+rect1.area());
      System.out.println("Luas bidang2: "+rect2.area());
      System.out.println("Hasil pembadingan: "+ rect1.compareTo(rect2));
  } 
}
