package mar25th;

public class Sub {
	
	int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void compute()
	{
		System.out.println("diff is "+(x-y));
	}

}
