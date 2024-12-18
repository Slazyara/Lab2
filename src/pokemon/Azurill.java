package pokemon;
import PhysicalMoves.*;
import SpecialMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azurill extends Pokemon {
    public Azurill(String name, int level){
        super(name,level);
        setStats(50,20,40,20,40,20);
        setType(Type.NORMAL,Type.FAIRY);
        setMove(new IceBeam(), new Waterfall());
    }
}
