import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*public class BookDelete {

	private JFrame frame;
	JLabel lblYesDeleteIt, lblNo;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookDelete window = new BookDelete();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
/*	public BookDelete() {
		initialize();
		frame.setVisible(true);

	}

	/**
	 * Initialize the contents of the frame.
	 */
/*	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(229,252,194));
		frame.getContentPane().setLayout(null);
		
		JLabel lblAreYouSure = new JLabel("Are you sure?");
		lblAreYouSure.setFont(new Font("Century Gothic", Font.PLAIN, 23));
		lblAreYouSure.setBounds(147, 68, 216, 38);
		frame.getContentPane().add(lblAreYouSure);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(new Color(153, 153, 153));
		panel.setBounds(70, 167, 130, 30);
		frame.getContentPane().add(panel);
		
		 lblYesDeleteIt = new JLabel("Yes");
		lblYesDeleteIt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblYesDeleteIt.setForeground(new Color(255, 255, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblYesDeleteIt.setForeground(new Color(0, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblYesDeleteIt.setHorizontalAlignment(SwingConstants.CENTER);
		lblYesDeleteIt.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblYesDeleteIt.setBounds(0, 0, 130, 30);
		panel.add(lblYesDeleteIt);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBounds(270, 167, 130, 30);
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
				frame.dispose();
			}
		});
		lblNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNo.setBounds(0, 0, 130, 30);
		panel_1.add(lblNo);
		frame.setBounds(100, 100, 466, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}  */
