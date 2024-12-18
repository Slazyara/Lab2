package PhysicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DragonClaw extends PhysicalMove {
    public DragonClaw(){
        super(Type.DRAGON,80,100);
    }
    protected String describe(){
        return "использует DragonClaw";
    }

}
