package pkg.nward.recipebuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JTextField;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Window {

	private JFrame frmItcHw;
	//private JFrame readRecipe;
	private JTextField txtRecipeName;
	private JTextField txt_ingredient;
	private static ArrayList<Item> recipes = new ArrayList<Item>();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	//private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	
	static class newWindow extends JFrame{
		
		private JPanel contentPane;
		
		private newWindow(){
			setBounds(100, 100, 571, 404);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			
			JPanel panel = new JPanel();
			contentPane.add(panel, BorderLayout.SOUTH);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JButton btnClose = new JButton("Close");
			btnClose.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					dispose();
				}
			});
			panel.add(btnClose);
			
			JPanel panel_1 = new JPanel();
			contentPane.add(panel_1, BorderLayout.CENTER);
			GridBagLayout gbl_panel_1 = new GridBagLayout();
			gbl_panel_1.columnWidths = new int[]{0, 0, 0};
			gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel_1.setLayout(gbl_panel_1);
			
			JLabel lblRecipeList = new JLabel("Recipe List");
			GridBagConstraints gbc_lblRecipeList = new GridBagConstraints();
			gbc_lblRecipeList.insets = new Insets(0, 0, 5, 5);
			gbc_lblRecipeList.gridx = 0;
			gbc_lblRecipeList.gridy = 1;
			panel_1.add(lblRecipeList, gbc_lblRecipeList);
			
			JLabel lblRecipeContents = new JLabel("Recipe Contents");
			GridBagConstraints gbc_lblRecipeContents = new GridBagConstraints();
			gbc_lblRecipeContents.insets = new Insets(0, 0, 5, 0);
			gbc_lblRecipeContents.gridx = 1;
			gbc_lblRecipeContents.gridy = 1;
			panel_1.add(lblRecipeContents, gbc_lblRecipeContents);
			
			DefaultListModel listModel = new DefaultListModel();
			
			
			for (Item r : recipes){
				listModel.addElement(r.toString());
			}
			
			
			JList recipelist = new JList(listModel);
			recipelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			recipelist.setLayoutOrientation(JList.VERTICAL);
			GridBagConstraints gbc_recipelist = new GridBagConstraints();
			gbc_recipelist.insets = new Insets(0, 0, 0, 5);
			gbc_recipelist.fill = GridBagConstraints.BOTH;
			gbc_recipelist.gridx = 0;
			gbc_recipelist.gridy = 2;
			
			panel_1.add(recipelist, gbc_recipelist);
			
			JLabel lbl_RecipeText = new JLabel("");
			GridBagConstraints gbc_lbl_RecipeText = new GridBagConstraints();
			gbc_lbl_RecipeText.gridx = 1;
			gbc_lbl_RecipeText.gridy = 2;
			panel_1.add(lbl_RecipeText, gbc_lbl_RecipeText);
		
			
			
		}
		

		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmItcHw.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmItcHw = new JFrame();
		frmItcHw.setTitle("ITC115 HW7");
		frmItcHw.setBounds(100, 100, 555, 372);
		frmItcHw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmItcHw.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmItcHw.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtRecipeName = new JTextField();
		GridBagConstraints gbc_txtRecipeName = new GridBagConstraints();
		gbc_txtRecipeName.gridwidth = 5;
		gbc_txtRecipeName.insets = new Insets(0, 0, 5, 5);
		gbc_txtRecipeName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRecipeName.gridx = 0;
		gbc_txtRecipeName.gridy = 0;
		panel.add(txtRecipeName, gbc_txtRecipeName);
		txtRecipeName.setColumns(10);
		
		JLabel lblRecipeTitle = new JLabel("Recipe Title");
		GridBagConstraints gbc_lblRecipeTitle = new GridBagConstraints();
		gbc_lblRecipeTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecipeTitle.gridx = 5;
		gbc_lblRecipeTitle.gridy = 0;
		panel.add(lblRecipeTitle, gbc_lblRecipeTitle);
		
		txt_ingredient = new JTextField();
		GridBagConstraints gbc_txt_ingredient = new GridBagConstraints();
		gbc_txt_ingredient.insets = new Insets(0, 0, 5, 5);
		gbc_txt_ingredient.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_ingredient.gridx = 0;
		gbc_txt_ingredient.gridy = 1;
		panel.add(txt_ingredient, gbc_txt_ingredient);
		txt_ingredient.setColumns(10);
		
		JButton btnAddIngredient = new JButton("Add Ingredient");
		btnAddIngredient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddIngredient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			txt_ingredient.setText(" ");
			}
		});
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 1;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 1;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNamecalcarbsfatunit = new JLabel("Name/Cal/Carbs/Fat/Unit");
		GridBagConstraints gbc_lblNamecalcarbsfatunit = new GridBagConstraints();
		gbc_lblNamecalcarbsfatunit.insets = new Insets(0, 0, 5, 5);
		gbc_lblNamecalcarbsfatunit.gridx = 5;
		gbc_lblNamecalcarbsfatunit.gridy = 1;
		panel.add(lblNamecalcarbsfatunit, gbc_lblNamecalcarbsfatunit);
		GridBagConstraints gbc_btnAddIngredient = new GridBagConstraints();
		gbc_btnAddIngredient.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddIngredient.gridx = 6;
		gbc_btnAddIngredient.gridy = 1;
		panel.add(btnAddIngredient, gbc_btnAddIngredient);
		
		final JTextArea txtInstructions = new JTextArea();
		GridBagConstraints gbc_txtInstructions = new GridBagConstraints();
		gbc_txtInstructions.gridwidth = 7;
		gbc_txtInstructions.gridheight = 2;
		gbc_txtInstructions.insets = new Insets(0, 0, 5, 0);
		gbc_txtInstructions.fill = GridBagConstraints.BOTH;
		gbc_txtInstructions.gridx = 0;
		gbc_txtInstructions.gridy = 2;
		panel.add(txtInstructions, gbc_txtInstructions);
		
		JButton btnNewButton_1 = new JButton("Open Reader");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			newWindow w = new newWindow();
			w.setVisible(true);
				
			
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 4;
		panel.add(btnExit, gbc_btnExit);
		
		
		//submit button to create the new recipe, set the name and instructions, then add to the list
		//figure out how to use the ingredients button and add nutritional info
		JButton btnSubmit = new JButton("Submit Recipe");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			Recipe newRecipe = new Recipe();
			newRecipe.name = txtRecipeName.getText();
			newRecipe.setInstructions(txtInstructions.getText());
			recipes.add(newRecipe);
			
			txtInstructions.setText(" ");
			txtRecipeName.setText(" ");
			
			
			
			
			
			}
			});
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 5;
		gbc_btnSubmit.gridy = 4;
		panel.add(btnSubmit, gbc_btnSubmit);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 4;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
	}


		
	}
	
	


