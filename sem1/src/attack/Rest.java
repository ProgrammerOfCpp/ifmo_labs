package attack;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        double damage = pokemon.getStat(Stat.HP) - pokemon.getHP();
        pokemon.setMod(Stat.HP, -(int)damage);
        Effect effect = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует способность Rest";
    }
}
