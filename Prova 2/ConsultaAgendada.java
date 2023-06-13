import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();
        this.nomePaciente = "";
        this.nomeMedico = "";
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String n) {
        this.data = new Data(d, m, a);
        this.hora = new Hora(h, mi, s);
        this.nomePaciente = p;
        this.nomeMedico = n;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    public void setData(int a, int b, int c) {
        this.data.setDia(a);
        this.data.setMes(b);
        this.data.setAno(c);
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    public void setHora(int a, int b, int c) {
        this.hora.setHora(a);
        this.hora.setMin(b);
        this.hora.setSeg(c);
    }

    public void setHora() {
        this.hora.setHora();
        this.hora.setMin();
        this.hora.setSeg();
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scan.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = scan.nextLine();
    }

    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return this.data.mostra1();
    }

    public String getHora() {
        return this.hora.getHora1();
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
}
