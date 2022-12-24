
public class Main {

    public static void main(String[] args) {

        //Initially the queen's weapon is Knife.
        Character queenName = new Queen();
        queenName.fight();


        //The queen changes her weapon to fight.
        queenName.setWeapon(new BowAndArrowBehavior());
        queenName.fight();

        //The queen changes her weapon to fight 3rd time.
        queenName.setWeapon(new AxeBehavior());
        queenName.fight();


        //The queen changes her weapon to fight.
        queenName.setWeapon(new SwordBehavior());
        queenName.fight();


    }

}
