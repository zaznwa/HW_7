public class Medic extends Hero {
    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
    }

    public void applySuperAbility() {
        System.out.println("Medic применил супер способность " + getSuperAbilityType());
    }
}
