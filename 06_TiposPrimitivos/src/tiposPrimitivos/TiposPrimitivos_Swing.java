package tiposPrimitivos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TiposPrimitivos_Swing extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JLabel lblResultado;
	private JLabel lblMais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiposPrimitivos_Swing frame = new TiposPrimitivos_Swing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TiposPrimitivos_Swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtN1 = new JTextField();
		contentPane.add(txtN1, BorderLayout.WEST);
		txtN1.setColumns(10);
		
		lblMais = new JLabel("+");
		contentPane.add(lblMais);
		
		txtN2 = new JTextField();
		contentPane.add(txtN2, BorderLayout.CENTER);
		txtN2.setColumns(10);
		
		lblResultado = new JLabel("0");
		
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1 = Float.parseFloat(txtN1.getText());
				float n2 = Float.parseFloat(txtN2.getText());
				lblResultado.setText(Float.toString(n1+n2));
			}
		});
		
		contentPane.add(btnSoma);
		contentPane.add(lblResultado);	
		
	}

}
