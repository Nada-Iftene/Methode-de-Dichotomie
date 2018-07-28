import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Dichotomie extends JFrame {
	//la fonction
	public static double f(double x){
		double y = 2*x +(Math.pow(Math.E, x)) - (Math.sqrt(x)) ;
		return y;
	}
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dichotomie frame = new Dichotomie();
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
	public Dichotomie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Methode de DICHOTOMIE");
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(63, 22, 417, 39);
		contentPane.add(lblNewLabel);
		
		JLabel nbriter = new JLabel("");
		nbriter.setFont(new Font("Tahoma", Font.BOLD, 19));
		nbriter.setHorizontalAlignment(SwingConstants.CENTER);
		nbriter.setBounds(338, 188, 142, 39);
		contentPane.add(nbriter);
		
		JLabel racine = new JLabel("");
		racine.setHorizontalAlignment(SwingConstants.CENTER);
		racine.setFont(new Font("Tahoma", Font.BOLD, 19));
		racine.setBounds(338, 256, 142, 39);
		contentPane.add(racine);
		
		JLabel lblNewLabel_1 = new JLabel("La fonction est :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(63, 103, 173, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFxx = new JLabel("f(x) = 2x + ex - \u221A x");
		lblFxx.setHorizontalAlignment(SwingConstants.CENTER);
		lblFxx.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblFxx.setBounds(266, 103, 204, 24);
		contentPane.add(lblFxx);
		
		JButton btnLaRacine = new JButton("La Racine :");
		btnLaRacine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n=0;
				
				double x1 = 2.5;
				double a=2;
				double b=3;
				f(a);f(x1);
				while ((b-a)> 0.005){
					if (f(x1)==0){
						//System.out.println("la racine est" + x1);
						String g = String.valueOf(x1);
						racine.setText(g);
					}
					if ((f(a) * f(x1))<0){
						
						b = x1;
						
					}else{
						a=x1;
					}
					n++;
					x1 = (a+b)/2;
				}
				String g = String.valueOf(x1);
				racine.setText(g);
			}
		});
		btnLaRacine.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		btnLaRacine.setBounds(63, 256, 173, 39);
		contentPane.add(btnLaRacine);
		
		JButton btnNewButton = new JButton("Nombre D'iteration:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int nb_iter =(int) (Math.log((1/0.005))/(Math.log(2)));
				nb_iter++;
				String nb = String.valueOf(nb_iter); 
				nbriter.setText(nb);
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnNewButton.setBounds(63, 188, 173, 39);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}
