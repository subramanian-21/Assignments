package OOPS.assignment_3;

public class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override
    public boolean isVulnerable(){
        return false;
    }
    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean isSpellPrepare = false;
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    @Override
    public boolean isVulnerable(){
        if(!isSpellPrepare) return true;
        return false;
    }
    @Override
    public int getDamagePoints(Fighter fighter) {
        return isSpellPrepare ? 12 : 3;
    }
    public void prepareSpell(){
        isSpellPrepare = true;
    }
}
