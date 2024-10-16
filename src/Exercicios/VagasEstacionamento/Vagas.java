package Exercicios.VagasEstacionamento;

public class Vagas {

    int totalVagas;
    static int VagasOcupadas;

    ReservationEntry[] parkingSlots = new ReservationEntry[15];


    public void Add(String nome, int placa){
        if(VagasOcupadas - 1 == totalVagas){
            System.out.println("Sem vagas disponiveis");

        }else{
            ReservationEntry NovaEntrada = new ReservationEntry(nome, placa);
            parkingSlots[totalVagas] = NovaEntrada;

            VagasOcupadas++;
        }



    }

    protected void Order(int vaga){
        if(vaga == totalVagas){
            throw new RuntimeException("Estacionamento Cheio.");
        }
        for(int i = vaga; i <= VagasOcupadas - 1; i++){
            parkingSlots[i] = parkingSlots[i+1];

        }
    }

    protected int Search(int placa){

        for(int i = 0; i <= VagasOcupadas - 1; i++){
            if(parkingSlots[i].getPlaca() == placa){
                return i;
            }
        }

        throw new RuntimeException("Cliente Não encontrado");
    }

    public void Remove(int placa){
        if(VagasOcupadas  == 0){
            throw new RuntimeException("Estacionamento Vazio");
        } else {
            int vaga = Search(placa);
            parkingSlots[vaga] = null;
            VagasOcupadas--;
            Order(vaga);
            System.out.println("Vaga removida com sucesso");
        }
    }



    public void Show(){
        System.out.println(toString());
        System.out.println("Número de Vagas Ocupadas: " + VagasOcupadas);
        System.out.println("Vagas disponiveis: " + totalVagas);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
