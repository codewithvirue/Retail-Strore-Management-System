package com.retailstore.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users_table" , uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	

	@Column(name = "last_name")
    private String lasttName;

    @Column()
	private String email;
	
    @Column(nullable = false, length = 64)
	private String passward;	
	
    @ManyToMany(fetch =FetchType.EAGER , cascade = CascadeType.ALL)
    @JoinTable(
    		name ="users_roles",
    		joinColumns = @JoinColumn(
    				
    				name = "user_id" , referencedColumnName = "id"),
    			inverseJoinColumns = @JoinColumn(
    				      name = "role_id" , referencedColumnName = "id"))	
    				

	private Collection<Role> roles;


	public User(String firstName, String lasttName, String email, String passward, Collection<Role> roles) {
		super();
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
		this.passward = passward;
		this.roles = roles;
	}


	


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLasttName() {
		return lasttName;
	}


	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassward() {
		return passward;
	}


	public void setPassward(String passward) {
		this.passward = passward;
	}


	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
    
    
    
	
}	