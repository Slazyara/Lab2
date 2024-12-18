package pokemon;

import PhysicalMoves.*;
import SpecialMoves.*;
import ru.ifmo.se.pokemon.Type;

public final class Azumarill extends Marill{
    public Azumarill(String name, int level){
        super(name,level);
        setStats(100,50,80,60,80,50);
        setType(Type.WATER,Type.FAIRY);
        setMove(new IceBeam(),new Waterfall(),new Present(),new Blizzard());
    }
}
