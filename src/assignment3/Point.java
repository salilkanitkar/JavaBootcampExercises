package assignment3;

public class Point {

	private int x;
	private int y;
	
	/* Default ctor that initializes Point to 0,0 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		if (x >= 0 && y >= 0) {
			this.x = x;
			this.y = y;
		} else {
			throw new IllegalArgumentException("Bad Arguments!");
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		} else {
			throw new IllegalArgumentException("Bad Arguments!");
		}
	}

	public void setY(int y) {
		if (y >= 0) {
			this.y = y;
		} else {
			throw new IllegalArgumentException("Bad Arguments!");
		}
			
	}
	
	public boolean isLeftOf(Point P) {
		return this.x < P.getX();
	}

	public boolean isRightOf(Point P) {
		return this.x > P.getX();
	}
	
	public boolean isAboveOf(Point P) {
		return this.y > P.getY();
	}

	public boolean isBelowOf(Point P) {
		return this.y < P.getY();
	}

}
