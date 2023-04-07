package com.laundry.PBOmaven;
import applaundry.*;
import com.laundry.PBOmaven.EmailSender;
import com.laundry.PBOmaven.PboMavenApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Permissions;
import java.io.IOException;
//this file wasnt neccessary anymore just for testing

@SpringBootApplication
public class emailMainclass {
    @Autowired
    public EmailSender senderService;

    public static void main(String[] args) throws Exception  {

        //creating object output stream
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("database"));
        //oos.writeObject(maul);

        //code firstcode = new code();
        //oos.writeObject(firstcode);
        System.out.println("ini main class");


        //SpringApplication.run(emailMainclass.class, args);

    }
    @EventListener(ApplicationReadyEvent.class)

    public void sendMail(){
        
    }
}
