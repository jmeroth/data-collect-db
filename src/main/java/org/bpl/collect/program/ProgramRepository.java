package org.bpl.collect.program;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProgramRepository extends CrudRepository<Program, String> {
	
	public List<Program> findByBranchId(String branchId);  // findByName -follow this format
	
}
