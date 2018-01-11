/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priseEnMain;

import javax.swing.JOptionPane;

/**
 *
 * @author aminiscloux
 */
public class TableMultiplication {
    public static void main(String args[]) {
        int vColonne ;
        int vLigne ;
        int vNombre ;
        String vChoix ;
        int tab[][] = new int[10][2];
        
        vChoix = JOptionPane.showInputDialog("Table de "+ "multiplication du nombre : ");
        if (vChoix != null) {
            vNombre = Integer.valueOf(vChoix);
            for (vColonne = 0; vColonne < 2; vColonne++) {
                for (vLigne = 0; vLigne < tab.length; vLigne++) {
                    if (vColonne == 0) {
                        tab[vLigne][vColonne] = vLigne + 1 ;
                    } else {
                        tab[vLigne][vColonne] = vNombre * (vLigne + 1);
                    }
                }
            }
            System.out.println("Table de "+ vNombre);
            System.out.println("-----------");
            for (vColonne = 0; vColonne < 2; vColonne++) {
                for (vLigne = 0; vLigne < tab.length; vLigne++) {
                    if (vColonne > 0) {
                        tab[vLigne][vColonne] = vNombre * (vLigne + 1);
                        System.out.println(tab[vLigne][vColonne - 1] + " x " + vNombre + " = " + tab[vLigne][vColonne]);
                    }
                }
            }
        }
    }
    
}
