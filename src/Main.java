public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Warrior(300, 50, "Critical damage"),
                new Magic(200, 30, "Fireball"),
                new Medic(150, 20, "Heal", 100)
        };


        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Medic увеличил опыт лечения до: " + medic.getHealPoints());
            }
        }
    }
}