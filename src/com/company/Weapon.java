package com.company;

public class Weapon {
    private WeaponType weaponType ;
    private String weaponIs;

    public void setWeaponIs(String weaponIs) {
        this.weaponIs = weaponIs;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponIs() {
        return weaponIs;
    }

}
