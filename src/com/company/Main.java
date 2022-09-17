package com.company;

public class Main {

    public static void main(String[] args) {
        Boss myBoss = new Boss();


        myBoss.setHpBoss(600);
        myBoss.setDamageBoss(100);
        myBoss.setDefenseBoss("Defens Strong ");
       myBoss.getBossweapon(WeaponType.DARK_WEAPON);
        System.out.println(" Boss HP: " + myBoss.getHpBoss() + " Boss Damage: " + myBoss.getDamageBoss() +
                " Boss Defense: " + myBoss.getDefenseBoss() + " Boss weapon: " + WeaponType.DARK_WEAPON );


    }
}
