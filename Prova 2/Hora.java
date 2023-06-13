import java.util.Scanner;

public class Hora {
  private int hora;
  private int min;
  private int seg;

  public Hora() {
    Scanner scan = new Scanner(System.in);
    do {
      System.out.print("Digite a hora: ");
      this.hora = scan.nextInt();
    } while (this.hora < 0 || this.hora > 23);

    do {
      System.out.print("Digite o minuto: ");
      this.min = scan.nextInt();
    } while (this.min < 0 || this.min > 59);

    do {
      System.out.print("Digite o segundo: ");
      this.seg = scan.nextInt();
    } while (this.seg < 0 || this.seg > 59);
  }

  public Hora(int h, int m, int s) {
    this.hora = h;
    this.min = m;
    this.seg = s;

    if(this.hora < 0 || this.hora > 23){
    this.hora = 00;
    this.min = 00;
    this.seg = 00;
    System.out.println("Hora inválida! Insira novamente de forma manual!");
    }

    if(this.min < 0 || this.min > 59){
    this.hora = 00;
    this.min = 00;
    this.seg = 00;
    System.out.println("Hora inválida! Insira novamente de forma manual!");
    }

    if(this.seg < 0 || this.seg > 59){
    this.hora = 00;
    this.min = 00;
    this.seg = 00;
    System.out.println("Hora inválida! Insira novamente de forma manual!");
    }
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public void setSeg(int seg) {
    this.seg = seg;
  }

  public void setHora() {
    Scanner scan = new Scanner(System.in);
    do {
      System.out.print("Digite a hora: ");
      this.hora = scan.nextInt();
    } while (this.hora < 0 || this.hora > 23);
  }

  public void setMin() {
    Scanner scan = new Scanner(System.in);
    do {
      System.out.print("Digite o minuto: ");
      this.min = scan.nextInt();
    } while (this.min < 0 || this.min > 59);
  }

  public void setSeg() {
    Scanner scan = new Scanner(System.in);
    do {
      System.out.print("Digite o segundo: ");
      this.seg = scan.nextInt();
    } while (this.seg < 0 || this.seg > 59);
  }

  public int getHora() {
    return this.hora;
  }

  public int getMin() {
    return this.min;
  }

  public int getSeg() {
    return this.seg;
  }

  public String getHora1() {
    String horaStr = String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    return horaStr;
  }

  public String getHora2() {
    String sufixo = this.hora >= 12 ? "PM" : "AM";
    int horaFormato12 = this.hora % 12 == 0 ? 12 : this.hora % 12;
    String horaStr = String.format("%02d:%02d:%02d %s", horaFormato12, this.min, this.seg, sufixo);
    return horaStr;
  }

  public int getSegundos() {
    int totalSegundos = this.hora * 3600 + this.min * 60 + this.seg;
    return totalSegundos;
  }
}
