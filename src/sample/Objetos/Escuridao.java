package sample.Objetos;

import sample.Ferramenta;
import sample.Ferramentas.Lanterna;
import sample.Objeto;

public class Escuridao extends Objeto {

    public Escuridao(){
        super("A sala está ecura.", "A sala está iluminada.");
    }

    @Override
    public boolean usar(Ferramenta f) {

        if(f instanceof Lanterna){
            this.setAcaoOk(true);
            return f.usar();
        }

        return false;
    }
}
