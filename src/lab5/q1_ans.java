package lab5;

public class q1_ans {
    public static void main(String[] args) {
		UndergraduateStudent ugst1 = new UndergraduateStudent("Jerry");
		ugst1.setTestScore(1,70);
		ugst1.setTestScore(2,69);
		ugst1.setTestScore(3,71);
		ugst1.setTestScore(4,55);
		ugst1.generateResult();
		System.out.println(ugst1.getTestResult());
	}
}
