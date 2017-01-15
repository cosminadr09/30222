public class Ship {
	public int type;
	public boolean isVertical;

	public Ship(int type, boolean isVertical) {
		this.type = type;
		this.isVertical = isVertical;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isVertical() {
		return isVertical;
	}

	public void setVertical(boolean isVertical) {
		this.isVertical = isVertical;
	}

}
