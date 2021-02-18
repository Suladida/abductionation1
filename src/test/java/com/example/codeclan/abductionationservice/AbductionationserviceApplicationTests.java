package com.example.codeclan.abductionationservice;

import com.example.codeclan.abductionationservice.models.Abductee;
import com.example.codeclan.abductionationservice.models.Species;
import com.example.codeclan.abductionationservice.repositories.AbducteeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AbductionationserviceApplicationTests {

	@Autowired
	AbducteeRepository abducteeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createAbductee(){
		Abductee human001 = new Abductee(Species.HUMAN, 75.0, 0.5);
		Abductee decapodian001 = new Abductee(Species.DECAPODIAN, 100.0, 0.1);
		Abductee omecronian001 = new Abductee(Species.OMECRONIAN, 150.0, 0.9);
		abducteeRepository.save(human001);
		abducteeRepository.save(decapodian001);
		abducteeRepository.save(omecronian001);
//		assertEquals("HUMAN", human001.getSpecies().toString());
	}

}
