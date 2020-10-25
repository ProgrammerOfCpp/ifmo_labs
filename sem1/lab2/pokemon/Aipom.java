package pokemon;

import attack.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Aipom extends Pokemon {
    public Aipom(String name, int level) {
        super(name, level);
        setStats(55, 70, 44, 40, 55, 85);
        setType(Type.NORMAL);
        setMove(new DoubleTeam(), new Agility(), new Swift());
    }
}
