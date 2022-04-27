public class Main extends Thread
{
    public static void main(String[] args){
        Main thread = new Main();
        thread.start();
        System.out.println("Ini jalan di luar Thread");
    }
    
    @Override
    public void run(){
        System.out.println("Ini jalan di Thread");
    }
}
