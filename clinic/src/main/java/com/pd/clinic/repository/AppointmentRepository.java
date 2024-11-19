package com.pd.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pd.clinic.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String>{

	@Query(value ="select * from m_appointment where id=:id",nativeQuery = true)
	Appointment findByAppointmentId(@Param("id") String id);

	@Transactional
	@Modifying
	@Query(value = "delete from m_appointment where id=:id", nativeQuery = true)
	int deleteByAppointmentId(String id);

	
}
