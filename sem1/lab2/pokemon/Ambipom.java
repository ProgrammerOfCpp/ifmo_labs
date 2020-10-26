package pokemon;

import attack.Agility;
import attack.DoubleTeam;
import attack.DualChop;
import attack.Swift;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ambipom extends Aipom {
    public Ambipom(String name, int level) {
        super(name, level);
        setStats(75, 100, 66,60, 66, 115);
        addMove(new DualChop());
    }
}
