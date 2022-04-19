// Trabalho realizado por: Felipe Rosa nº20212713
import java.util.ArrayList;
import java.util.Scanner;

public class App{

    public static void main(String[] args){
        
        // Criacao de uma ArrayList para adicionar Carros
        ArrayList<Car> carsList = new ArrayList<Car>();

        //Instanciacao dos objetos do tipo carro
        Car car1 = new Car("vermelho", "94-YI-48", "BMW","i8", 2020, 30);
        Car car2 = new Car("amarelo", "55-XI-33", "BMW","X5", 2019, 0);
        Car car3 = new Car("branco", "34-XX-18", "Mercedes","Class C", 2017, 180);
        Car car4 = new Car("preto", "15-TU-36", "BMW","X5", 2019, 5);
        Car car5 = new Car("vermelho", "XX-88-PP", "BMW","Serie 3", 2022, 76);
       
        //Adicionar os carros à lista
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);

        boolean operations = true;
        

        while (operations){
            // instanciar o scanner
            Scanner sc = new Scanner(System.in);
            
            //Menu
            System.out.println("**********************************************************");
            System.out.println("****  (1) listar todos os veiculos  (2) Parar Veiculo  ***");
            System.out.println("****  (3) Aumentar velocidade  (4) Diminuir Velocidade ***");
            System.out.println("****************       (0) SAIR            ***************");
            System.out.println("***     Todas as operacoes têm de ser efetuadas       ****");
            System.out.println("***              através da matricula                 ****");
            System.out.println("**********************************************************");
            // Ler input do user
            int selection = sc.nextInt();
            switch(selection) {
                case 1:
                //Percorrer a lista de Carros
                    for (Car car : carsList) 
                    { 
                        // Lista todos os carros
                        System.out.println(car.toString());
                    }
                  break;
                case 2:
                  // Parar Veiculo
                  System.out.println("**********************************************************");
                  System.out.println("Introduzir a matricula do carro que tenciona parar:");
                  
                  // Ler input do user
                  String matricula = sc.next();
                  
                  // Percorre a lista de carros
                  for (Car car : carsList) 
                  {                   
                    if (car.matricula.equals(matricula)){
                        car.pararCarro();
                        System.out.println(car.toString());
                    }
                  }

                  break;
                case 3:
                  // Aumentar velocidade
                   System.out.println("*******************************************************************");
                   System.out.println("Introduzir a matricula do carro que tenciona aumentar a velocidade:");
                   
                   // Ler input do user
                   matricula = sc.next();   
                   // Percorre a lista de carros                
                   for (Car car : carsList) 
                   { 
                       // se a matricula do carro for igual a matricula introduzida aumenta a velocidade
                     if (car.matricula.equals(matricula)){
                         car.incVelocidade();
                         System.out.println(car.toString());
                     }
                   }
                  break;
                case 4:
                  // Reduzir velocidade
                  System.out.println("*******************************************************************");
                  System.out.println("Introduzir a matricula do carro que tenciona reduzir a velocidade:");
                  
                  matricula = sc.next();    
                  // Percorre a lista de carros               
                  for (Car car : carsList) 
                  { 
                    // se a matricula do carro for igual a matricula introduzida reduz a velocidade
                    if (car.matricula.equals(matricula)){
                        car.redVelocidade();
                        System.out.println(car.toString());
                    }
                  }
                  break;
                case 0:
                    System.out.println("\n\nPrograma Encerrado... Volte sempre!");
                    operations = false;
                    System.exit(0);
                default:
                  // code block
              }

        }
        

    }

   


}

