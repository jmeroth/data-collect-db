package org.bpl.collect.branch;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@RequestMapping("/branches")
	public List<Branch> getAllBranches() {
		return branchService.getAllBranches();
	}
	

	@RequestMapping("/branches/{id}")
	public Optional<Branch> getBranch(@PathVariable String id) {
		return branchService.getBranch(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/branches")
	public void addBranch(@RequestBody Branch branch) {
		branchService.addBranch(branch);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/branches/{id}")
	public void updateBranch(@RequestBody Branch branch, @PathVariable String id) {
		branchService.updateBranch(id, branch);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/branches/{id}")
	public void deleteBranch(@PathVariable String id) {
		branchService.deleteBranch(id);
	}
	


}
