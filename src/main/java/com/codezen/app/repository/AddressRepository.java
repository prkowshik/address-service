package com.codezen.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codezen.app.entity.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer>{

}
