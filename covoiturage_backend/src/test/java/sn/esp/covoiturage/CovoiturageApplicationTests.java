package sn.esp.covoiturage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import sn.esp.covoituragebackend.CovoiturageApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CovoiturageApplication.class)
@WebAppConfiguration
public class CovoiturageApplicationTests {

	@Test
	public void contextLoads() {
	}

}
