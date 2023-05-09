package demo;

import javax.swing.ButtonGroup;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class TP5 extends Composite {
	private Text nomComplet;
	private Text profession;
	private Text email;
	private Text tel;
	private ButtonGroup statusSocial;
	private Combo niveauEducation;
	private List langues;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text text;
	private Text text_1;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public TP5(Composite parent, int style) {
		super(parent, style);
		setLayout(null);

		Label lblNomComplet = new Label(this, SWT.NONE);
		lblNomComplet.setBounds(20, 40, 119, 21);
		lblNomComplet.setText("Nom Complet :");

		Label lblStatusSocial = new Label(this, SWT.NONE);
		lblStatusSocial.setBounds(20, 86, 119, 21);
		lblStatusSocial.setText("Status social :");

		Label lblAge = new Label(this, SWT.NONE);
		lblAge.setBounds(20, 165, 119, 21);
		lblAge.setText("Age :");

		Label lblProfession = new Label(this, SWT.NONE);
		lblProfession.setBounds(20, 217, 119, 21);
		lblProfession.setText("Profession");

		Label lblEmail = new Label(this, SWT.NONE);
		lblEmail.setBounds(20, 271, 119, 21);
		lblEmail.setText("Email :");

		Label lblTl = new Label(this, SWT.NONE);
		lblTl.setBounds(20, 325, 119, 21);
		lblTl.setText("Tél:");

		Label lblNiveauEducation = new Label(this, SWT.NONE);
		lblNiveauEducation.setBounds(20, 389, 139, 21);
		lblNiveauEducation.setText("Niveau éducation :");

		Label lblLangues = new Label(this, SWT.NONE);
		lblLangues.setBounds(20, 440, 73, 21);
		lblLangues.setText("Langues :");

		nomComplet = new Text(this, SWT.BORDER);
		nomComplet.setBounds(186, 40, 232, 27);

		statusSocial = new ButtonGroup();

		Combo jComboBoxAge = new Combo(this, SWT.NONE);
		jComboBoxAge.setItems(new String[] { "18-25", "26-35", "36-45", "46-55", "56+", });
		jComboBoxAge.setBounds(186, 165, 232, 27);

		profession = new Text(this, SWT.BORDER);
		profession.setBounds(186, 217, 232, 27);

		email = new Text(this, SWT.BORDER);
		email.setBounds(186, 271, 232, 27);

		tel = new Text(this, SWT.BORDER);
		tel.setBounds(186, 325, 232, 27);

		niveauEducation = new Combo(this, SWT.NONE);
		niveauEducation.setItems(new String[] { "Baccalauréat", "maitrise", "mastère", "ingénieur", "docteur" });
		niveauEducation.setBounds(186, 389, 232, 27);

		langues = new List(this, SWT.BORDER);
		langues.setItems(new String[] { "Arabe", "Français", "Anglais", "Espagnol", "Allemand" });
		langues.setBounds(186, 440, 232, 78);

		Button btnSubscribe = new Button(this, SWT.NONE);
		btnSubscribe.setBounds(244, 556, 174, 31);
		btnSubscribe.setText("Subscribe");

		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(34, 619, 384, 127);
		formToolkit.adapt(text_1, true, true);

		Button btnMarried = new Button(this, SWT.RADIO);
		btnMarried.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnMarried.setBounds(186, 86, 115, 21);
		formToolkit.adapt(btnMarried, true, true);
		btnMarried.setText("Married");

		Button btnDivorced = new Button(this, SWT.RADIO);
		btnDivorced.setBounds(324, 86, 115, 21);
		formToolkit.adapt(btnDivorced, true, true);
		btnDivorced.setText("Divorced");

		Button btnWidowed = new Button(this, SWT.RADIO);
		btnWidowed.setBounds(186, 128, 115, 21);
		formToolkit.adapt(btnWidowed, true, true);
		btnWidowed.setText("Widowed");

		Button btnSingle = new Button(this, SWT.RADIO);
		btnSingle.setBounds(324, 128, 115, 21);
		formToolkit.adapt(btnSingle, true, true);
		btnSingle.setText("Single");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
