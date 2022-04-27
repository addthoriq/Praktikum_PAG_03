public class Main
{
    public static void main(String[] args){
        Grape g1 = new Grape("Merlot");
        Grape g2 = new Grape("Pinot");
        Grape g3 = new Grape("Cabernet");
        
        g1.start();
        g2.start();
        g3.start();
    }
}

class Grape extends Thread
{
    Grape(String str){
        super(str);
    }
    
    @Override
    public void run(){
        System.out.println( "Halo saya Thread :" + super.getName());
    }
}
