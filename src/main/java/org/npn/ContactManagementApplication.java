package org.npn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.npn.dao.ContactRepository;
import org.npn.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactManagementApplication implements CommandLineRunner{
	
	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				
		contactRepository.save((new Contact("AKo","Kemson",df.parse("21/12/1955"),"tom@yahoo.fr",25234523L,"picture6.jpeg")));
		contactRepository.save((new Contact("BaBlla","Ballon",df.parse("22/11/1978"),"alain@yahoo.fr",15234523L,"picture7.jpeg")));
		contactRepository.save((new Contact("TiCaul","Fentoi",df.parse("23/10/1968"),"paul@yahoo.fr",35234523L,"picture8.jpeg")));
		contactRepository.save((new Contact("ViDouni","Moustaphan",df.parse("24/05/1998"),"jouni@yahoo.fr",45234523L,"picture9.jpeg")));
		contactRepository.save((new Contact("WaGelen","Tomson",df.parse("25/04/1998"),"helene@yahoo.fr",55234523L,"picture10.jpeg")));
			
		contactRepository.findAll().forEach(x-> System.out.println(x.getLastName()));
*/
			
		
	}
}
