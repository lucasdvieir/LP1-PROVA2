import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteConsulta {
    public static void main(String[] args) {
        PrintWriter arquivoSaida = null;
        try {
            arquivoSaida = new PrintWriter(new FileWriter("Saídas_TesteConsulta.txt"));

            ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 6, 2023, "João", "Dr. Silva");
            exibirPropriedades(p1);
            gravarPropriedades(p1, arquivoSaida);

            ConsultaAgendada p2 = new ConsultaAgendada();
            exibirPropriedades(p2);
            gravarPropriedades(p2, arquivoSaida);

            // Alterando as propriedades de p1 usando os métodos set
            p1.setData();
            p1.setHora();
            p1.setNomePaciente();
            p1.setNomeMedico();
            exibirPropriedades(p1);
            gravarPropriedades(p1, arquivoSaida);

            System.out.println("Quantidade final de consultas: " + p1.getAmostra());
            if (arquivoSaida != null) {
                arquivoSaida.println("Quantidade final de consultas: " + p1.getAmostra());
            }

            System.out.println("Saídas gravadas com sucesso no arquivo Saídas_TesteConsulta.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (arquivoSaida != null) {
                arquivoSaida.close();
            }
        }
    }

    private static void exibirPropriedades(ConsultaAgendada consulta) {
        System.out.println("Data: " + consulta.getData());
        System.out.println("Hora: " + consulta.getHora());
        System.out.println("Nome do Paciente: " + consulta.getNomePaciente());
        System.out.println("Nome do Médico: " + consulta.getNomeMedico());
        System.out.println();
    }

    private static void gravarPropriedades(ConsultaAgendada consulta, PrintWriter arquivoSaida) {
        if (arquivoSaida != null) {
            arquivoSaida.println("Data: " + consulta.getData());
            arquivoSaida.println("Hora: " + consulta.getHora());
            arquivoSaida.println("Nome do Paciente: " + consulta.getNomePaciente());
            arquivoSaida.println("Nome do Médico: " + consulta.getNomeMedico());
            arquivoSaida.println();
        }
    }
}
