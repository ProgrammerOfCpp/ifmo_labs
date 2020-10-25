package pokemon;

import attack.Agility;
import attack.DoubleTeam;
import attack.DualChop;
import attack.Swift;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ambipom extends Pokemon {
    public Ambipom(String name, int level) {
        super(name, level);
        setStats(75, 100, 66,60, 66, 115);
        setType(Type.NORMAL);
        setMove(new DoubleTeam(), new Agility(), new Swift(), new DualChop());
    }
}
