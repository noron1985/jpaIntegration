package com.ronald;

import com.ronald.oneToMany.Owner;
import com.ronald.oneToMany.Phone;
import com.ronald.oneToOneBi.Client;
import com.ronald.oneToOneBi.CreditCard;
import com.ronald.oneToOneUni.Address;
import com.ronald.oneToOneUni.Customer;
import com.ronald.repository.dao.ClientRepository;
import com.ronald.repository.dao.CustomerRepository;
import com.ronald.repository.dao.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
public class OneToOneUniApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneUniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");

		// one to one unidirectionnel Customer -> Address
		customerRepository.save(new Customer(new Address("Rue de camille vandervost", 1)));
		// one to one bidirectionnel Client <-> Credicard
		clientRepository.save(new Client(new CreditCard(445661213)));

		// one to many unidirectionnal Owner -> *Phone
		Phone phone1 = new Phone("0484-724-123");
		Phone phone2 = new Phone("0484-111-222");
		Phone phone3 = new Phone("0484-333-444");
		Collection<Phone> phones = new ArrayList<>();
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);
		ownerRepository.save(new Owner("ronald", phones));

		/*second way
		Phone[] phones1 = {
				new Phone("0484.111.123"),
				new Phone("0484.445.123"),
				new Phone("0484.999.541")};
		Owner owner = new Owner("toto", new ArrayList<Phone>(Arrays.asList(phone1)));
		ownerRepository.save(owner);*/

	}
}
