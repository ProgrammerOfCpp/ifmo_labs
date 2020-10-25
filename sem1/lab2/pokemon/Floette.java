package pokemon;

import attack.PetalBlizzard;
import attack.Rest;
import attack.VineWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Floette extends Pokemon {
    public Floette(String name, int level) {
        super(name, level);
        setStats(54, 45, 47, 75, 98, 52);
        setType(Type.FAIRY);
        setMove(new PetalBlizzard(), new Rest(), new VineWhip());
    }
}
