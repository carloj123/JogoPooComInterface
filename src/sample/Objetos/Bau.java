package sample.Objetos;

import sample.Ferramentas.*;
import sample.Objeto;
import sample.Ferramenta;

import java.util.concurrent.locks.Lock;

public class Bau extends Objeto{

	public Bau(String chave) {
		super("O baú está trancado.", "O baú está aberto.");
	}

	@Override
	public boolean usar(Ferramenta f) {
		if(f instanceof LockPick){
			if(((LockPick) f).abrir()){
				this.setAcaoOk(true);
				return f.usar();
			}
		}

		return false;
	}
	
	
	
	

}
