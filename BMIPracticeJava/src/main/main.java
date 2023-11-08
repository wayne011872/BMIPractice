package main;

import Human.Human;
import util.Console;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human wayne = new Human();
		Console.WriteLine("請輸入身高: ");
		try {
			float height = Float.parseFloat(Console.ReadLine());
			wayne.setHeight(height);
		}catch(NumberFormatException e) {
			Console.WriteLine("轉換浮點數錯誤");
		}
		Console.WriteLine("請輸入體重: ");
		try {
			float weight = Float.parseFloat(Console.ReadLine());
			wayne.setWeight(weight);
		}catch(NumberFormatException e) {
			Console.WriteLine("轉換浮點數錯誤");
		}
		int BMI = wayne.calculateBMI();
		Console.WriteLine("您的BMI為: " + BMI);
	}
}
