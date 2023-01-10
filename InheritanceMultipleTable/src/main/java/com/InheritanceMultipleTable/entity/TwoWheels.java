package com.InheritanceMultipleTable.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Entity;
import javax.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@Getter
@Setter
@NoArgsConstructor
@AttributeOverrides ({
	@AttributeOverride(name="vid", column=@Column(name="vid")),
	@AttributeOverride(name="fuel", column=@Column(name="fuel")),
	@AttributeOverride(name="engine", column=@Column(name="engine")),
	@AttributeOverride(name="vtype", column=@Column(name="vtype")),
	@AttributeOverride(name="price", column=@Column(name="price")),
	@AttributeOverride(name="speed", column=@Column(name="speed"))
})
public class TwoWheels extends Vehicle{
	private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
	
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public boolean isAbs() {
		return abs;
	}
	public void setAbs(boolean abs) {
		this.abs = abs;
	}
	public int getTyretype() {
		return tyretype;
	}
	public void setTyretype(int tyretype) {
		this.tyretype = tyretype;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
		
	}
}
