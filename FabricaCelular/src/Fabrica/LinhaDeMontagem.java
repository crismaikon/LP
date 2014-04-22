package Fabrica;

public class LinhaDeMontagem {

	private Android[] aparelhosAndroids;
	private Symbian[] aparelhosSymbians;
	private Basico[] aparelhosBasicos;
	
	private static int contAndroid = 0;
	private static int contSymbian = 0;
	private static int contBasico = 0;

	public static int quantidadeProduzida = 0;
	public final static int META_DE_PRODUÇÂO_MENSAL = 20000; 

	public LinhaDeMontagem(int quantAndroids, int quantSymbians,
			int quantBasicos) {

		aparelhosAndroids = new Android[quantAndroids];
		aparelhosSymbians = new Symbian[quantSymbians];
		aparelhosBasicos = new Basico[quantBasicos];

	}

	public void adicionarAndroid(Android android) {
		
		aparelhosAndroids[contAndroid] = android;
		contAndroid++;
		quantidadeProduzida++;

	}
	public static void setconadores(){
		contAndroid = 0;
		contBasico = 0;
		contSymbian = 0;
	}

	public void adicionarSymbian(Symbian symbian) {
		
		aparelhosSymbians[contSymbian] = symbian;
		contSymbian++;
		quantidadeProduzida++;

	}

	public void adicionarBasico(Basico basico) {
		
		aparelhosBasicos[contBasico] = basico;
		contBasico++;
		quantidadeProduzida++;

	}
	
	public boolean VerificarSerialExistente(String serial){
		boolean existe = false;
		
		for(Android android:aparelhosAndroids){
			if(android != null && android.getModelo().getSerial() == serial){
				existe = true;
			}
		}
		for (Symbian symbian:aparelhosSymbians){
			if(symbian != null && symbian.getModelo().getSerial() == serial){
				existe = true;
			}
		}
		for (Basico basico:aparelhosBasicos){
			if(basico != null && basico.getModelo().getSerial() == serial){
				existe = true;
			}
		}
		return existe;
	}
	
	public boolean VeificaNomeExistente(String nome){
		boolean existe = false;
		for(Android android:aparelhosAndroids){
			if(android != null && android.getModelo().getmodeloNome() == nome){
				existe = true;
			}
		}
		for (Symbian symbian:aparelhosSymbians){
			if(symbian != null && symbian.getModelo().getmodeloNome() == nome){
				existe = true;
			}
		}
		for (Basico basico:aparelhosBasicos){
			if(basico != null && basico.getModelo().getmodeloNome() == nome){
				existe = true;
			}
		}
		
		return existe;
	}
	
	public String VerificaMetaAtingida(){
		String meta = "Não foi atingida esse mês";
		
		if (quantidadeProduzida == META_DE_PRODUÇÂO_MENSAL){
			meta = "Meta Atingida";
		}
		
		return meta;
	}
}
