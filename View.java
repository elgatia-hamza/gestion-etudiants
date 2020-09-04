package gestion_etudiant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.w3c.dom.NameList;


public class View extends JFrame{
	
	private JPanel infoEtudiant;
	private JPanel estPanel;
	private JPanel centerPanel;
	private JPanel westPanel;
	private JPanel f1;
	private JPanel f2;
	private JPanel buttonGroup;
	private JScrollPane tableSP;
	
	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel sexeLabel;
	private JLabel filierLabel;
	
	private JTextField nomInput;
	private JTextField prenomInput;
	
	private ButtonGroup bg;
	private JRadioButton femmeRadio;
	private JRadioButton masculainRadio;
	
	private JComboBox<String> filier;
	
	private JButton ajouter;
	private JButton supprimer;
	private JButton modifier;
	
	private JTable table;
	private TabelModel tableModel;
	
	public View(String title) {
		super(title);
		initComponents();
		setSize(500, 600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void initComponents() {
		this.setLayout(new BorderLayout());
		this.setFont(new Font("Segoe UI", 1, 12));
		
		infoEtudiant = new JPanel(new BorderLayout());
		infoEtudiant.setBorder(BorderFactory.createTitledBorder("Informations Etudiant"));
		
		estPanel = new JPanel();
		estPanel.setLayout(new BoxLayout(estPanel, BoxLayout.Y_AXIS));
		
		westPanel = new JPanel();
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		
		f1 = new JPanel(new FlowLayout());
		f2 = new JPanel(new FlowLayout());
		
		buttonGroup = new JPanel();
		buttonGroup.setLayout(new BoxLayout(buttonGroup, BoxLayout.Y_AXIS));
		
		tableSP = new JScrollPane();
		tableSP.setBorder(BorderFactory.createTitledBorder("Liste des etudiants"));
		
		nomLabel = new JLabel("Nom:");
		prenomLabel = new JLabel("Prenom:");
		sexeLabel = new JLabel("Sexe:");
		filierLabel = new JLabel("Filiere:");
		
		nomInput = new JTextField();
		prenomInput = new JTextField();
		
		femmeRadio = new JRadioButton("F");
		masculainRadio = new JRadioButton("M");
		
		bg = new ButtonGroup();
		bg.add(femmeRadio);
		bg.add(masculainRadio);
		
		filier = new JComboBox<String>(new String[] {"IID","GI","GRT","GE","GID","GPEE"} );
		
		ajouter = new JButton("Ajouter");
		supprimer = new JButton("Supprimer");
		modifier = new JButton("Modifier");
		
		tableModel = new TabelModel();
		table = new JTable(tableModel);
		
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		p1.add(nomLabel);
		p2.add(prenomLabel);
		westPanel.add(p1);
		westPanel.add(p2);
		
		centerPanel.add(nomInput);
		centerPanel.add(prenomInput);
		
		f1.add(sexeLabel);
		f1.add(femmeRadio);
		f1.add(masculainRadio);
		
		f2.add(filierLabel);
		f2.add(filier);
		
		estPanel.add(f1);
		estPanel.add(f2);
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
		
		infoEtudiant.add(BorderLayout.WEST,westPanel);
		infoEtudiant.add(BorderLayout.CENTER,centerPanel);
		infoEtudiant.add(BorderLayout.EAST,estPanel);
		
		buttonGroup.add(ajouter);
		buttonGroup.add(supprimer);
		buttonGroup.add(modifier);
	
		northPanel.add(infoEtudiant);
		northPanel.add(buttonGroup);
		
		table.setRowHeight(15);
		table.setFont(new Font("Segoe UI", 1, 12));
		tableSP = new JScrollPane(table);
		
		this.add(BorderLayout.NORTH, northPanel);
		this.add(BorderLayout.CENTER, tableSP);
	}

	public JTextField getNomInput() {
		return nomInput;
	}

	public void setNomInput(JTextField nomInput) {
		this.nomInput = nomInput;
	}

	public JTextField getPrenomInput() {
		return prenomInput;
	}

	public void setPrenomInput(JTextField prenomInput) {
		this.prenomInput = prenomInput;
	}

	public ButtonGroup getBg() {
		return bg;
	}

	public void setBg(ButtonGroup bg) {
		this.bg = bg;
	}

	public JRadioButton getFemmeRadio() {
		return femmeRadio;
	}

	public void setFemmeRadio(JRadioButton femmeRadio) {
		this.femmeRadio = femmeRadio;
	}

	public JRadioButton getMasculainRadio() {
		return masculainRadio;
	}

	public void setMasculainRadio(JRadioButton masculainRadio) {
		this.masculainRadio = masculainRadio;
	}

	public JComboBox<String> getFilier() {
		return filier;
	}

	public void setFilier(JComboBox<String> filier) {
		this.filier = filier;
	}

	public JButton getAjouter() {
		return ajouter;
	}

	public void setAjouter(JButton ajouter) {
		this.ajouter = ajouter;
	}

	public JButton getSupprimer() {
		return supprimer;
	}

	public void setSupprimer(JButton supprimer) {
		this.supprimer = supprimer;
	}

	public JButton getModifier() {
		return modifier;
	}

	public void setModifier(JButton modifier) {
		this.modifier = modifier;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public TabelModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(TabelModel tableModel) {
		this.tableModel = tableModel;
	}
	
	

}
