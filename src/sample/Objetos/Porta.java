package sample.Objetos;

import sample.Ferramenta;
import sample.Ferramentas.Chave;
import sample.Objeto;

public class Porta extends Objeto {
    public Porta(){
        super("A porta está trancada.", "A porta está destrancada.");
    }

    @Override
    public boolean usar(Ferramenta f){
        if(f instanceof Chave){
            this.setAcaoOk(true);
            return f.usar();
        }

        return false;
    }
}
