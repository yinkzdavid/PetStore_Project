package com.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petstore.model.Store;

@Repository
public interface StoreRespository extends JpaRepository<Store, Integer> {

}
