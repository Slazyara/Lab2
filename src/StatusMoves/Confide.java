package StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Confide extends SpecialMove {
    public Confide(){
        super(Type.NORMAL,0.0,0.0);
    }
    @Override
        protected String describe() {
            return "использует Confide";
        }


    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }

}
