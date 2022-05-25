public class ListaNum implements IListaNum {

	private No primeiro;
	
	public ListaNum()
	{
		primeiro = null;
	}
	
	public No buscar(int valorABuscar) 
	{
		No noAtual = this.primeiro;

		while ((noAtual != null) && (noAtual.getInfo() != valorABuscar))
		{
			noAtual = noAtual.getProx();
		}

		return noAtual;
	}

	public boolean vazia()
	{
		return primeiro == null;
	}


	public void inserePrimeiro(int valorAInserir)
	{
		No noAInserir = new No();

		noAInserir.setInfo(valorAInserir);
		noAInserir.setProx(primeiro);

		primeiro = noAInserir;
	}


	public void insereUltimo(int valorAInserir){
		if (vazia() == true)
		{
			inserePrimeiro(valorAInserir); 
		}
		else
		{
			No noAtual = primeiro;

			while (noAtual.getProx() != null)
			{
				noAtual = noAtual.getProx();
			}

			if(noAtual.getProx() == null)
			{
				No noAInserir = new No();
				noAInserir.setInfo(valorAInserir);
				noAtual.setProx(noAInserir);
			}
		}
	}

	public void insereDepois(No noAnterior, int valorAInserir) 
	{
		if(vazia() == true)
		{
			System.out.println("A lista está vazia, não há nó para ser removido.");
		}

		No noAtual = primeiro;

		while(noAtual != noAnterior)
		{
			noAtual = noAtual.getProx();
		}

		if(noAtual == null)
		{
			System.out.println("Não foi encontrado o nó informado");
			
		}
		
		if(noAtual.getProx() == null)
		{
			insereUltimo(valorAInserir);
		}

		No noPosterior = noAtual.getProx();
		No noAInserir = new No();
		noAInserir.setInfo(valorAInserir);
		noAInserir.setProx(noPosterior);
		noAtual.setProx(noAInserir);
	}

	public No removePrimeiro() 
	{
		if (vazia() ==  true) 
		{
			System.out.println("A lista está vazia, não há nó para ser removido.");
		}
		
		No noARemover = primeiro;
		primeiro = primeiro.getProx();
		return noARemover;
	}
	
	public No removeUltimo() 
	{
		if (vazia() ==  true) 
		{
			System.out.println("A lista está vazia, não há nó para ser removido.");
		}
		
		No noAtual = primeiro;
		No penultimoNo;
		
		while (noAtual.getProx() != null)
		{
			boolean isPenultimo = VerificarSeNoAtualIsPenultimo(noAtual);

			if(isPenultimo)
			{
				break;
			}
			else
			{
				noAtual = noAtual.getProx();
			}
		}

		penultimoNo = noAtual;
		No ultimoNo = penultimoNo.getProx();
		noAtual.setProx(null);
		return ultimoNo;
	}

	private boolean VerificarSeNoAtualIsPenultimo(No noAtual) {
		No possivelUltimoNo = noAtual.getProx();

		if(possivelUltimoNo == null)
		{
			return false;
		}
		else if(possivelUltimoNo.getProx() == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void mostrar()
	{
		No noAtual = primeiro;
		while(noAtual != null)
		{
			System.out.print(noAtual.getInfo() + " | ");
			noAtual = noAtual.getProx();
		}
	}

	public No remove(No noARemover) 
	{
		if(vazia() == true)
		{
			System.out.println("A lista está vazia, não há nó para ser removido.");
			return null;
		}

		No noAtual = primeiro;
		No noAnterior = new No();
		
		while(noAtual.getProx() != null)
		{
			if(noAtual.getProx() == noARemover)
			{
				noAnterior = noAtual;
				break;
			}
			else
			{
				noAtual = noAtual.getProx();
			}
		}

		if(noAnterior.getProx() == null)
		{
			System.out.println("Não existe nó com o valor informado");
			return null;
		}
		else
		{
			noAnterior.setProx(noARemover.getProx());
			return noARemover;
		}
	}

	public No GetNoByValor(int valorABuscar)
	{
		No noAtual = primeiro;

		while(noAtual != null)
		{
			if(noAtual.getInfo() == valorABuscar)
			{
				break;
			}
			else
			{
				noAtual = noAtual.getProx();
			}
		}

		return noAtual;
	}

}