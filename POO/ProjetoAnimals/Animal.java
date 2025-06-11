abstrcat class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public void Animal(float peso, int idade, int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public getPeso(){
        return this.peso;
    }

   public getIdade(){
        return this.idade;
    }

   public getMembros(){
        return this.membros;
   }

   public void setPeso(float peso) {
       this.peso = peso;
   }

   public void setIdade(int idade){
       this.idade = idade;
   }

   public void setMembros(int membros){
       this.membros = membros;
   }

   public abstract void locomover();
   public abstract void alimentar();
   public abstract void emitirSom();
}