package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facility")
public class Service {
	@Id
	@Column(name="service")
	private String service;
	@Column(name="servicedesc")
	private String servicedesc;
	@Column(name="servicepic")
	private String servicepic;
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getServicedesc() {
		return servicedesc;
	}
	public void setServicedesc(String servicedesc) {
		this.servicedesc = servicedesc;
	}
	public String getServicepic() {
		return servicepic;
	}
	public void setServicepic(String servicepic) {
		this.servicepic = servicepic;
	}
	

}
