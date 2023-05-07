//Clase que extienda de una tabla que me permita meter combobox y checkbox en la tabla
package com.capturas;

import java.awt.Component;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class crearCombo extends AbstractCellEditor implements TableCellEditor, ActionListener {

    JComboBox combo = new JComboBox<String>();
    private Object valor;
    private int fila;
    private int columna;
    private JTable tabla;
    private boolean editable;

    public crearCombo()
    {
        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
               if (e.getStateChange() == ItemEvent.SELECTED) {
                  ItemSelectable is = e.getItemSelectable();
                  String bjt = (String)is.getSelectedObjects()[0];
                  valor = bjt;
                  
                  // Afectacion en la tabla etc
               }
            }
        };
        combo.addItemListener(il);
    }

    //Constructor que me permite crear un combobox en la tabla con datos
    public crearCombo(JTable tabla, String[] datos) {
        this.tabla = tabla;
        this.editable = true;
        combo = new JComboBox<String>(datos);
        combo.addActionListener(this);
    }

    public crearCombo(JTable tabla, boolean editable) {
        this.tabla = tabla;
        this.editable = editable;
        combo = new JComboBox<String>();
        combo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        valor = (String) combo.getSelectedItem();
        tabla.setValueAt(valor, fila, columna);
    }

    //Metodo que me permite agregar un item al combobox
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return combo;
    }

    //Metodo que me permite obtener el valor del combobox

    public Object getCellEditorValue() {
        return valor;
    }

    public boolean isCellEditable(EventObject evt) {
        return editable;
    }
}