package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.guests.Guest;

import com.example.demo.service.GuestService;

@RestController
public class GuestController {
	@Autowired
	private GuestService guestService;
	
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public void createguest(@RequestBody Guest guest) {
		guestService.create(guest);
	}

	@RequestMapping("/get")
	public Guest getguest(@RequestParam String firstName) {
		return guestService.getByFirstname(firstName);
	}
	@RequestMapping("/getAll")
	public List<Guest> getAll(){
	return guestService.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String age, @RequestParam String Address, @RequestParam String Aadhar) {
	Guest g = guestService.update(firstName, lastName, age, Address, Aadhar);
			return g.tostring();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName ) {
	guestService.delete(firstName);
	return "Deleted"+firstName;
			
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
	     guestService.deleteAll();
	     return "Deleted All records";
	     
	}
}

	
	