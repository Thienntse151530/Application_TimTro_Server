package com.fpt.timtro.timtro_server.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Table(name = "_user")
@Entity
public class UserModel {
	@Column(name = "id_user")
	@Id @GeneratedValue @Getter @Setter  Integer id;
	

	@Column(name = "full_name")
	@Getter @Setter String name;

	
}
