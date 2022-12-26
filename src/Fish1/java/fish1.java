
package Fish1.java;


 class Fish1 implements Eatable {
    int weight;
    public Fish1(int w){
        weight = w;
    }

    
    public String howToEart(){
        String st = "Dengan menggoreng atau membuat ikan bakar";
        return st;
    }

    @Override
    public String howToEat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  
    
    
    }
    

