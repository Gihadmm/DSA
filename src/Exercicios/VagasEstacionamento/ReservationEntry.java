package Exercicios.VagasEstacionamento;

public class ReservationEntry {

    private String nome;
    private int placa;

    public ReservationEntry(String nome, int placa) {
        this.nome = nome;
        this.placa = placa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
