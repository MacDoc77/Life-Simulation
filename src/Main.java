import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main extends JFrame{
	static BufferedImage img = null;
	
	public Main(){
		DrawArea drawArea = new DrawArea(300, 300, img);
		
		
		JFrame main = new JFrame();
		main.setSize(1000, 800);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setVisible(true);
		main.setResizable(false);
		
		main.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weighty = 0.8;
		
		main.add(drawArea, gbc);
		
	}
	
	public static void run(){
		
	}
	public static void main(String[] args){
		try {
		    img = ImageIO.read(new File("images/organism.png"));
		} catch (IOException e) {
			System.out.println("organism.png not found.");
		}
		
		Main simulation = new Main();
	}
}