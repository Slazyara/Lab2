package pokemon;

import PhysicalMoves.*;
import StatusMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Binacle extends Pokemon {
    public Binacle(String name, int level){
        super(name,level);
        setStats(42,52,67,39,56,50);
        setType(Type.ROCK,Type.WATER);
        setMove(new Confide(), new X_Scissor(),new Slash());
    }
}
