package pokemon;

import attack.PetalBlizzard;
import attack.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flabebe extends Pokemon {
    public Flabebe(String name, int level) {
        super(name, level);
        setStats(44, 38, 39, 61, 79, 42);
        setType(Type.FAIRY);
        setMove(new PetalBlizzard(), new Rest());
    }
}
