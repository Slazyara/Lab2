
import pokemon.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Azumarill p1 = new Azumarill("Чужой", 1);
        Azurill p2 = new Azurill("Хищник", 1);
        Barbacle p3 = new Barbacle("Добряк",1);
        Binacle p4 = new Binacle("Воппер Джуниор",1);
        Klefki p5 = new Klefki("Сибирский воппер",1);
        Marill p6 = new Marill("Матан",1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();

    }
}
