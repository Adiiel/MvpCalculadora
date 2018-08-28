package pe.edu.upeu.mvp;

public interface Main {
    public interface Vista{
        public void mostrarResultado(String r);
        public void mostrarSuma(String s);
        public void mostrarResta(String e);
    }
    public interface Presentador{
        public void mostrarResultado(String r);
        public void calcularFactorial(String n);
        public void mostrarSuma(String s);
        public void calcularSuma(String p,String i);
        public void mostrarResta(String e);
        public void calcularResta(String a, String b);
    }
    public interface Modelo{
        public void calcularFactorial(String n);
        public void calcularSuma(String p,String i);
        public void calcularResta(String a,String b);


    }

}
