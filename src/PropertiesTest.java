package src;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PropertiesTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public  void run(){
				PropertiesFrame frame = new PropertiesFrame();
				frame.setVisible(true);
			}
		});
	}
	
}

class PropertiesFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	private File prpopertiesFile;
	private Properties settings;
	
	public PropertiesFrame(){
		String userDir = System.getProperty("user.home");
		File propertiesDir = new File(userDir,".corejava");
		if(!propertiesDir.exists()) propertiesDir.mkdir();
		prpopertiesFile = new File(propertiesDir,"program.properties");
		
		Properties defauleSettings = new Properties();
		defauleSettings.put("left", "0");
		defauleSettings.put("top", "0");
		defauleSettings.put("width", ""+DEFAULT_WIDTH);
		defauleSettings.put("height", ""+DEFAULT_HEIGHT);
		defauleSettings.put("title", "");
		
		settings = new Properties(defauleSettings);
		
		if(prpopertiesFile.exists()) 
		try{
			FileInputStream in = new FileInputStream(prpopertiesFile);
			settings.load(in);
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		int left = Integer.parseInt(settings.getProperty("left"));
		int top = Integer.parseInt(settings.getProperty("top"));
		int width = Integer.parseInt(settings.getProperty("width"));
		int height = Integer.parseInt(settings.getProperty("height"));
		setBounds(left,top,width,height);
		
		String title = settings.getProperty("title");
		if(title.equals("")) title = JOptionPane.showInputDialog("Please supply a frame title:");
		if(title == null) title = "";
		setTitle(title);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent event){
				settings.put("left", ""+ getX());
				settings.put("top", ""+ getY());
				settings.put("width", ""+ getWidth());
				settings.put("height", ""+ getHeight());
				settings.put("title", ""+ getTitle());
				try{
					FileOutputStream out = new FileOutputStream(prpopertiesFile);
					settings.store(out, "Program Proerties");
				}catch (IOException ex){
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
	}
}
