package com.example.katiuskagonzalez.calculator.modelo;

public class Calcular {

    private double monto;
    private double tasa;
    private double couta;
    private double total = 0;

    public Calcular(double Monto, double Tasa, double Cuota){

        this.setMonto(Monto);
        this.setTasa(Tasa);
        this.setCouta(Cuota);
        this.setTotal();
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa / 100;
    }

    public double getCouta() {
        return couta;
    }

    public void setCouta(double couta) {
        this.couta = (getMonto() * getTasa()) * couta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = getCouta();
    }
}
