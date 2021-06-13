
public class ConstructorTest {
	private int integral; 
	private int fraction; 
	
	public ConstructorTest () {
		this(0,0);
	}
	public ConstructorTest(int num) {
		this(num,num);
	}
	public ConstructorTest(int integral, int fraction) {
		this.integral= integral;
		this.fraction= fraction;
	}
	@Override
	public String toString() {
		return ""+this.integral+"."+this.fraction;
	}
}
