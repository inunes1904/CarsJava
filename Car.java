
public class Car {

    int incremento = 5;
    //cor, matrícula, modelo/marca, ano de fabricação, velocidade atual, incremento de velocidade e estado 
    enum estadoEnum{
        Parado,
        Movimento
    }
    public String cor;
    public String matricula;
    public String marca;
    public String modelo;
    public int anoFabricacao;
    private int velocidade;
    private estadoEnum estado;

    Car(String cor, String matricula, String marca, String modelo, int anoFabricacao, int velocidade){
        this.cor = cor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = setVelocidade(velocidade);
        if (this.velocidade > 0) {
            this.estado = estadoEnum.Movimento;
        }else{ this.estado = estadoEnum.Parado;}

    }

    // Aplica a velocidade visto ser um atributo privado
    public int setVelocidade(int velocidade){
        this.velocidade = velocidade;
        return this.velocidade;
    }

     //Para o carro
    public void pararCarro(){
        this.velocidade = 0;
        this.estado = estadoEnum.Parado;
    }

    //Incrementa a velocidade
    public void incVelocidade(){
        this.velocidade += incremento;
    }


    //Readuz a velocidade do carro
    public void redVelocidade(){
        this.velocidade -= incremento;

        //Verifica se a velocidade for <= a 0 coloca o estado em parado
        if (this.velocidade <= 0)
        {   
            this.velocidade = 0;
            this.estado = estadoEnum.Parado;
        } 
    }


    // Funcao para retornar a String com todas as caracteristicas do carro
    public String toString(){
        if ( velocidade > 0 ){
        return "O carro com a marca: "+marca+" modelo: "+modelo+" matricula: "+matricula+" fabricado em: "+anoFabricacao+"\n"+
               "Encontra-se em "+estado.toString()+" a uma velocidade de "+velocidade+" quilometros por Hora.\n\n";
        }else {
            return "O carro com a marca: "+marca+" modelo: "+modelo+" matricula: "+matricula+" fabricado em: "+anoFabricacao+"\n"+
            "Encontra-se "+estado.toString()+".\n\n";
        }
    }


}
