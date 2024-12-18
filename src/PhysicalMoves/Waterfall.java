package PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall(){
        super(Type.WATER,80,100);
    }
    protected void applyOppEffects(Pokemon p){  // накладывает эффект страха(flinch) на противника с шансом 30%
        if (Math.random() <= 0.1) {
            Effect.flinch(p);}
        }
    @Override
    protected String describe() {
        return "использует Waterfall";
    }
}
