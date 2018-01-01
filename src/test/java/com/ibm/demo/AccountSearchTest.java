package com.ibm.demo;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.test.context.web.WebAppConfiguration;





import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.demo.repository.AccountSearchRepository;



//@RunWith(JUnit4.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MobileLoginApplication.class)
@WebAppConfiguration
public class AccountSearchTest {

	@Autowired
	AccountSearchRepository accountSearchRepository;
	

	@Test
    public void testAccountSearch()
    
    
    {
		
		
        Assert.assertEquals("Prosenjit Das", accountSearchRepository.searchuid("9830553821","password1").getname());
        
        return;
    }
}
