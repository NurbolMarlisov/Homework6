package com.company;

public class Skeleton extends  Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;

    }

    public Skeleton(int arrows) {
        this.arrows = arrows;
    }

    public String printInfo() {
        return " Zunk HP: "+ getHpBoss() + " Damage: " + getDamageBoss()+ " Number of arrows: "  + getDefenseBoss()+
                " количество стрел: " + this.getArrows();
    }
    public String printInfo2(){
        return " Plurg: HP "+ getHpBoss() + " Damage: " + getDamageBoss()+ " Number of arrows: "  + getDefenseBoss()+
                " количество стрел: " + this.getArrows();
    }
}