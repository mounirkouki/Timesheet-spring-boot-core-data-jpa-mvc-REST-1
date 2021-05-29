package tn.esprit.spring.services;

import java.text.ParseException;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EmployeServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {

	
	@Autowired
	EmployServiceImpl empS;
	@Test
	public void testAddEmploye() throws parseException{
		Employe e= new Emplpye("azerty","ben qwerty","azerty@qwerty.com",true,Role.ADMINiSTRATEUR);
		Employe eadd=empS.ajouterEmploye(e);
		Assert.assertEquals(e.getEmail(),eadd.getEmail());
	}
	
}
