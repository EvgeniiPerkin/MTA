package com.perkin.dev.domain;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_user")
public class User {
	/**идентификато пользователя*/
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long userId;
	
	/**имя пользователя*/
	@NotNull
	@Column(name = "username")
	@Length(max = 20, message = "The username terms is too long (more than 200)")
	private String username;

	/**имя пользователя*/
	@NotNull
	@Column(name = "password")
	@Length(max = 20, message = "The password terms is too long (more than 200)")
	private String password;
	
	/**активность*/
	@Column(name = "active")
	private Boolean active;
	
	@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "е_user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
	private Set<Role> roles;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
