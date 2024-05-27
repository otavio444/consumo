public class Main {
  public static void main(String[] args) {
    System.out.println(" #############################################");
    System.out.print("## Programa para calcular o consumo elétrico ## ");
System.out.println("#############################################");
    System.out.println();
    System.out.println("Uma tv de 200w fica ligada por aproximadamente 5h por dia, Determine o consumo elétrico mensal da tv");
    System.out.println();
    System.out.println("a potência do aparelho é de:");
    int potencia = 200;
    System.out.println();
    System.out.println("#####");
    System.out.println("#"+potencia+"#");
    System.out.println("#####");
    System.out.println();
    System.out.println("o tempo de uso do aparelho é de:");
    int tempo = 5;
    System.out.println();
    System.out.println("###");
    System.out.println("#"+tempo+"#");
    System.out.println("###");
    System.out.println();
    int mes = 30;
    int consumo = potencia * tempo * mes /1000;
    System.out.println("o consumo da tv é de:");
    System.out.println();
    System.out.println("####");
    System.out.println("#"+consumo+"#");
    System.out.println("####");
  }


}