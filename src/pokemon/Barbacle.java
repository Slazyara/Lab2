package pokemon;

import PhysicalMoves.*;
import StatusMoves.*;
import ru.ifmo.se.pokemon.Type;

public final class Barbacle extends Binacle{
    public Barbacle(String name, int level){
        super(name,level);
        setStats(72,105,115,54,86,68);
        setType(Type.ROCK,Type.WATER);
        setMove(new Confide(), new X_Scissor(),new Slash(),new DragonClaw());
    }
}
