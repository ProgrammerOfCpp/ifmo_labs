package attack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DualChop extends PhysicalMove {

    public DualChop() {
        super(Type.DRAGON, 40, 90, 0, 2);
    }

    @Override
    protected String describe() {
        return "использует атаку Dual Chop";
    }
}
