package attack;

import ru.ifmo.se.pokemon.*;

public class AuraSphere extends SpecialMove {
    public AuraSphere() {
        super(Type.FIGHTING, 80, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует атаку Aura Sphere";
    }
}
