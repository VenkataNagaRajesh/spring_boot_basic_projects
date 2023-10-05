package com.example.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {


	@Query(nativeQuery = true,value="select a.id,a.line1,a.line2,a.zipcode,a.state from address a join employee e on e.id=a.id where a.id=:a_id")
	AddressEntity findAddressByEmployeeId(@Param("a_id")int a_id);

}
