package main.java.dio;

public class Pilha {
	private No refNoEntradaPilha;

	public Pilha() {
		super();
		this.refNoEntradaPilha = null;
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	public No top() {
		return refNoEntradaPilha;
	}
	
	public boolean isEmpty() {
		
		if(refNoEntradaPilha == null) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "------------------\n";
		stringRetorno += "       Pilha\n";
		stringRetorno += "-----------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while (true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			} else {
				break;
			}
		}
		stringRetorno += "===============\n";
		return stringRetorno;
	}
}
