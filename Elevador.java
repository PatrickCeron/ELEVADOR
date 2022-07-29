public class Elevador extends BaseElevador{
    

    public Elevador(int capacidade, int total_andares){
        this.capacidade = capacidade;
        this.total_andares = total_andares;
    }

    public void entra(int pessoas){
        if(pessoas <= capacidade && pessoas_dentro < capacidade){
            pessoas_dentro += pessoas;
        }
    }
        
        
    public void sai(int pessoas){
        if(pessoas_dentro >0 && pessoas<=capacidade){
            pessoas_dentro-=pessoas;
        } 
    }
        
    
        public void sobe(){
        if(this.andar_atual != this.total_andares){
            this.andar_atual++;
        }
    }
    
        public void desce(){
        if (andar_atual != 0 ){
            this.andar_atual--;
        }
    }
    
        public void setAndarAtual(int andar){
            
        }
    
        public int getAndarAtual(){
            return andar_atual;
        }
    
        public void setTotalAndares(int total){
            
        }
    
        public int getTotalAndares(){
            return total_andares;
        }
    
        public void setPessoasDentro(int pessoas){
            
        }
    
        public int getPessoasDentro(){
            return pessoas_dentro;
        }
    
        public void setCapacidade(int capacidade){
            this.capacidade = capacidade;
        }
    
        public int getCapacidade(){
            return capacidade;
        }
}
