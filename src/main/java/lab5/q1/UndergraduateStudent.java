package lab5.q1;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name) {
		super(name);
	}

	public void generateResult() {
		double avg=calculateavg();
		if(avg<60) {
			setTestResult("Fail");
		}
		else {
			setTestResult("Pass");
		}
	}

}
