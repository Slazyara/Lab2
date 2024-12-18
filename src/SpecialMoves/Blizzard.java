package SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE,110,70);
    }
    @Override
    protected String describe() {
        return "использует Blizzard";
    }

    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.1).condition(Status.FREEZE));
    }

}
