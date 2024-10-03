/*
* Names: Anita Umana
* netID: aumana5
* G#: 01373441
* Lecture section: 004
* Lab section: 213
*/


public class Monster {
    public String type;
    public int hitPoints;
    public int attackRating;
    public int xpValue;
    public int goldValue;

    public Monster(String type, int hp, int attackR, int xp, int gold) {
        this.type = type;
        this.hitPoints = hp;
        this.attackRating = attackR;
        this.xpValue = xp;
        this.goldValue = gold;
    }

    public Monster() {
        this("goblin", 10, 1, 1, 1);
    }

    public boolean isDefeated() {
        return hitPoints <= 0;
    }
    public void receiveAttack(int incAttack) {
        hitPoints -= incAttack;
    }

    
}
