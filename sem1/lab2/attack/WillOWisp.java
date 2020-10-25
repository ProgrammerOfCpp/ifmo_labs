package attack;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp() {
        super(Type.FIRE, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        Effect.burn(pokemon);
    }

    @Override
    protected String describe() {
        return "использует атаку Will-O-Wisp";
    }
}
