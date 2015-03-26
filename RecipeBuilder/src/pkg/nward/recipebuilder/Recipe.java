package pkg.nward.recipebuilder;

import java.util.ArrayList;

public class Recipe extends Item implements ManageItems {
	
	private ArrayList<Item> Ingredients = new ArrayList<Item>();
	private String instructions;
	
	public void setName(String s){
		name = s;
	}

	public ArrayList<Item> getIngredients(){
		return Ingredients;
	}
	
	public void setInstructions(String s){
		instructions = s;
	}
	
	//return instructions for the reader label
	public String getInstructions(){
		return instructions;
	}
	
	//list management methods
	@Override
	public void addItem(Item i) {
		Ingredients.add(i);
		
	}

	@Override
	public Item returnItem(String name) {
		// TODO Auto-generated method stub
		Ingredient i = new Ingredient();
		for (Item it : Ingredients){
			if (it.toString() == name){
				i = (Ingredient) it;
			}
		}
		return i;
	}

	@Override
	public void editItem(Item i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Item i) {
		// TODO Auto-generated method stub
		Ingredients.remove(i);
		
		
	}
	
	
	
}
