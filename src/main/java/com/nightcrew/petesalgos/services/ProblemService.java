package com.nightcrew.petesalgos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nightcrew.petesalgos.models.Problem;
import com.nightcrew.petesalgos.repositories.ProblemRepository;

@Service
public class ProblemService {
  private final ProblemRepository problemRepo;

  public ProblemService(ProblemRepository problemRepo){
    this.problemRepo = problemRepo;
  }

  // list all problems
  public List<Problem> allProblems(){
    return problemRepo.findAll();
  }
  //Create problem
  
  public Problem createProblem(Problem problem) {
    return problemRepo.save(problem);
  }
  
  //Retrieves one problem
  
  public Problem getProblem(Long id) {
    Optional<Problem> optionalProblem = problemRepo.findById(id);
    
  //	checking to see if the problem is in the DB
    if(optionalProblem.isPresent()) {
      return optionalProblem.get();
    }
    else {
      return null;
    }
  }


  //edit name

public Problem editProblem(Problem problem) {
	return problemRepo.save(problem);
}

//Delete Name

public void deleteProblem(Long id) {
	problemRepo.deleteById(id);
}







}