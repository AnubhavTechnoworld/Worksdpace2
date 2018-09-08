package com.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity   //(name="Userdetails")//You can use User name of the table by this
// @Table(name="Userdetails")

@NamedQueries({
@NamedQuery(name="getUserById",query="from UserDetails where id=:id"),	
@NamedQuery(name="getAllUsers",query="from UserDetails")
})
@NamedNativeQueries({@NamedNativeQuery(name="getAll",query="select* from userdetails",resultClass=UserDetails.class)
})
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class UserDetails {
	@Id
	@Column(name="User_ID")
	
	@SequenceGenerator(name="myseq",sequenceName="user_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="myseq")
	private int id;
	private String name;
	//@Embedded
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="U_D",joinColumns= {@JoinColumn(name="UserID")})
	
	private List<Address> addresses = new ArrayList<>();
	
	//@Transient
	private String phone;
	private int age;
	private Date dob;
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", addresses=" + addresses + ", phone=" + phone + ", age="
				+ age + ", dob=" + dob + "]";
	}
	


	
	

}
