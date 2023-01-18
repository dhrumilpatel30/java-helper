package lab5.q2;

public class Line implements RelationInterface{
    private double x1,x2,y1,y2;

	public Line(double x1,double y1,double x2,double y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	public double getLength() {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	@Override
	public boolean isGreater(Line l1) {

		return this.getLength()>l1.getLength();
	}

	@Override
	public boolean isLess(Line l1) {

		return this.getLength()<l1.getLength();
	}

	@Override
	public boolean isEqual(Line l1) {

		return this.getLength()==l1.getLength();
	}

}
