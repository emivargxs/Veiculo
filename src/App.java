import java.util.Scanner;
public class App{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a placa: ");
        String placa = entrada.nextLine();

        System.out.println("Digite o combustivel no tanque: ");
        double combustivel = entrada.nextDouble();  

        System.out.println("Distancia percorrida: ");
        double distancia = entrada.nextDouble();

        Veiculo carro = new Veiculo(new Placa(placa,""));
        carro.abastece(combustivel); 
        System.out.println("Placa: "+carro.getPlaca());
        System.out.println("Distancia percorrida: "+carro.dirige(distancia));
        System.out.println("Combustivel no tanque: "+carro.getCombustivelNoTanque());
        entrada.close();
        
        }
}