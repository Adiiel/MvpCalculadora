package pe.edu.upeu.mvp;

public class FactorialModel implements Main.Modelo{
    private  Main.Presentador presentador;

    public  FactorialModel(Main.Presentador presentador){
    this.presentador= presentador;
    }
    @Override
    public void calcularFactorial(String n) {
        int fac = 1;
        if(!n.equals("")) {
            //calculo de factorial
            int x= Integer.parseInt(n);
            for (int i= 1;i<=x;i++){
                fac = fac*i;
            }
            presentador.mostrarResultado(String.valueOf(fac));

        }else{
            //mostrar mensaje
        }

    }

    @Override
    public void calcularSuma(String p, String i) {
        int suma;
        if (!p.equals("") && !i.equals("")){
            int x = Integer.parseInt(p);
            int y = Integer.parseInt(i);
            suma =x+y;
            presentador.mostrarSuma(String.valueOf(suma));
        }

    }

    @Override
    public void calcularResta(String a, String b) {
        int resta;
        if (!a.equals("")&& !b.equals("")){
            int x = Integer.parseInt(a);
            int y= Integer.parseInt(b);
            resta = x-y;
            presentador.mostrarSuma(String.valueOf(resta));
        }
    }
}

