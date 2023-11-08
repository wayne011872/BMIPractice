package Human;

public class Human implements BMI{
	float height;
	float weight;
	public Human(){}
	public Human(float height,float weight){
		this.height = height;
		this.weight = weight;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return this.height;
	}
	public float getWeight() {
		return this.weight;
	}
	public int calculateBMI() {
		int BMI = 0;
		BMI = (int)Math.round(Math.pow(this.weight, 2) / this.height);
		return BMI;
	}
}