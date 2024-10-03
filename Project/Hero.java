/*
* Names: Anita Umana
* netID: aumana5
* G#: 01373441
* Lecture section: 004
* Lab section: 213
*/

public class Hero {
    public String name;
    public int hitPointsRemaining;
    public int hitPointsMax;
    public int attackRating;
    public int defenseRating;
    public int currentXP;
    public int currentLevel;
    public int healingPotions;

    public Hero(String name, int hpMax, int ar, int dr, int potions) {
        this.name = name;
        this.hitPointsMax = hpMax;
        this.hitPointsRemaining = hpMax;
        this.attackRating = ar;
        this.defenseRating = dr;
        this.currentXP = 0;
        this.currentLevel = 1;
        this.healingPotions = potions;
    }

    public boolean hasHPRemaining() {
        return hitPointsRemaining > 0;
    }

    public void receiveAttack(int incAttack) {
        int attack = incAttack - defenseRating;
        if (attack > 0 ) {
            hitPointsRemaining -= attack;
        }
    }
    public void receiveXP(int xpReceived) {
        currentXP += xpReceived;
        while (currentLevel >= 10) {
            currentXP -=10;
            currentLevel++;
            hitPointsMax += 5;
            hitPointsRemaining = hitPointsMax;
        }
    }
    public void useHealingPotion() {
        if (healingPotions > 0) {
            hitPointsRemaining = hitPointsMax;
            healingPotions --;
        }
    }
}
