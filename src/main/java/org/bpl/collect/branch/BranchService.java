package org.bpl.collect.branch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
	
	@Autowired
	private BranchRepository branchRepository;
	
	public List<Branch> getAllBranches(){
		List<Branch> branches = new ArrayList<>();
		branchRepository.findAll()
		.forEach(branches::add);    // Method Reference, Lambda Expressions
		return branches;
	}
	
	public Optional<Branch> getBranch(String id) {
		// use streams and lambda expression
		// return branches.stream().filter(t -> t.getId().contentEquals(id)).findFirst().get();
		return branchRepository.findById(id);
	}

	public void addBranch(Branch branch) {
		branchRepository.save(branch);
	}

	public void updateBranch(String id, Branch branch) {
		branchRepository.save(branch);
	}

	public void deleteBranch(String id) {
		branchRepository.deleteById(id);
	}

}
