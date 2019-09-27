package operacionesbasicas;

public class OperacionesBasicas {
    
    private int a;
    private int b;

    public OperacionesBasicas() {
    }

    public OperacionesBasicas(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int Sumar(){
        if(a==0 || b==0){
            return 0;
        }
        return this.a + this.b;
    }
    
    public int Restar(){
        if(b>a){
            return 0;
        }
        return this.a - this.b;
    }
    
    public int Multiplicar(){
        if(b==0){
            return 1;
        }
        return this.a * this.b;
    }
    
    public int Dividir(){
        if(b==0){
            return 0;
        }
        return this.a / this.b;
    }  
    
}
