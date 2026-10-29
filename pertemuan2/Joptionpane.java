/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author aqilm
 */

   
    import javax.swing.JOptionPane;

public class Joptionpane {
    public static void main(String[] args) {

       int Saldo = 1000000;
       
       String pin = JOptionPane.showInputDialog("Masukan PIN");
       
       if (pin.equals("1122")){
           int menu = 0;
           while (menu != 3);
           
           String [] Menu = {
                "Lihat Saldo",
               "Tarik Tunai",
               "Isi Saldo",
               "Keluar"
               };
                    menu = JOptionPane.showOptionDialog(null, Menu, pin, menu, menu, icon, Menu, Saldo)
 
       } else{ 
    JOptionPane.showMessageDialog(
            null,
            "Salah!!!"
    );
}
}
}
   




