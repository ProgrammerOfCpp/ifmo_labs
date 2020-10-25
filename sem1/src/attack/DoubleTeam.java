package attack;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        pokemon.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "использует способность Double Team";
    }
}
