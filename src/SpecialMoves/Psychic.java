package SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 10, 100);
    }
    @Override
    protected String describe() {
        return "использует Psychic";
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE,- 1);
        }
    }

}
