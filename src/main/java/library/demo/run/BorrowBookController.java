package library.demo.run;

import java.util.List;

import javax.swing.DefaultListModel;

public class BorrowBookController {
    private BorrowBookModel model;

    public BorrowBookController(BorrowBookModel model) {
        this.model = model;
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
}

