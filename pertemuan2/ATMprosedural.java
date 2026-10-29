/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author aqilm
 */
import javax.swing.JOptionPane;


import javax.swing.JOptionPane;

public class ATMprosedural {
    public static void main(String[] args) {

        int saldo = 1000000;

        String pasword = JOptionPane.showInputDialog("Masukkan Pasword:");

        if (pasword.equals("1234")) {

            int pilihan = 0;

            while (pilihan != 3) {

                String[] menu = {
                    "Cek Saldo",
                    "Tarik Uang",
                    "Setor Uang",
                    "Keluar"
                };

                pilihan = JOptionPane.showOptionDialog(
                    null,"Silakan pilih menu ATM:","ATM",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    menu,
                    menu[0]
                );

                if (pilihan == 0) {

                    JOptionPane.showMessageDialog(
                        null,
                        "Saldo: Rp" + saldo
                    );

                } else if (pilihan == 1) {

                    int tarik = Integer.parseInt(
                        JOptionPane.showInputDialog(
                            "Masukkan jumlah tarik:"
                        )
                    );

                    saldo -= tarik;

                    JOptionPane.showMessageDialog(
                        null,
                        "Saldo sekarang: Rp" + saldo
                    );

                } else if (pilihan == 2) {

                    int setor = Integer.parseInt(
                        JOptionPane.showInputDialog(
                            "Masukkan jumlah setor:"
                        )
                    );

                    saldo += setor;

                    JOptionPane.showMessageDialog(
                        null,
                        "Saldo sekarang: Rp" + saldo
                    );

                } else if (pilihan == 3) {

                    JOptionPane.showMessageDialog(
                        null,
                        "Terima kasih!"
                    );
                }
            }

        } else {

            JOptionPane.showMessageDialog(
                null,
                "PIN salah!"
            );
        }
    }
}
    


