package com.example.QuickPoll.model;

public class PollOption {
	private int id;
	private int pollId;
	private String optionText;
	private int voteCount;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setPollId(int pollId) {
		this.pollId = pollId;
	}
	public int getPollId() {
		return pollId;
	}
	
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	public String getOptionText() {
		return optionText;
	}
	
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	public int getVoteCount() {
		return voteCount;
	}
}
