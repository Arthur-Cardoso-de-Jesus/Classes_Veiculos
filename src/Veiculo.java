public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Getter e Setter
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método
    public abstract String informacoesVeiculo();
}
