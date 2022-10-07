package sifreUretici;
import javax.swing.*;
import java.awt.*;
public class sifreuretici {

	public static void main(String[] args) {

		String dizi[] =
			{
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
				"P","Q","R","S","T","U", "V","W","Y","Z",
				"X","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","y","z","x","0","1","2","3","4","5","6","7","8","9","0","*","+","-","&","%","_","?","@","^"
				};
				
				String cikti = "Üretilen Şifre: ";
				
		JTextArea mesaj = new JTextArea(2,1);
		
		int boyut = Integer.parseInt(JOptionPane.showInputDialog("Not: En fazla 15 karakter uzunluk girebilirsiniz.\nSifre uzunlugu girin.",10));
		
		while(cikti != null) {
			if(boyut >0 && boyut < 15) {
				for(int i = 0; i < boyut; i++) {
					
					int rastgele = (1+(int) (Math.random()*65));
					
					cikti += dizi[rastgele];
				}
			}
			mesaj.setText(cikti);
			
			mesaj.setFont(new Font("Consolas", Font.BOLD, 14));
			
			JOptionPane.showMessageDialog(null, mesaj);
			
			cikti = "Üretilen Şifre: ";
			
			String goster = JOptionPane.showInputDialog(null,"Çıkmak için X girin.\nYeni şifre için Ok tıklayın.");
			
			if(goster == null || goster.equals("X"))
				
			break;
		}
	}

}
