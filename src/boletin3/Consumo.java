package boletin3;

public class Consumo {

    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo() {

    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;

    }

    public float getkm() {
        return km;
    }

    public float getlitros() {
        return litros;
    }

    public float vMed() {
        return vMed;
    }

    public float pGas() {
        return pGas;
    }

    public float getTempo() {
        return km / vMed;
    }

    public float consumoMedio() {
        return litros / km;
    }
}
