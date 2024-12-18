package PhysicalMoves;
import ru.ifmo.se.pokemon.*;

public class PlayRough extends PhysicalMove{
    public PlayRough(){
        super(Type.FAIRY,90,90);
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, - 1);
        }
    }
    @Override
    protected String describe(){
        return "использует PlayRough";
    }
}
