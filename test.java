import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {
		
		Robot robo = new Robot();
		Scanner input = new Scanner(System.in);
		
		int x = 10;
		
		System.out.println("Digite seu texto");
		String texto = input.nextLine();
		
		StringSelection string = new StringSelection(texto);
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(string, null);
		
		System.out.println("O spam vai come�ar em 10 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 9 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 8 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 7 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 6 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 5 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 4 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 3 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 2 seg");
		Thread.sleep(1000);
		System.out.println("O spam vai come�ar em 1 seg");
		Thread.sleep(1000);
		System.out.println("Come�ando");
		
		
		
		while(x <= 10) {
			
			Thread.sleep(2000);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
			
		}
		
				
		
	}

}
