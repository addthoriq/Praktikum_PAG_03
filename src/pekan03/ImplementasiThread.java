public class Implementasi
{
    public static void main(String[] args){
        Thread t1 = new Thread(new Imp1());
        t1.start();
    }
}

class Imp1 implements Runnable
{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread implementasi Runnable...");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ie){}
        }
    }
}
