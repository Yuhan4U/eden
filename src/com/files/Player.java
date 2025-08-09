package com.files;

public class Player {
	private String name;
	private int score=1;
	
	public void addScore(int score) {
		this.score=this.score+score;
	}
	public void reduceScore(int score) {
		this.score=this.score-score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
