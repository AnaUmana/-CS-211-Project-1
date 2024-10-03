/*
* Names: Anita Umana
* netID: aumana5
* G#: 01373441
* Lecture section: 004
* Lab section: 213
*/


public class Battle {
    public static String fight(Hero h, Monster m) {
        while (h.hasHPRemaining() && !m.isDefeated()) {
            m.receiveAttack(h.attackRating);
            if (!m.isDefeated()) {
                h.receiveAttack(m.attackRating);
            }
            if (!h.hasHPRemaining() && h.healingPotions > 0) {
                h.useHealingPotion();
            }
        }
    
        if (!h.hasHPRemaining()) {
            return "The " +  m.type + " has defeated " + h.name + ". Game over.";
        } else {
            h.receiveXP(m.xpValue);
            h.healingPotions += m.goldValue / 3;

            int levelUps = (h.currentXP / 10) ; // Each 10 XP levels up once
            return h.name + " has defeated the " + m.type + " earning " 
                   + m.goldValue + " gold and " + m.xpValue 
                   + " XP leveling up " + levelUps + " times.";
    }
}
}
