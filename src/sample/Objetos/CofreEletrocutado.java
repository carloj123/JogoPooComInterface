package sample.Objetos;

import sample.Ferramenta;
import sample.Ferramentas.LockPick;
import sample.Objeto;

public class CofreEletrocutado extends Objeto {

    public CofreEletrocutado(){
        super("O cofre está trancado.", "O cofre está destrancado. ");

    }

    @Override
    public boolean usar(Ferramenta f){
        if(f instanceof LockPick){
            if(((LockPick) f).abrir()){
                this.setAcaoOk(true);
                return f.usar();
            }
        }

        return false;
    }
}
