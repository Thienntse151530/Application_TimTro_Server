package com.fpt.timtro.timtro_server.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "nha_tro")
@Entity
public class HostelModel {
	
	@Column(name = "id_nhatro")
	@Id @GeneratedValue private Integer idHostel;
	
	@Column(name = "name_nhatro")
	private String nameHostel;
	
	@Column(name = "address_nhatro")
	private String addressHostel;
	
	@Column(name = "manager_nhatro")
	private String managerHostel;
	
	@Column(name = "total_typeroom")
	private Integer totalTypeRoom;
	
	@Column(name = "total_room")
	private Integer totalRoom;
	
	@Column(name = "image_nhatro")
	 private String imgHostels;

    public String getImgHostels() {
        return imgHostels;
    }

    public void setImgHostels(String imgHostels) {
        this.imgHostels = imgHostels;
    }
	public Integer getIdHostel() {
		return idHostel;
	}
	public void setIdHostel(Integer idHostel) {
		this.idHostel = idHostel;
	}
	public String getNameHostel() {
		return nameHostel;
	}
	public void setNameHostel(String nameHostel) {
		this.nameHostel = nameHostel;
	}
	public String getAddressHostel() {
		return addressHostel;
	}
	public void setAddressHostel(String addressHostel) {
		this.addressHostel = addressHostel;
	}
	public String getManagerHostel() {
		return managerHostel;
	}
	public void setManagerHostel(String managerHostel) {
		this.managerHostel = managerHostel;
	}
	public Integer getTotalTypeRoom() {
		return totalTypeRoom;
	}
	public void setTotalTypeRoom(Integer totalTypeRoom) {
		this.totalTypeRoom = totalTypeRoom;
	}
	public Integer getTotalRoom() {
		return totalRoom;
	}
	public void setTotalRoom(Integer totalRoom) {
		this.totalRoom = totalRoom;
	}
	
	
}
