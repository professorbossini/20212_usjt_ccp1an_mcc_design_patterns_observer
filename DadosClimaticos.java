public class DadosClimaticos {
    private double temperatura, umidade, pressao;
    private CondicoesAtuaisDisplay condicoesAtuaisDisplay;
    private EstatisticasDisplay estatisticasDisplay;
    private PrevisoesDisplay previsoesDisplay;
    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public double getPressao() {
        return pressao;
    }

    public void dadosAlterados(){
        condicoesAtuaisDisplay.atualizar(
            getTemperatura(),
            getUmidade(),
            getPressao()
        );

        estatisticasDisplay.atualizar(
            getTemperatura(),
            getUmidade(),
            getPressao()
        );

        previsoesDisplay.atualizar(
            getTemperatura(),
            getUmidade(),
            getPressao()
        );
    }
}