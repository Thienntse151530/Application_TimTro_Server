package com.fpt.timtro.timtro_server.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fpt.timtro.timtro_server.models.HostelModel;

public interface HostelRepository extends JpaRepository<HostelModel, Integer>{

	//Get data of nha tro from table nha tro in database
		@Query(value = "SELECT * FROM nha_tro", nativeQuery = true)
		List<HostelModel> getListOfHostels();
		
		@Query(value = "SELECT * FROM [Project_NhaTro_PRM].[dbo].[nha_tro] WHERE address_nhatro like CONCAT('%', :address,'%') COLLATE Vietnamese_CI_AI", nativeQuery = true)
		List<HostelModel> getListOfHostelsByAddress(@Param("address") String address);
}
