package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int answer = num1 * num2;
		String returnValue = num1 + " x " + num2 + " = " + answer;
		return returnValue;
	}

	public static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		for (int i = 2; i < 10; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static boolean isSquare(int number) {
		boolean returnValue = false;
		boolean stop = false;
		int i = 1;
		while (stop == false) {
			if (i * i > number) {
				stop = true;
			} else {
				if (i * i == number) {
					returnValue = true;
					stop = true;
				}
				i++;
			}
		}
		return returnValue;

	}

	public static boolean isCube(int number) {
		boolean returnValue = false;
		boolean stop = false;
		int i = 1;
		while (stop == false) {
			if (i * i * i > number) {
				stop = true;
			} else if (i * i * i == number) {
				returnValue = true;
				stop = true;
			}
			i++;
		}

		return returnValue;

	}

	public static int findBrokenEgg(List<String> eggs) {
		int location = -1;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				location = i;
				break;
			}
		}

		return location;
	}

	public static int countPearls(List<Boolean> pearls) {
		int location = -1;
		for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i) == true) {
				location = i;
				break;
			}
		}
		return location;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = -1;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;

	}

	public static String findLongestWord(List<String> words) {
		int index = -1;
		int characters = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > characters) {
				characters = words.get(i).length();
				index = i;
			}
		}
		return words.get(index);

	}

	public static boolean containsSOS(List<String> message) {
		boolean returnMessage = false;
		if (message.contains("... --- ...")) {
			returnMessage = true;
		}
		return returnMessage;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int k = 0; k < results.size() - 1; k++) {
				if (results.get(k) > results.get(k + 1)) {
					double temp = results.get(k);
					results.set(k, results.get(k + 1));
					results.set(k + 1, temp);
				}
			}
		}
		return results;

	}

	public static List<String> sortDNA(List<String> sequence) {
		for (int i = 0; i < sequence.size(); i++) {
			for (int k = 0; k < sequence.size() - 1; k++) {
				if (sequence.get(k).length() > sequence.get(k + 1).length()) {
					String temp = sequence.get(k);
					sequence.set(k, sequence.get(k + 1));
					sequence.set(k + 1, temp);
				}
			}
		}
		return sequence;

	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int k = 0; k < words.size() - 1; k++) {
				if (words.get(k).compareTo(words.get(k + 1)) > 0) {
					String temp = words.get(k);
					words.set(k, words.get(k + 1));
					words.set(k + 1, temp);
				}
			}
		}
		return words;

	}

}
