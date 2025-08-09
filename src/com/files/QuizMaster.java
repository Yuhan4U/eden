package com.files;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class QuizMaster {

	private AtomicBoolean timeOverFlag = new AtomicBoolean(false);
	private Timer timer = null;

	public void playQuiz(QuestionAndAnswers questionAndAnswers, Player player)
			throws InterruptedException, IOException {
		System.out.println("Hello " + player.getName());
		int questionCount = 0;
		while (questionCount <= 11) {
			QuestionAndAnswer questionAndAnswer = questionAndAnswers.getQuestionAndAnswer();
			System.out.println(questionCount + "." + questionAndAnswer.getQuestion());
			System.out.println("1." + questionAndAnswer.getOption1());
			System.out.println("2." + questionAndAnswer.getOption2());
			System.out.println("3." + questionAndAnswer.getOption3());
			String ans = "";
			Scanner input = new Scanner(System.in);
			ans = input.nextLine();
			if (ans.equals(questionAndAnswer.getAnswer())) {
				player.addScore(1);
				System.out.println("GREAT... CORRECT ANSWER");
				timeOverFlag.set(false);

			} else {
				player.reduceScore(1);
				System.out.println("OOPS... WRONG ONE. CORRECT ONE IS " + correctAnswer(questionAndAnswer));
			}
			// timer.stopTimer();

			questionCount++;

		}
		System.out.println(" SCORE OF " + player.getName() + " : " + player.getScore());
		QuizFileManager fileManager = new QuizFileManager();
		fileManager.detail(player);
		List<Player> players = fileManager.getPayers();
		List<Player> topPlayers = getTop(players, 3);
		System.out.println("TOP SCORES");
		for (Player top : topPlayers) {
			System.out.println(top.getName() + " " + top.getScore());
		}
	}

	private List<Player> getTop(List<Player> players, int top) {
		players.sort(Comparator.comparingInt(Player::getScore).reversed());
		List<Player> topPlayes = new ArrayList<Player>();
		for (int i = 0; i < top; i++) {
			if (players.size() >= i) {
				topPlayes.add(players.get(i));
			}

		}
		return topPlayes;
	}

	public void startTimer() {
		timer = new Timer(this);
		timer.reset();
		timer.start();

	}

	private String correctAnswer(QuestionAndAnswer question) {
		switch (question.getAnswer()) {
		case "1": {
			return question.getOption1();
		}
		case "2": {
			return question.getOption2();
		}
		case "3": {
			return question.getOption3();
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + question);
		}
	}

//	public void timeOver() 
//		System.out.println("TIME OVER");
//		this.timeOverFlag.set(true);

}
