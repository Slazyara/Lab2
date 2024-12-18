package PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Present extends PhysicalMove {
    public Present(){
        super(Type.NORMAL,0,100);
    }
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.1) {
            def.setMod(Stat.ATTACK, -1);
        }
    }
    @Override
    protected String describe() {
        return "использует Present";
    }
}
