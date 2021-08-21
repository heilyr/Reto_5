package utp.misiontic2022.c2.p23.reto4;

import javax.swing.table.AbstractTableModel;

public class Modelo extends AbstractTableModel {

    private static final String[] COLUMN_NAMES = {"ID_Proyecto", "Constructora"};

    Object datos[][] = { 
            { "uno", "dos", "tres", "cuatro" }, 
            { "cinco", "seis", "siete", "ocho" },
            { "nueve", "diez", "once", "doce" } 
        };

    public Modelo() {
        addTableModelListener(evt -> {
            for (int i = 0; i < datos.length; i++) {
                for (int j = 0; j < datos[0].length; j++) {
                    System.out.print(datos[i][j] + " ");
                }
                System.out.println();
            }
        });
    }

    @Override
    public int getRowCount() {
        return datos.length;
    }

    @Override
    public int getColumnCount() {
        return datos[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datos[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        datos[rowIndex][columnIndex] = aValue;
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

}