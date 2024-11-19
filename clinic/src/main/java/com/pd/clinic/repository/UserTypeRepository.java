package com.pd.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pd.clinic.entity.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, String>{

	@Query(value ="select * from user_type where id:userId",nativeQuery = true)
	UserType findByUserTypeId(@Param("userId") String UserId);

	@Transactional
	@Modifying
	@Query(value = "delete from user_type where id=:userId", nativeQuery = true)
	int deleteByUserTypeId(@Param("userId") String userId); 

}
