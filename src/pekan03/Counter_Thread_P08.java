import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Konter1 implements Runnable
{
    Latihan form;
    Konter1(Latihan f){
        form = f;
        form.Init1();
    }
    
    @Override
    public void run(){
        while(true){
            form.setKonter1();
        }
    }
    
}

class Konter2 implements Runnable
{
    Latihan form;
    Konter2(Latihan f){
        form = f;
        form.Init2();
    }
    
    @Override
    public void run(){
        while(true){
            form.setKonter2();
        }
    }
}


public class Latihan extends JFrame implements ActionListener{
    
    JButton btn_start1 = new JButton();
    JButton btn_start2 = new JButton();
    JButton btn_stop1= new JButton();
    JButton btn_stop2 = new JButton();
    JTextField tx_thread1 = new JTextField();
    JTextField tx_thread2 = new JTextField();
    
    private int k1 = 0;
    private int k2 = 0;
    Thread Ktr1, Ktr2;
    
    Latihan(){
        setTitle("Latihan Prak08");
        setSize(480, 240);
        setLayout(null);
        
        tx_thread1.setBounds(40, 50, 120, 30);
        tx_thread1.setText("");
        
        tx_thread2.setBounds(40, 110, 120, 30);
        tx_thread2.setText("");
        
        btn_start1.setBounds(220, 40, 80, 40);
        btn_start1.setText("Start");
        btn_start1.addActionListener(this);
        
        btn_start2.setBounds(220, 100, 80, 40);
        btn_start2.setText("Start");
        btn_start2.addActionListener(this);
        
        btn_stop1.setBounds(320, 40, 80, 40);
        btn_stop1.setText("Stop");
        btn_stop1.addActionListener(this);
        
        btn_stop2.setBounds(320, 100, 80, 40);
        btn_stop2.setText("Stop");
        btn_stop2.addActionListener(this);
        
        add(btn_start1);
        add(btn_start2);
        add(btn_stop1);
        add(btn_stop2);
        add(tx_thread1);
        add(tx_thread2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source == btn_start1){
            Ktr1 = new Thread(new Konter1(this));
            Ktr1.start();
        } else if(source == btn_start2){
            Ktr2 = new Thread(new Konter2(this));
            Ktr2.start();
        } else if(source == btn_stop1){
            Ktr1.stop();
        } else if(source == btn_stop2){
            Ktr2.stop();
        }
    
    }
    
    public void setKonter1 (){
        k1++;
        tx_thread1.setText(new Integer(k1).toString());
    }
    
    public void setKonter2 (){
        k2++;
        tx_thread2.setText(new Integer(k2).toString());
    }
    
    public void Init1(){
        k1 = 0;
    }
    
    public void Init2(){
        k2 = 0;
    }
    
    public static void main(String[] args){
        new Latihan();
    }
}
