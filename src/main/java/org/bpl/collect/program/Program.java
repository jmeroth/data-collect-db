package org.bpl.collect.program;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.bpl.collect.branch.Branch;

@Entity
public class Program {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Branch branch;
	
	public Program() {
		
	}
	
	public Program(String id, String name, String description, String branchId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.branch = new Branch(branchId, "", "");
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}


}
