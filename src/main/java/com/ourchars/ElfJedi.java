package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Elf;

public class ElfJedi extends Elf implements Jedi
{
	

	public ElfJedi()
	{
		super();
		// TODO Auto-generated constructor stub
	}
//added Weapon weapon
	public ElfJedi(int health, int magic, String name, Weapon weapon)
	{
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth()
	{
		super.setHealth(health + 50);

	}

	@Override
	public void changeMagic()
	{
		super.setMagic(magic + 100);

	}
	@Override
	public void setWeapon(Weapon weapon)
	{
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}
	
	public ElfJedi makeElfJedi(){
		ElfJedi ourElfJedi = new ElfJedi();
		
		
		ourElfJedi.setName(null);
		ourElfJedi.setWeapon(null);
		ourElfJedi.changeHealth();
		ourElfJedi.changeMagic();
		
		
		return ourElfJedi;
	}

	

}
