package com.example.QuickPoll.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.QuickPoll.model.Poll;
import com.example.QuickPoll.model.PollOption;

@Repository
public class PollRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
//	Insert Poll Questions
	public int createPoll(Poll poll) {
		return jdbcTemplate.update("INSERT INTO poll(question, status) values(?,?)", 
				poll.getQuestion(), poll.getStatus());
	}

	
//	Insert poll options
	public int createPollOptions(PollOption pollOption) {
		return jdbcTemplate.update("INSERT INTO PollOption(pollId, optionText, voteCount) VALUES(?,?,0)",
				pollOption.getPollId(), pollOption.getOptionText() );
	}
	
	
//	View All Poll Questions
	public List<Poll> viewPolls(){
		return jdbcTemplate.query("SELECT * FROM poll",
				(rs, rowNum) -> {
					Poll p = new Poll();
					p.setId(rs.getInt("Id"));
					p.setQuestion(rs.getString("question"));
					p.setStatus(rs.getString("status"));
					return p;
				}
				
				);
	}
	
	
//	View options of a poll
//	@SuppressWarnings("deprecation")
	public List<PollOption> viewOptionsByPollId(int pollId){
		return jdbcTemplate.query("SELECT * FROM PollOption WHERE pollId = ?",
				new Object[]{pollId},
				(rs, rowNum) -> {
					PollOption p1 = new PollOption();
					p1.setId(rs.getInt("id"));
					p1.setPollId(rs.getInt("pollId"));
					p1.setOptionText(rs.getString("optionText")); 
					p1.setVoteCount(rs.getInt("voteCount"));
					return p1;
				});
	}
	
	
//	Vote
	public int vote(int optionId) {
		return jdbcTemplate.update("UPDATE PollOption SET voteCount = voteCount+ 1 WHERE id = ?",
				optionId);
	}
	
	
	
}
