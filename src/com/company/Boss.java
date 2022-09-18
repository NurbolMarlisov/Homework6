package com.company;

public class Boss extends GameEntity {

    Weapon Bossweapon = new Weapon();

    public Weapon getBossweapon(WeaponType darkWeapon) {
        return Bossweapon;
    }

    public void setBossweapon(Weapon bossweapon) {
        Bossweapon = bossweapon;
    }


    public String printInfo(){
        return"Boss hp: "+ getHpBoss() +" Boss damage: "+ getDamageBoss()+
                " Boss defense: "+ getDefenseBoss()+" Boss weapons: "+ WeaponType.DARK_WEAPON;

    }





}

