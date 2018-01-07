package com.ibm.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.demo.model.offerService;
//Test pipeline

 interface offerMongoRepository extends CrudRepository<offerService, String>{}