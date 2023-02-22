package lab5.q1;

import java.util.Arrays;

public abstract class Student {
    private String studentName;
	private int[] testScores = new int[10];
	private String testResult;

	public Student(String name) {
		this.studentName = name;
		Arrays.fill(testScores, -1);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScores() {
		return testScores;
	}

	public void setTestScore(int testNumber, int testScore) {
		this.testScores[testNumber - 1] = testScore;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public double calculateavg() {
		double avg = 0, i1 = 0;
		for (int i : testScores) {
			if (-1 != i) {
				avg += i;
				i1 += 1;
			}
		}
		return avg / i1;
	}

	abstract public void generateResult();
}
