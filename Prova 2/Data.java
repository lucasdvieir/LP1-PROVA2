import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 18;
        this.mes = 03;
        this.ano = 1993;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia() {
        boolean ok = true;
        Scanner scan = new Scanner(System.in);
        while (ok) {
            System.out.println("Digite o dia: ");
            int d = scan.nextInt();
            if (d >= 1 && d <= 31) {
                ok = false;
                this.dia = d;
            } else {
                System.out.println("Valor inválido, tente novamente!");
            }
        }
    }

    public void setMes() {
        boolean ok = true;
        Scanner scan = new Scanner(System.in);
        while (ok) {
            System.out.println("Digite o mês: ");
            int m = scan.nextInt();
            if (m >= 1 && m <= 12) {
                ok = false;
                this.mes = m;
            } else {
                System.out.println("Valor inválido, tente novamente!");
            }
        }
    }

    public void setAno() {
        boolean ok = true;
        Scanner scan = new Scanner(System.in);
        while (ok) {
            System.out.println("Digite o ano: ");
            int a = scan.nextInt();
            if (a >= 1000 && a <= 3000) {
                ok = false;
                this.ano = a;
            } else {
                System.out.println("Valor inválido, tente novamente!");
            }
        }
    }

    public String mostra1() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        String str = this.dia + "/" + this.mes + "/" + this.ano;
        try {
            Date d = dateFormat.parse(str);
            calendar.setTime(d);
            str = dateFormat.format(calendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public String mostra2() {
        String[] meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String mesExtenso = meses[this.mes];

        return String.format("%02d de %s de %04d", this.dia, mesExtenso, this.ano);
    }

    public boolean bissexto() {
        boolean bissexto = false;
        if (this.ano % 4 == 0) {
            bissexto = true;
        }
        return bissexto;
    }

    public int diasTranscorridos() {
        LocalDate dataFinal = LocalDate.of(this.ano, this.mes, this.dia);
        LocalDate dataInicial = LocalDate.of(this.ano, 1, 1);
        return (int) ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }

    public void apresentaDataAtual() {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str = dateFormat.format(today);
        System.out.println("A data atual é " + str);
    }
}
