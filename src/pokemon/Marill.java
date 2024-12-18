package pokemon;

import PhysicalMoves.*;
import SpecialMoves.*;
import ru.ifmo.se.pokemon.Type;

public class Marill extends Azurill{
    public Marill(String name, int level){
        super(name,level);
        setStats(70,20,50,20,50,40);
        setType(Type.WATER,Type.FAIRY);
        setMove(new IceBeam(),new Waterfall(),new Present());

    }
}
