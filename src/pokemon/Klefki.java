package pokemon;
import PhysicalMoves.*;
import SpecialMoves.*;
import StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public final class Klefki extends Pokemon{
    public Klefki(String name, int level){
        super(name,level);
        setStats(57,80,91,80,87,75);
        setType(Type.STEEL,Type.FAIRY);
        setMove(new PlayRough(),new FoulPlay(), new Psychic(), new DoubleTeam() );

    }
}

