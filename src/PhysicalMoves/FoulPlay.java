package PhysicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FoulPlay extends PhysicalMove {
    public FoulPlay(){
        super(Type.DARK,95,100);
    }


    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        return def.getStat(Stat.ATTACK);
    }



    @Override
    public String describe() {
        return "использует FoulPlay";
        }
    }

