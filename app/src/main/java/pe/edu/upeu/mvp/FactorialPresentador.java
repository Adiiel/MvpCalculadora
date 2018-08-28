package pe.edu.upeu.mvp;

import android.view.View;

public class FactorialPresentador implements Main.Presentador {
    private Main.Modelo model;
    private Main.Vista vista;
    public FactorialPresentador(Main.Vista vista){
        this.vista = vista;
        model = new FactorialModel(this);

    }
    @Override
    public void mostrarResultado(String r) {
        if(vista !=null){
            vista.mostrarResultado(r);
        }
    }

    @Override
    public void calcularFactorial(String n) {
        if(vista !=null){
            model.calcularFactorial(n);
    }
    }

    @Override
    public void mostrarSuma(String s) {
        if (vista !=null){
            vista.mostrarSuma(s);
        }
    }

    @Override
    public void calcularSuma(String p, String i) {
        if (vista !=null){
            model.calcularSuma(p,i);
    }
    }

    @Override
    public void mostrarResta(String e) {
        if (vista!=null){
            vista.mostrarResta(e);
        }
    }

    @Override
    public void calcularResta(String a, String b) {
        if (vista !=null){
            model.calcularResta(a,b);
        }

    }
}
