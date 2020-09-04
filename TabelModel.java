package gestion_etudiant;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TabelModel extends AbstractTableModel{
	
	private ArrayList<Model> listEtudiant;
	
	public TabelModel() {
		listEtudiant = new ArrayList<Model>();
	}
	
	public void addRow(Model m) {
		this.listEtudiant.add(m);
		fireTableRowsInserted(listEtudiant.size()-1,listEtudiant.size()-1);
	}
	
	public void deleteRow(int indexRow) {
		this.listEtudiant.remove(indexRow);
		fireTableRowsDeleted(indexRow, indexRow);
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0: {
			return "ID";
		}
		case 1: {
			return "Nom";
		}
		case 2: {
			return "Prenom";
		}
		case 3: {
			return "Sexe";
		}
		case 4: {
			return "Filiere";
		}
		default:
			return super.getColumnName(column);
		}
	}



	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0: {
			return Integer.class;
		}
		case 1: {
			return String.class;
		}
		case 2: {
			return String.class;
		}
		case 3: {
			return String.class;
		}
		case 4: {
			return String.class;
		}
		default:
			return super.getColumnClass(columnIndex);
		}
		
	}



	@Override
	public int getRowCount() {
		return listEtudiant.size();
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch(columnIndex) {
		case 0:
			return listEtudiant.get(rowIndex).getId();
		case 1:
			return listEtudiant.get(rowIndex).getNom();
		case 2:
			return listEtudiant.get(rowIndex).getPrenom();
		case 3:
			return listEtudiant.get(rowIndex).getSexe();
		case 4:
			return listEtudiant.get(rowIndex).getFilier();
		default:
			return null;
		}
	}
	
	public Model getEtudiantByID(int id) {
		for(Model m:listEtudiant) {
			if(m.getId() == id)
				return m;
		}
		return null;
	}
}
