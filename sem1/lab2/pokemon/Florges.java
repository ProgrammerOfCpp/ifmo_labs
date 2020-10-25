package pokemon;

import attack.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Florges extends Pokemon {
    public Florges(String name, int level) {
        super(name, level);
        setStats(78, 65, 68, 112, 154, 75);
        setType(Type.FAIRY);
        setMove(new PetalBlizzard(), new Rest(), new VineWhip(), new DoubleTeam());
    }
}
