import java.io.IOException;

public class Main {
    public Main () {
        int n = 0;
        
        try {
           n = System.in.read(); 
        } catch (IOException e){};
        
        System.out.println("Hasil dibaca :" + n + " = " + (char) n);
        byte[] b = new byte[5];
        
        try {
            System.in.read(b);
        } catch (IOException e) {};
        
        for (int index = 0; index < b.length; index++) {
            System.out.println("b[" + index + "]=" + (char) b[index]);
        }
        
        byte[] c = new byte[10];
        try{
            System.in.skip(3);
        } catch (IOException e){};
        
        try {
            System.in.read(c,1,4);
        } catch (IOException e){};
        
        for (int index = 0; index < c.length; index++) {
            System.out.println("c[" + index + "]=" + (char) c[index]);
        }
    }
}
