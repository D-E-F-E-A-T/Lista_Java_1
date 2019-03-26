
public class Medidas {
	
	private String unidadeDeDistancia;
	private double distancia;
	private String unidadeDeMassa;
	private double massa;
	private String unidadeDeTemperatura;
	private int temperatura;
	
	public Medidas() {
		
	}
	
	public Medidas(String unidadeDeDistancia, double distancia, String unidadeDeMassa, double massa, String unidadeDeTemperatura, int temperatura) {
		
		this.unidadeDeDistancia = unidadeDeDistancia;
		this.distancia = distancia;
		this.unidadeDeMassa = unidadeDeMassa;
		this.massa = massa;
		this.unidadeDeTemperatura = unidadeDeTemperatura;
		this.temperatura = temperatura;
		
	}
	
	public String getUnidadeDeDistancia() {
		return this.unidadeDeDistancia;
	}
	
	public void setUnidadeDeDistancia(String unidadeDeDistancia) {
		this.unidadeDeDistancia = unidadeDeDistancia;
	}
	
	public double getDistancia() {
		return this.distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public String getUnidadeDeMassa() {
		return this.unidadeDeMassa;
	}
	
	public void setUnidadeDeMassa(String unidadeDeMassa) {
		this.unidadeDeMassa = unidadeDeMassa;
	}
	
	public double getMassa() {
		return this.massa;
	}
	
	public void setMassa(double massa) {
		this.massa = massa;
	}
	
	public String getUnidadeDeTemperatura() {
		return this.unidadeDeTemperatura;
	}
	
	public void setUnidadeDeTemperatura(String unidadeDeTemperatura) {
		this.unidadeDeTemperatura = unidadeDeTemperatura;
	}
	
	public int getTemperatura() {
		return this.temperatura;
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

}
