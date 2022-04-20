import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.awt.event.*;
import javax.swing.*;

public class Latihan_Prakt06 {  
    
    public static byte[] getInput() throws Exception 
    { 
        byte[] buffer=new byte[25];
        for(int i=0;i<25;i++)
            buffer[i]=(byte)System.in.read();
        return buffer;
    }
    
    public static void main (String[] args) throws FileNotFoundException, Exception{
        FileOutputStream fos; 
        BufferedOutputStream bos; 
        FileOutputStream fos_nb;
        int ukuran=1024;
        byte[] buff = getInput(); 
        long t0,t1,t2,t3;
        String nmFile = "src/FileKu.txt";
        OutputStream file = new FileOutputStream(nmFile);
        
        for (int index = 0; index < 25; index++) {
            file.write(buff[index]);
        }
        file.close();
        
        
        
        JFrame frame = new JFrame();
        frame.setTitle("Latihan Praktikum 06 | Mengcopy File");
        frame.setSize(570, 370);
        frame.setLayout(null);
        
        JLabel lb_fileAsal = new JLabel();
        lb_fileAsal.setBounds(20, 30, 100, 15);
        lb_fileAsal.setText("File Asal");
        
        JTextField tf_fileAsal = new JTextField();
        tf_fileAsal.setText("");
        tf_fileAsal.setBounds(120, 25, 120, 30);
        
        JLabel lb_fileTujuan = new JLabel();
        lb_fileTujuan.setBounds(20, 90, 100, 15);
        lb_fileTujuan.setText("File Tujuan");
        
        JTextField tf_fileTujuan = new JTextField();
        tf_fileTujuan.setText("");
        tf_fileTujuan.setBounds(120, 80, 120, 30);
        
        JTextArea hasilCopy = new JTextArea();
        hasilCopy.setBounds(20, 130, 370, 180);
        
        JLabel fl_Check = new JLabel();
        fl_Check.setBounds(410, 140, 80, 30);
        fl_Check.setText("File di Check");
        
        JTextField tf_Check = new JTextField();
        tf_Check.setBounds(410, 170, 120, 30);
        
        // Untuk ngambil parameter
        String fileAsal = tf_fileAsal.getText();
        String fileTujuan = tf_fileTujuan.getText();
        String fileCheck = tf_Check.getText();
        
        JButton btn_Copy = new JButton();
        btn_Copy.setBounds(270, 25, 120, 80);
        btn_Copy.setText("Copy File");
        btn_Copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        JButton btn_Check = new JButton();
        btn_Check.setBounds(410, 210, 120, 40);
        btn_Check.setText("Check File");
        btn_Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.add(lb_fileAsal);
        frame.add(lb_fileTujuan);
        frame.add(tf_fileAsal);
        frame.add(tf_fileTujuan);
        frame.add(btn_Copy);
        frame.add(hasilCopy);
        frame.add(fl_Check);
        frame.add(tf_Check);
        frame.add(btn_Check);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
