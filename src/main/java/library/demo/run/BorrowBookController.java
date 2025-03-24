package library.demo.run;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BorrowBookController {
    private BorrowBookModel model;
	private BorrowBookView view;
	private JTable table;


    public BorrowBookController(BorrowBookModel model) {
        this.model = model;
        this.view = view;
        }
    


	public void getBooks(DefaultListModel<String> modelList) {
        List<Object[]> listaVisualizar = model.getBooksModel();
        modelList.clear(); // Limpiar antes de actualizar la lista

        for (Object[] fila : listaVisualizar) {
            if (fila.length > 0 && fila[0] != null) {
                modelList.addElement(fila[0].toString());
            }
        }
    }



	public void getMembers(JTable table) {
	    List<Object[]> listaId = model.getMembersIdModel();
	    List<Object[]> listaNames = model.getMembersNamesModel();

	    // Verificar que ambas listas tengan el mismo tamaño
	    if (listaId.size() != listaNames.size()) {
	        System.out.println("Error: Las listas no tienen el mismo tamaño.");
	        return;
	    }

	    // Obtener el modelo de la JTable
	    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
	    tableModel.setRowCount(0); // Limpiar la tabla antes de actualizarla

	    // Crear un diccionario opcionalmente
	    Map<Object, String> membersMap = new HashMap<>();

	    // Llenar la tabla con los datos de las listas
	    for (int i = 0; i < listaId.size(); i++) {
	        Object[] filaId = listaId.get(i);
	        Object[] filaNames = listaNames.get(i);

	        if (filaId.length > 0 && filaNames.length > 0 && filaId[0] != null && filaNames[0] != null) {
	            membersMap.put(filaId[0], filaNames[0].toString());
	            tableModel.addRow(new Object[]{filaId[0], filaNames[0]}); // Agregar fila a la JTable
	        }
	    }

	    // Mostrar los datos del diccionario en la consola (opcional)
	    membersMap.forEach((key, value) -> System.out.println("ID: " + key + " - Nombre: " + value));
	}


}

