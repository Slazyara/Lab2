package StatusMoves;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {  // конструктор класса DoubleTeam в суперкласс передается тип атаки, урон и точность попадания
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects(Pokemon p) {  // Увеличение модификатора характеристики Evasion на 1
        p.setMod(Stat.EVASION,+ 1);
    }

    @Override
    protected String describe(){  // Сообщение выводимое при использовании атаки
        return "использует Double Team";
    }
}