package registration;

//Creation of subclass
public class Cargo extends Vehicle{
	
	private int capacityMaximum;
	private int height;
	private int width;
	private int depth;
	
	public int getCapacityMaximum() {
		return capacityMaximum;
	}
	public void setCapacityMaximum(int capacityMaximum) {
		this.capacityMaximum = capacityMaximum;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
}
