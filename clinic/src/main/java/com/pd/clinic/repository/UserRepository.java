package com.pd.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pd.clinic.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	@Query(value ="select * from user where id:userId",nativeQuery = true)
	User findByUserId(@Param("userId") String UserId);

	@Transactional
	@Modifying
	@Query(value = "delete from user where id=:userId", nativeQuery = true)
	int deleteByUserId(@Param("userId") String userId); 

}
