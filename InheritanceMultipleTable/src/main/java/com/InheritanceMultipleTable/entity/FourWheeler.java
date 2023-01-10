package com.InheritanceMultipleTable.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

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
public class FourWheeler extends Vehicle{
	private int modelno;
	private String modelname;
	private boolean musicSystem;
	private String etype;
	private boolean ac;
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
	public boolean isMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(boolean musicSystem) {
		this.musicSystem = musicSystem;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
}
