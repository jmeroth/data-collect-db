package org.bpl.collect.program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.bpl.collect.branch.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramController {
	
	@Autowired
	private ProgramService programService;
	
	@RequestMapping("/branches/{id}/programs")
	public List<Program> getAllPrograms(@PathVariable String id) {
		return programService.getAllPrograms(id);
	}
	

	@RequestMapping("/branches/{branchId}/programs/{id}")
	public Optional<Program> getProgram(@PathVariable String id) {
		return programService.getProgram(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/branches/{branchId}/programs")
	public void addProgram(@RequestBody Program program, @PathVariable String branchId) {
		program.setBranch(new Branch(branchId, "", ""));
		programService.addProgram(program);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/branches/{branchId}/programs/{id}")
	public void updateProgram(@RequestBody Program program, @PathVariable String branchId, @PathVariable String id) {
		program.setBranch(new Branch(branchId, "", ""));
		programService.updateProgram(program);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/branches/{branchId}/programs/{id}")
	public void deleteBranch(@PathVariable String id) {
		programService.deleteProgram(id);
	}
	


}
