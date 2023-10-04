package com.art.Entities.User;

import org.hibernate.annotations.Nationalized;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserCustom {

	@Id
	private String user_id;

	@ManyToOne
	@JoinColumn(name = "role_name")
	private Role role;
	
	@Column
	@Nationalized
	private String fullname;
	
	@Column
	private String image;
	
	@Column
	private String password;

	@Column
	private String email;
	
	@Column
	private boolean is_del;
}
