package org.npn.web;

import java.util.List;
import java.util.Optional;

import org.npn.dao.ContactRepository;
import org.npn.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ContactRestService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping("/contacts")
	public List<Contact>getAll(){
		
		return contactRepository.findAll();
	}
	
	@GetMapping("/contacts/{id}")
	public Optional<Contact> getContact(@PathVariable Long id){
		
		return contactRepository.findById(id);
	}
	
	@PostMapping("/contacts")
	public Contact save(@RequestBody Contact c) {
		
		return contactRepository.save(c);
	}
	
	@PutMapping("/contacts/{id}")
	public Contact update(@PathVariable Long id, @RequestBody Contact c) {
		
		c.setId(id);
		
		return contactRepository.save(c);
	}

	@DeleteMapping("/contacts/{id}")
	public void delete(@PathVariable Long id) {
		
		contactRepository.deleteById(id);
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("/findContacts")
	public Page<Contact>find(
			@RequestParam(name="kw",defaultValue="")String kw,
			@RequestParam(name="size",defaultValue="0")int size,
			@RequestParam(name="page",defaultValue="5")int page){
		
		return contactRepository.findByKeyword("%"+kw+"%", new PageRequest(size,page));
	}
		
	
}
