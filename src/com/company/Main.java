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
        System.out.println(myBoss.printInfo());
        System.out.println();

        Skeleton zung = new Skeleton(80);  //First Skeleton
        zung.printInfo();
        zung.setHpBoss( 300);
        zung.setDamageBoss(40);
        zung.setDefenseBoss("Защита от Магических атак ");
        System.out.println(zung.printInfo());

        Skeleton plurg = new Skeleton(100);
        plurg.setHpBoss(200);
        plurg.setDamageBoss(60);
        plurg.setDefenseBoss(" Защита от Физических атак ");
        System.out.println(plurg.printInfo2());




    }
}
