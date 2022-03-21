package com.fpt.timtro.timtro_server.controllers.hostel;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.timtro.timtro_server.models.HostelModel;
import com.fpt.timtro.timtro_server.models.MessageAddress;
import com.fpt.timtro.timtro_server.repo.HostelRepository;

@RestController
public class ListHostelController{
	private final HostelRepository hostelRepository;

	  ListHostelController(HostelRepository hostelRepository) {
	    this.hostelRepository = hostelRepository;
	  }
	  
	 @GetMapping("/getHostel")
	 @ResponseBody
	 List<HostelModel> getListOfHostels(){
		 hostelRepository.getListOfHostels();
		 return hostelRepository.findAll();
	 }
//	 String strMessAddress = null;
//	 @PutMapping("/putAddress")
//	 MessageAddress  putAddress(@RequestBody MessageAddress messageAddress) {
//		 strMessAddress = messageAddress.getMessage();
//	    return messageAddress;
//	  }
	 
	 @GetMapping("/getHostelsByAddress")
	 @ResponseBody
	 List<HostelModel> getListOfHostelsByAddress(@Param(value = "value") String value){
		 System.out.println("value getHostelByAddress:"+value);
		 List<HostelModel> hostelModels = hostelRepository.getListOfHostelsByAddress(value);
		 System.out.println("List of HostelAddress:"+hostelModels.toString());
		 return hostelModels;
	 }

}
