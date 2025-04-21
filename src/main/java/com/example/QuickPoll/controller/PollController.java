package com.example.QuickPoll.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuickPoll.model.Poll;
import com.example.QuickPoll.model.PollOption;
import com.example.QuickPoll.repository.PollRepository;

@RestController
@RequestMapping("/poll")
public class PollController {
		
	
	@Autowired
	private PollRepository pollRepo;
	
	
//	Save Poll questoin
	@PostMapping("/addPoll")
	public String savePoll(@RequestBody Poll poll) {
		pollRepo.createPoll(poll);
		return "Poll added successfully";
	}
	
	
//Save poll Options
	@PostMapping("/addOption")
	public String savePollOptions(@RequestBody PollOption pollOptiion) {
		pollRepo.createPollOptions(pollOptiion);
		return "Poll option added";
	}
	
//	View Poll Questions
	@GetMapping("/viewAllPolls")
	public List<Poll> getPoll() {
		return pollRepo.viewPolls();
	}
	
	
	
//	View PollOptions by poll Id
	@GetMapping("/viewOptions/{pollId}")
	public List<PollOption> getOptions(@PathVariable int pollId){
		return pollRepo.viewOptionsByPollId(pollId);
	}
	
	
//	Vote
	@PostMapping("/vote")
	public String doVote(@RequestBody Map<String, Integer> data) {
		int optionId = data.get("optionId");
		pollRepo.vote(optionId);
		return "Vote Recorded..!";
	}
	
}
