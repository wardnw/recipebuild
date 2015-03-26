package pkg.nward.recipebuilder;

public interface ManageItems {

	public void addItem(Item i);
	
	public Item returnItem(String name);
	
	public void editItem(Item i);
	
	public void deleteItem(Item i);
	
}
