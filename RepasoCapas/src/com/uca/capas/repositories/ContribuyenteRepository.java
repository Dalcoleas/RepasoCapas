package com.uca.capas.repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uca.capas.domain.Contribuyente;

public interface ContribuyenteRepository extends JpaRepository<Contribuyente, Integer>{
	
	
	@Modifying(clearAutomatically = true)
	@Query (value="insert into public.contribuyente(s_nombre, s_apellido, s_nit, c_importancia) values (:nombre,:apellido,:nit,:importancia)", nativeQuery= true)
	public int insert(@Param("nombre") String nombre, @Param("apellido") String apellido, @Param("nit") String nit, @Param("importancia") Integer importancia);
}
