package padroesestruturais.bridge;

public class Treinador extends Cargo {

    private int numAulas;

    public Treinador(float salarioBase) {
        super(salarioBase);
    }

    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numAulas * (1 + this.escolaridade.percentualAumento());
    }
}
