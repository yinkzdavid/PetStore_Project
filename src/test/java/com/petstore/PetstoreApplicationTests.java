package com.petstore;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.petstore.model.Pet;
import com.petstore.model.Store;
import com.petstore.repository.PetRepository;

@SpringBootTest
class PetstoreApplicationTests {
	
	Logger logger = Logger.getLogger(getClass().getName());

	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private StoreRepository storeRepository;
	
	
	@Test
	void contextLoad() {
		
		assertThat(petRepository).isNotNull();
		assertThat(petRepository).isNotNull();
			
	}
	
	@Test
	void savePetToStore() {
		
		Store store = new Store();
		store.setLocation("Yaba");
		store.setName("PetLovers");
		
		Pet dowry = new Pet();
		dowry.setColor("Brown");
		dowry.setName("dowry");
		dowry.setType("cat");
		
		List<Pet> pets = new ArrayList<Pet>;
		
		
	}

}
