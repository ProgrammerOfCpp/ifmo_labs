import pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.addAlly(new Giratina("Gina", 1));
        battle.addAlly(new Ambipom("Amom", 1));
        battle.addAlly(new Floette("Flote", 1));

        battle.addFoe(new Aipom("Aom", 1));
        battle.addFoe(new Flabebe("Flabe", 1));
        battle.addAlly(new Florges("Fles", 1));

        battle.go();
    }
}
