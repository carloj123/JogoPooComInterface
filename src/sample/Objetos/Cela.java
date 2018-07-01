package sample.Objetos;

import sample.Ferramenta;
import sample.Ferramentas.LockPick;
import sample.Objeto;

public class Cela extends Objeto {
    public Cela(){
        super("A cela está trancada.", "A cela está destrancada.");
    }

    @Override
    public boolean usar(Ferramenta f){
        if(f instanceof LockPick){
            if(((LockPick)f).abrir()) {
                System.out.println("Usou " + f.getDescricao());
                this.setAcaoOk(true);
                return true;
            }
        }

        return false;
    }
}
