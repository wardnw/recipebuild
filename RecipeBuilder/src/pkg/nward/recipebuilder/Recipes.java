package pkg.nward.recipebuilder;

import java.util.ArrayList;

public class Recipes implements ManageItems {
	private ArrayList<Item> recipes = new ArrayList<Item>();

	@Override
	public void addItem(Item i) {
		// TODO Auto-generated method stub
		recipes.add(i);
	}

	@Override
	public Item returnItem(String name) {
		// TODO Auto-generated method stub
		Recipe r = null;
		for(Item it : recipes){
			if (it.toString() == name){
				r = (Recipe) it;
			}
		}
		return r;
	}

	@Override
	public void editItem(Item i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Item i) {
		// TODO Auto-generated method stub
		recipes.remove(i);
	}


}
