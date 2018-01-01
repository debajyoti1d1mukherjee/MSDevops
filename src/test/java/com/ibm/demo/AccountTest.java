package com.ibm.demo;
import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ibm.demo.model.Account;

@RunWith(JUnit4.class)
public class AccountTest {
	
	@Test
    public void testAccount()
    {
		Account acc = new Account();
		acc.setId("123");
		acc.setPhone("9830553821");
		acc.setaccId("A001");
		acc.setname("Prosenjit Das");
		acc.setPassword("password1");

   
        String id = acc.getId();
        Assert.assertNotNull(id);

       

        Assert.assertEquals("9830553821", acc.getPhone());
        Assert.assertEquals("password1", acc.getPassword());
        Assert.assertEquals("A001", acc.getaccId());
        Assert.assertEquals("Prosenjit Das", acc.getname());
        return;
    }

}
