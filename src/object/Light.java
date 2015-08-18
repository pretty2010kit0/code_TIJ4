package object;

public class Light {
	
	private int status;
	private int power;

	
	public Light() {
		status = 0;
		power = 10;
	}
	
	public Light(int status, int power){
		this.status = status;
		this.power = power;
	}
	
	public void on() {
		status = 1;
	}

	public void off() {
		status = 0;
	}

	public void brighten() {
		power++;
	}

	public void dim() {
		power--;
	}

	public int getStatus() {
		return status;
	}

	public int getPower() {
		return power;
	}
	
	
}
