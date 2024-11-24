public class Magic extends Hero{
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    public void applySuperAbility() {
        System.out.println("Magic применил супер способность " + getSuperAbilityType());
    }
}
