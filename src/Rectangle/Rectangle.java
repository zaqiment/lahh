/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author zaqig
 */
public class Rectangle implements Comparable{
    private double height;
    private double width;

    public Rectangle(){
        
        height = 0.0; width= 0.0;
    }   
    public Rectangle(double h, double w){
        height = h ; width = w;
        
    }
    public double getH(){
    return height;
    }
    public double getW(){
    return width;
    }
    public void  setHW(double h,double w){
        height = h;width = w;
    }
   public double area(){
       return height * width;
    
} 
   public double perimeter(){
       return 2*(height + width);
   }
   public void print(){
       System.out.println("Segi empat: ");
       System.out.println(" p "+height+",L : "+width);
       System.out.println("Luas: "+area());
       System.out.println("Keliling: "+perimeter());
   }
   public boolean comareTo(Object obj){
   if (area() == ((Rectangle)obj).area());
         return true;
    else
         
        
        return false;
   }

    @Override
    public boolean CompareTo(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String compareTo(Rectangle rect2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

