public class IMC {
	
	double indice = 22.5;
	
	public double getIndice(double peso , double altura){
		double indice;
		
        indice = this.calculaIMCbasico(peso, altura);
        
        if (altura==0)
              return this.indice;
              
        return indice;	
}
	public double getIndice(Pessoa p){
		double indice;
		
        indice =  this.calculaIMCbasico(p.getPeso(), p.getAltura());
        
        if (p.getAltura()==0)
              return this.indice;
              
        return indice;	
 }
	
	String getSituacao(double indice) {
		if (indice >=30)
			return "Cuidado, acima do peso!";
       return "Cuidado, abaixo do peso !";

}
    public  void atualiza (Pessoa p){
    	 
    	  double imc = this.calculaIMCbasico(p.getPeso(),p.getAltura());
    	  p.setImc(imc);    	  
    	  
    	      	  
    		if (imc >=30)
    			p.setSituacao("Acima do peso");
    		else
    			p.setSituacao("Abaixo do peso");
    	  
      }
	
	private double calculaIMCbasico(double p, double a){
      
		return  p / (a * a);
	
	
}
}