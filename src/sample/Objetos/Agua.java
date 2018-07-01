package sample.Objetos;

import sample.Ferramenta;
import sample.Ferramentas.Dreno;
import sample.Objeto;

public class Agua extends Objeto {
    public Agua(){
        super("A sala está inundada.", "A água foi drenada.");
    }

    @Override
    public boolean usar(Ferramenta f){
        if(f instanceof Dreno){
            this.setAcaoOk(true);
            return f.usar();
        }

        return false;
    }
}
