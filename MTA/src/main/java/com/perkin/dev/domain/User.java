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
}
