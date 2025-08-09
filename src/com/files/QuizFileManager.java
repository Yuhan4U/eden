package com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuizFileManager {
	ArrayList<Integer> y = new ArrayList<>();
	private final String FILE_PATH = "./quiz/quiz.txt";
	private final String SCORE_PATH = "./quiz/score.txt";

	public QuestionAndAnswers getQuestionAndAnswer() {
		QuestionAndAnswers questionAndAnswers = new QuestionAndAnswers();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
			String line;

			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				String[] columns = line.split(",");
				QuestionAndAnswer questionAndAnswer = new QuestionAndAnswer();
				questionAndAnswer.setQuestion(columns[0]);
				questionAndAnswer.setOption1(columns[1]);
				questionAndAnswer.setOption2(columns[2]);
				questionAndAnswer.setOption3(columns[3]);
				questionAndAnswer.setAnswer(columns[4]);
				questionAndAnswers.addQuestionAndAnswer(questionAndAnswer);
				// System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return questionAndAnswers;
	}

	public void detail(Player player) {

		String name = player.getName();
		int score = player.getScore();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(SCORE_PATH, true))) {
			writer.write(name + "," + score);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Player> getPayers() {
		List<Player> players = new ArrayList<Player>();
		// TODO Need to read from File and Crate Player
		try {
			BufferedReader reader = new BufferedReader(new FileReader(SCORE_PATH));
			String line;

			while ((line = reader.readLine()) != null) {
				String [] columns=line.split(",");
				Player player = new Player();
				player.setName(columns[0]);
				player.setScore(Integer.parseInt(columns[1]));
				players.add(player);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return players;
	}

}