package gestion_etudiant;

import javax.swing.JOptionPane;

public class Controlleur {
	private View view;
	private Model model;
	
	public Controlleur(View view, Model model) {
		this.view=view;
		this.model=model;
		initController();
	}
	
	private void initView() {
		view.getNomInput().setText(model.getNom());
		view.getPrenomInput().setText(model.getPrenom());
		if(model.getSexe().equals("Homme")) {
			view.getMasculainRadio().setSelected(true);
		}else if(model.getSexe().equals("Femme")) {
			view.getFemmeRadio().setSelected(true);
		}
		view.getFilier().setSelectedItem(model.getFilier());
	}
	
	private void initController() {
		view.getAjouter().addActionListener(e -> ajouterEtudiant());
		view.getSupprimer().addActionListener(e -> supprimerEtudiant());
		view.getModifier().addActionListener(e -> modifierEtudiant());
	}
	
	private void ajouterEtudiant() {
		if(model == null) {
			JOptionPane.showConfirmDialog(null, "les donnees sont incorrect!", "Erreur", JOptionPane.ERROR_MESSAGE);
		}else {
			model.setNom(view.getNomInput().getText());
			model.setPrenom(view.getPrenomInput().getText());
			if(view.getFemmeRadio().isSelected()) {
				model.setSexe("Femme");
			}else {
				model.setSexe("Homme");
			}
			model.setFilier((String)view.getFilier().getSelectedItem());
			view.getTableModel().addRow(model);
			JOptionPane.showConfirmDialog(null, "L'etudiant "+model.getNom()+" est ajouter.", "Ajouter", JOptionPane.OK_CANCEL_OPTION);
		}
		resetView();
		model = new Model();
	}
	
	private void resetView() {
		view.getNomInput().setText("");
		view.getPrenomInput().setText("");
		view.getFemmeRadio().setSelected(false);
		view.getMasculainRadio().setSelected(false);
		view.getFilier().setSelectedIndex(0);
	}
	
	private void supprimerEtudiant() {
		int choix= Integer.valueOf(JOptionPane.showInputDialog(null, "Entrez indice de ligne(default: dernier) :", view.getTableModel().getRowCount()));
		view.getTableModel().deleteRow(choix-1);
	}
	
	private void modifierEtudiant() {
		int id = Integer.valueOf(JOptionPane.showInputDialog(null, "Entrez ID Etudiant :"));
		model = view.getTableModel().getEtudiantByID(id);
		if(model == null) {
			JOptionPane.showConfirmDialog(null, "L'etudiant "+id+" n'exist pas.", "Modifier", JOptionPane.OK_CANCEL_OPTION);
		}
		else {
			initView();
		}
		
	}

}
