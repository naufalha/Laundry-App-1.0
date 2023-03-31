package com.laundry.PBOmaven;

import applaundry.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.io.*;
import java.security.Permissions;

@SpringBootApplication
public class PboMavenApplication  {
	@Autowired
	public EmailSender senderService;

	public static void main(String[] args) throws Exception  {
		System.out.println("loading data......");
		MenuUtama home = new MenuUtama();
		home.setVisible(true);

		//creating object output stream
		//code maul = new code();
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("database"));
		//oos.writeObject(maul);

		//code firstcode = new code();
		//oos.writeObject(firstcode);



	}
	@EventListener(ApplicationReadyEvent.class)

		public void sendMail(){
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("email"));
			Customer M2 = (Customer) in.readObject();

			//senderService.sendEmail(Email,"ini tes email",bodytest);
			senderService.sendEmail(M2.getEmail(), "Laundry anda telah selesai","hai "+M2.getNama()+" laundry anda telah selesai silahkan ambil"+"\n"+
					"Nama : "+M2.getNama()+"\n"+
					"Kode pengambilan : "+M2.getCode()+"\n"+
					"Email : "+M2.getEmail()+"\n"+
					"Total : Rp."+M2.getTotal());
			File file = new File("email");
			file.delete();

		} catch (Exception e) {
			e.printStackTrace();

			// handle exception correctly.
		}



	}
}
