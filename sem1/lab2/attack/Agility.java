package attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Agility extends StatusMove {
    public Agility() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        pokemon.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "использует способность Agility";
    }
}
