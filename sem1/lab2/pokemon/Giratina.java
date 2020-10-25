package pokemon;

import attack.AuraSphere;
import attack.DragonClaw;
import attack.ShadowClaw;
import attack.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Giratina extends Pokemon {

    public Giratina(String name, int level) {
        super(name, level);
        setStats(150, 100, 120, 100, 120, 90);
        setType(Type.GHOST, Type.DRAGON);
        setMove(new WillOWisp(), new AuraSphere(), new DragonClaw(), new ShadowClaw());
    }
}
