package PhysicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL,70,100);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (1.0/8.0 > Math.random()) {
            System.out.println("Критический удар!");
            return 2.0;
        }
        else {
            return 1.0;
        }
    }
    @Override
    protected String describe(){
        return "использует Slash";
    }
}
