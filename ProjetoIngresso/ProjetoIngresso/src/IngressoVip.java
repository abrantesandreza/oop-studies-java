public class IngressoVip extends Ingresso {
    
    public double adicional;

    public IngressoVip() {
    }

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Adicional: " + adicional + " dollars");
        System.out.println("Total ingresso: " + (valor + adicional) + " dollars");
    }

}
