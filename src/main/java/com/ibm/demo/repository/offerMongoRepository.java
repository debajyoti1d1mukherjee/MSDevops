package com.ibm.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.demo.model.offerService;


////////////
////Repository////////////////s
 interface offerMongoRepository extends CrudRepository<offerService, String>{}