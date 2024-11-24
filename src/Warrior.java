public class Warrior extends Hero{
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность " + getSuperAbilityType());
    }
}
