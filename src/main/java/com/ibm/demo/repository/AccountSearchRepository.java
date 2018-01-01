package com.ibm.demo.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ibm.demo.model.Account;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

//import com.ibm.demo.config.SpringMongoConfig;

@Repository
@Service
public class AccountSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@HystrixCommand(fallbackMethod = "failService")
	public Account searchuid(String userid,String password) {
		/*
		System.out.println("uid="+userid);
		Query query2 = new Query();
		query2.addCriteria(Criteria.where("PhNo").is(userid));
		
		Account account = mongoTemplate.findOne(query2, Account.class);
        
		System.out.println("uid="+account.getPhone());
		return account;
		*/
		
		//ApplicationContext ctx =
               // new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        // MongoOperations mongoOperation =
             //   (MongoOperations) ctx.getBean("mongoTemplate");

/*
List<Account> account = new ArrayList<Account>();

Account acc1 = new Account("9830553821", "password1","A001","Prosenjit Das");
Account acc2 = new Account("9836163226", "password2","A002","Soumen Dhar");
account.add(acc1);
account.add(acc2);
//mongoOperation.insert(account, Account.class);

mongoTemplate.insert(account, Account.class);
*/
         
//search


Query query2 = new Query();
query2.addCriteria(Criteria.where("phone").is(userid).and("password").is(password));


Account userTest2 = mongoTemplate.findOne(query2,Account.class);
//System.out.println("query2 - " + query2.toString());

if(userTest2!=null)
{
//System.out.println("userTest1 - " + userTest2.getPhone());
	
	return userTest2;

}
else
{
	return null;
}
	}
	
	private Account failService(String userid,String password) {
        return null;
    }
	
}
