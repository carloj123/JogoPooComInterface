package sample.Objetos;

import sample.Ferramenta;
import sample.Ferramentas.Extintor;
import sample.Objeto;

public class Fogo extends Objeto {
    public Fogo(){
        super("O fogo está aceso.", "O fogo está apagado.");
    }

    @Override
    public boolean usar(Ferramenta f){
        if(f instanceof Extintor){
            f.usar();
            this.setAcaoOk(true);
            return true;
        }

        return false;
    }
}
