package com.files;

import java.io.IOException;

public class QuizMain {

	public static void main(String[] args) throws InterruptedException, IOException {

		PlayerManager playerManager = new PlayerManager();
		Player player = playerManager.getPlayer();
		System.out.println("Welcome " + player.getName());

		QuizFileManager quizFileManager = new QuizFileManager();
		QuestionAndAnswers questionAndAnswers = quizFileManager.getQuestionAndAnswer();

		QuizMaster quizMaster = new QuizMaster();
		quizMaster.playQuiz(questionAndAnswers, player);
	}
}
