class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()){
            return 10;
        }else {
            return 6;
        }
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    public String toString(){
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter{
    public boolean myWeakness = true;

    @Override
    public boolean isVulnerable() {
        return myWeakness;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if(myWeakness == true) {
            return 3;
        }
        return 12;
    }

    public void prepareSpell(){
        myWeakness = false;
    }

    public String toString(){
        return "Fighter is a Wizard";
    }
}

// TODO: define the Warrior class

// TODO: define the Wizard class
