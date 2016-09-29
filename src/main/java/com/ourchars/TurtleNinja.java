package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Ninja;
import com.parents.Turtle;

public class TurtleNinja extends Turtle implements Ninja
{

	public TurtleNinja()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public TurtleNinja(int health, int magic, String name, Weapon weapon)
	{
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth()
	{
		super.setHealth(health + 20);

	}

	@Override
	public void changeMagic()
	{
		super.setMagic(magic - 5);

	}

	@Override
	public void setWeapon(Weapon weapon)
	{
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.NUNCHUCKS);
	}

	public TurtleNinja makeTurtleNinja(){
		TurtleNinja ourTurtleNinja = new TurtleNinja();
		

		ourTurtleNinja.setName(null);
		ourTurtleNinja.setWeapon(null);
		ourTurtleNinja.changeHealth();
		ourTurtleNinja.changeMagic();
		
		
		return ourTurtleNinja;
	}

}

