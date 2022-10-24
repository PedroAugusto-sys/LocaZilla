/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.Tools.modelo;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author pedro
 */
public class TabelaimagemModelo extends DefaultTableCellRenderer {
     JLabel icone = new JLabel();
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
        boolean hasFocus, int row, int column){
        
        if(isSelected){
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
        }else{
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
        }
        
        if(value != null){
            ImageIcon iconLogo = new ImageIcon(table.getValueAt(row, column-1).toString());
            int tamanho = table.getRowHeight();
            int recuo = 20 * tamanho/ 100;
            icone.setText((String) value);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(
                tamanho - recuo,tamanho - recuo,1));
            icone.setIcon(iconLogo);
        }
        
        icone.setHorizontalAlignment(JLabel.CENTER);
        return icone;
    }
}
