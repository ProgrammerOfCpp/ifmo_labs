package attack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) * 3 / 512 > Math.random())
            return 2;
        return 1;
    }

    @Override
    protected String describe() {
        return "использует атаку Shadow Claw";
    }
}
