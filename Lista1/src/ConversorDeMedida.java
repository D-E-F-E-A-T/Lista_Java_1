
public class ConversorDeMedida {
	 
  public void converterMassa(Medidas val1, Medidas val2) {
      
      double novoQuilo;
      double novaLibra;
      double aux;
            
      if (val1.getUnidadeDeMassa().equalsIgnoreCase("kg") && val2.getUnidadeDeMassa().equalsIgnoreCase("lb")) {
          
          aux = val1.getMassa();
          novaLibra = aux * 2.2046;          
          System.out.printf("%.2f lb\n", novaLibra);
            
      } else if (val1.getUnidadeDeMassa().equalsIgnoreCase("lb") && val2.getUnidadeDeMassa().equalsIgnoreCase("kg")) {
          
          aux = val1.getMassa();
          novoQuilo = aux / 2.2046;          
          System.out.printf("%.2f kg\n", novoQuilo);
                 
      } else {
      	
          System.out.println("Não é possível realizar a conversão.");
          
      }
          
  }
    
  public void converterDistancia(Medidas val1, Medidas val2) {
  
      double novaMilha;
      double novoQuilometro;
      double aux;      
      
      if (val1.getUnidadeDeDistancia().equalsIgnoreCase("km") && val2.getUnidadeDeDistancia().equalsIgnoreCase("mi")) {
          
          aux = val1.getDistancia();
          novaMilha = aux / 1.609;          
          System.out.printf("%.2f mi\n", novaMilha);          
      
      } else if (val1.getUnidadeDeDistancia().equalsIgnoreCase("mi") && val2.getUnidadeDeDistancia().equalsIgnoreCase("km")) {
          
          aux = val1.getDistancia();
          novoQuilometro = aux * 1.609;          
          System.out.printf("%.2f km\n", novoQuilometro);          
           
      } else {
      	
          System.out.println("Não é possível realizar a conversão.");
          
      }
      
  }
  
  
  public void converterTemperatura(Medidas val1, Medidas val2) {
 
      double grausCelsius;
      double grausFahrenheit;
      double aux;      
      
      if (val1.getUnidadeDeTemperatura().equalsIgnoreCase("C") && val2.getUnidadeDeTemperatura().equalsIgnoreCase("F")) {
          
          aux = val1.getTemperatura();
          grausFahrenheit = aux * 1.8 + 32;          
          System.out.printf("%.2f °F\n", grausFahrenheit);          
      
      } else if (val1.getUnidadeDeTemperatura().equalsIgnoreCase("F") && val2.getUnidadeDeTemperatura().equalsIgnoreCase("C")) {
          
          aux = val1.getTemperatura();
          grausCelsius = (aux - 32) / 1.8;          
          System.out.printf("%.2f °C\n", grausCelsius);          
           
      } else {
      	
          System.out.println("Não é possível realizar a conversão");
          
      }
      
  }
  
	public static void main(String[] args) {
		
		Medidas arg1 = new Medidas("km", 235, "kg", 65, "C", 17); 
    Medidas arg2 = new Medidas("mi", 84.13, "lb", 150, "F", 70);
    
    ConversorDeMedida conversor = new ConversorDeMedida();

    
    conversor.converterMassa(arg1,arg2);
    conversor.converterDistancia(arg1,arg2);
    conversor.converterTemperatura(arg1,arg2);
    
	}

}
