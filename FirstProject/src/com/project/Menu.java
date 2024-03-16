package com.project;

public class Menu 
{
	public Menu() 
	{
		super();
		
	}
	private int MenuID;
	private int MenuPrize;
	private String MenuName;
	private String MenuCategory;
	private int MenuQuantity;
	public int getMenuID() 
	{
		return MenuID;
	}
	public void setMenuID(int menuID)
	{
		MenuID = menuID;
	}
	public int getMenuPrize() 
	{
		return MenuPrize;
	}
	public void setMenuPrize(int menuPrize) 
	{
		MenuPrize = menuPrize;
	}
	public String getMenuName() 
	{
		return MenuName;
	}
	public void setMenuName(String menuName) 
	{
		MenuName = menuName;
	}
	public String getMenuCategory() 
	{
		return MenuCategory;
	}
	public void setMenuCategory(String menuCategory) 
	{
		MenuCategory = menuCategory;
	}
	public int getMenuQuantity() 
	{
		return MenuQuantity;
	}
	public void setMenuQuantity(int menuQuantity) 
	{
		MenuQuantity = menuQuantity;
	}
	public Menu(int menuID, int menuPrize, String menuName, String menuCategory, int menuQuantity) 
	{
		super();
		MenuID = menuID;
		MenuPrize = menuPrize;
		MenuName = menuName;
		MenuCategory = menuCategory;
		MenuQuantity = menuQuantity;
	}
	@Override
	public String toString()
	{
		return "Menu [MenuID=" + MenuID + ", MenuPrize=" + MenuPrize + ", MenuName=" + MenuName + ", MenuCategory="
				+ MenuCategory + ", MenuQuantity=" + MenuQuantity + "]";
	}
	
}
