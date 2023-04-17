public class App {
    public static void main(String[] args) throws Exception {
        
        IngressoVip ingressoVip = new IngressoVip("Coachella", 
        200.00, 50.00);

        ingressoVip.info();

        System.out.println("-------------------------------");
        
        Ingresso ingresso = new Ingresso("Tomorrowland", 100.00);
        ingresso.info();
    }
}
