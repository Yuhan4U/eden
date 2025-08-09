package com.files;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionAndAnswers {
	ArrayList<Integer> sc = new ArrayList<>();
	private List<QuestionAndAnswer> allQuestionAndAnswers = new ArrayList<QuestionAndAnswer>();

	public void addQuestionAndAnswer(QuestionAndAnswer questionAndAnswer) {
		allQuestionAndAnswers.add(questionAndAnswer);
	}

	public List<QuestionAndAnswer> getAllQuestionAndAnswers() {
		return allQuestionAndAnswers;
	}

	public void setAllQuestionAndAnswers(List<QuestionAndAnswer> allQuestionAndAnswers) {
		this.allQuestionAndAnswers = allQuestionAndAnswers;
	}

	public QuestionAndAnswer getQuestionAndAnswer() {
	
		int limit = allQuestionAndAnswers.size();
		Random rand = new Random();
		int randomNumber = rand.nextInt(0, limit);
		while (sc.contains(randomNumber)) {
			 randomNumber = rand.nextInt(0, limit);			
		}
		 sc.add(randomNumber);
		
		return allQuestionAndAnswers.get(randomNumber);
	
	}

}
