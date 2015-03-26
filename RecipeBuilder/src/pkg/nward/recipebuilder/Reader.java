package pkg.nward.recipebuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Reader extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public Reader() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JList recipelist = new JList();
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
