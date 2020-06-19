package com.example.SpringDataRest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Engineer {

	@Id
	@GeneratedValue
	private int eid;
	private String eName;
	private String eLang;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteLang() {
		return eLang;
	}

	public void seteLang(String eLang) {
		this.eLang = eLang;
	}

	@Override
	public String toString() {
		return "Engineer [eid=" + eid + ", eName=" + eName + ", eLang=" + eLang + "]";
	}

}
