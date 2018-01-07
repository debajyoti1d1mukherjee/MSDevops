package com.ibm.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.demo.model.offerService;
//Test pipeline
//in jenkins
 interface offerMongoRepository extends CrudRepository<offerService, String>{}