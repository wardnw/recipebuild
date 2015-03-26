package pkg.nward.recipebuilder;

public class Ingredient extends Item {

	private String unitSize;
	private double calories;
	private double fat;
	private double carbs;
	
	public void setName(String s){
		name = s;
	}
	
	public void setUnitSize(String s){
		unitSize = s;
	}
	
	public String getUnitSize(){
		return unitSize;
	}
	
	public void setCalories(double d){
		calories = d;
	}
	
	public double getCalories(){
		return calories;
	}
	
	public void setFat(double d){
		fat = d;
	}
	
	public double getFat(){
		return fat;
	}
	
	private void setCarbs(double d){
		carbs = d;
	}
	
	private double getCarbs(){
		return carbs;
	}
	
}
