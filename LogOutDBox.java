import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogOutDBox {

	private JFrame frame;
	JLabel label_1,lblNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogOutDBox window = new LogOutDBox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogOutDBox() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255,224,210));
		frame.setBounds(100, 100, 499, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		Panel panel = new Panel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LibrarianMain librarian = new LibrarianMain();
            	frame.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				//panel.setForeground(new Color(255, 255, 0));

			}
		});
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBounds(298, 181, 130, 30);
		frame.getContentPane().add(panel_1);
		
		 lblNo = new JLabel("No");
		lblNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNo.setForeground(new Color(255, 255, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNo.setForeground(new Color(0, 0, 0));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
            	frame.setVisible(false);

			}
		});
		lblNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNo.setBounds(0, 0, 130, 30);
		panel_1.add(lblNo);
		panel.setLayout(null);
		panel.setBackground(new Color(153, 153, 153));
		panel.setBounds(69, 181, 130, 30);
		frame.getContentPane().add(panel);
		
		 label_1 = new JLabel("Yes");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setForeground(new Color(255, 255, 0));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setForeground(new Color(0, 0, 0));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
            	frame.setVisible(false);
            	entry_page logout = new entry_page();
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label_1.setBounds(0, 0, 130, 30);
		panel.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		label.setBounds(0, 0, 493, 277);
		frame.getContentPane().add(label);
		
		JLabel lblDoYouReally = new JLabel("Do you really want to log out? ");
		lblDoYouReally.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		lblDoYouReally.setBounds(103, 45, 287, 47);
		frame.getContentPane().add(lblDoYouReally);
	}
}
