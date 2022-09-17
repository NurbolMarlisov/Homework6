package com.company;

public class Boss extends GameEntity {

    Weapon Bossweapon = new Weapon();

    public Weapon getBossweapon(WeaponType darkWeapon) {
        return Bossweapon;
    }

    public void setBossweapon(Weapon bossweapon) {
        Bossweapon = bossweapon;
    }
}

