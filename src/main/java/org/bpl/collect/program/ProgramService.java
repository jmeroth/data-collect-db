package org.bpl.collect.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {
	
	@Autowired
	private ProgramRepository programRepository;
	
	public List<Program> getAllPrograms(String branchId){
		List<Program> programs = new ArrayList<>();
		programRepository.findByBranchId(branchId)
		.forEach(programs::add);    // Method Reference, Lambda Expressions
		return programs;
	}
	
	public Optional<Program> getProgram(String id) {
		// use streams and lambda expression
		// return programs.stream().filter(t -> t.getId().contentEquals(id)).findFirst().get();
		return programRepository.findById(id);
	}

	public void addProgram(Program program) {
		programRepository.save(program);
	}

	public void updateProgram(Program program) {
		programRepository.save(program);
	}

	public void deleteProgram(String id) {
		programRepository.deleteById(id);
	}

}
